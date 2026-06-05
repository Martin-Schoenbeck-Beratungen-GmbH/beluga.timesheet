package beluga.timesheet.core;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;

import org.compiere.process.SvrProcess;

import beluga.timesheet.model.X_sb_Timesheet;

public class Timesheet extends SvrProcess  {


	int record_id;
	String name;
	X_sb_Timesheet timesheet;
	@Override
	protected void prepare() {
		record_id = getRecord_ID();
		name = getName();
		timesheet = new X_sb_Timesheet(getCtx(), record_id, get_TrxName());
	}


	@Override
	protected String doIt() throws Exception { 
		if (timesheet.getStartTime().after(timesheet.getEndTime())){
			return "Startzeit ist nach der Endzeit";
		}
		timesheet.settimespend(getTimeSpend());
		
		switch(getName()) {
		
		case "transfer Values" :
			transferValues(); break;
		case "roundDown15" :
			roundDown15(); break;
		case "roundDown30" :
			roundDown30(); break;
		case "roundUp15" :
			roundUp15(); break;
		case "roundUp30" :
			roundUp30(); break;
			
		}
		
		timesheet.saveEx();

		return "@OK@";
	}
	
	BigDecimal getTimeSpend() {

		Instant starttime = timesheet.getStartTime().toInstant();
		Instant endtime = timesheet.getEndTime().toInstant();
		
		double timespend = (double)Duration.between(starttime, endtime).toMinutes() / 60;
		return BigDecimal.valueOf(timespend);
		
	}

	
	void transferValues() {
	
		timesheet.settimesheet_billstarttime(timesheet.getStartTime());
		timesheet.settimesheet_billendtime(timesheet.getEndTime());
		timesheet.setbilltime(getTimeSpend());
		timesheet.saveEx();
	}
	
	void roundUp15() {
		
		Instant startbilltime = timesheet.getStartTime().toInstant();
		Instant endbilltime = timesheet.getEndTime().toInstant();

		double billtime = (double)Duration.between(startbilltime, endbilltime).toMinutes() / 60;
		double billhours = billtime + 0.25 - billtime % 0.25;
		timesheet.setbilltime(BigDecimal.valueOf(billhours));

		endbilltime = startbilltime.plusSeconds((long)(billhours * 3600));
		
		Timestamp finalendbilltime = Timestamp.from(endbilltime);
		
		timesheet.settimesheet_billstarttime(timesheet.getStartTime());
		timesheet.settimesheet_billendtime(finalendbilltime);	
		timesheet.saveEx();

	}
	
	void roundUp30() {
		
		Instant startbilltime = timesheet.getStartTime().toInstant();
		Instant endbilltime = timesheet.getEndTime().toInstant();
		
		double billtime = (double)Duration.between(startbilltime, endbilltime).toMinutes() / 60;
		double billhours = billtime + 0.5 - billtime % 0.5;
		timesheet.setbilltime(BigDecimal.valueOf(billhours));

		endbilltime = startbilltime.plusSeconds((long)(billhours * 3600));
		
		Timestamp finalendbilltime = Timestamp.from(endbilltime);
		
		timesheet.settimesheet_billstarttime(timesheet.getStartTime());
		timesheet.settimesheet_billendtime(finalendbilltime);	
		timesheet.saveEx();
		
		
	}
	
	void roundDown15() {
		
		Instant startbilltime = timesheet.getStartTime().toInstant();
		Instant endbilltime = timesheet.getEndTime().toInstant();
		
		double billtime = (double)Duration.between(startbilltime, endbilltime).toMinutes() / 60;
		double billhours = billtime - billtime % 0.25;
		timesheet.setbilltime(BigDecimal.valueOf(billhours));

		endbilltime = startbilltime.plusSeconds((long)(billhours * 3600));
		
		Timestamp finalendbilltime = Timestamp.from(endbilltime);
		
		timesheet.settimesheet_billstarttime(timesheet.getStartTime());
		timesheet.settimesheet_billendtime(finalendbilltime);	
		timesheet.saveEx();

		}
	
	void roundDown30() {
		
		Instant startbilltime = timesheet.getStartTime().toInstant();
		Instant endbilltime = timesheet.getEndTime().toInstant();
		
		double billtime = (double)Duration.between(startbilltime, endbilltime).toMinutes() / 60;
		double billhours = billtime - billtime % 0.5;
		timesheet.setbilltime(BigDecimal.valueOf(billhours));

		endbilltime = startbilltime.plusSeconds((long)(billhours * 3600));
		
		Timestamp finalendbilltime = Timestamp.from(endbilltime);
		
		timesheet.settimesheet_billstarttime(timesheet.getStartTime());
		timesheet.settimesheet_billendtime(finalendbilltime);	
		timesheet.saveEx();
		
	}
}
