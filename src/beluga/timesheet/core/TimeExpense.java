package beluga.timesheet.core;


import org.compiere.model.MTimeExpense;
import org.compiere.model.MTimeExpenseLine;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

import beluga.timesheet.model.X_sb_Timesheet;


public class TimeExpense extends SvrProcess {
	
	final static int UOM_id = 101;
	
	int warehouse_id;
	int pricelist_id;
	X_sb_Timesheet timesheet;
	MTimeExpense timeExpense;
	MTimeExpenseLine line;
	int line_id, timeexpens_id;
	
	@Override
	protected void prepare() {
		
		for (ProcessInfoParameter p : getParameter()) {
			switch (p.getParameterName()) {
			case "M_Warehouse_ID": warehouse_id = p.getParameterAsInt(); break;
			case "M_PriceList_ID": pricelist_id = p.getParameterAsInt(); break;
			}
		}

		timesheet = new X_sb_Timesheet(getCtx(), getRecord_ID(), get_TrxName());
		line_id = 0;
		timeexpens_id = 0;
	}

	@Override
	protected String doIt() throws Exception {
		
		line_id = new Query(getCtx(), MTimeExpenseLine.Table_Name, "sb_timesheet_id = " + timesheet.get_ID(), null).firstId();
		
		if (line_id != 0 && line_id != -1) {
			
			line = new MTimeExpenseLine(getCtx(), line_id, get_TrxName());
			
			line.setIsActive(timesheet.isActive());
			line.setC_UOM_ID(UOM_id);
			line.setQty(timesheet.getbilltime());
			line.setC_Project_ID(timesheet.getC_Project_ID());
			line.setDateExpense(timesheet.getStartTime());
			line.setC_BPartner_ID(timesheet.getC_BPartner_ID());
			line.setIsInvoiced(timesheet.istimesheet_abrechen());
	
			line.saveEx();
			
			timesheet.setS_TimeExpenseLine_ID(timeexpens_id);
			
			timesheet.saveEx();
						
			return "@OK@";
		}
			
		timeexpens_id = new Query(getCtx(), MTimeExpense.Table_Name,
				"datereport = '" + timesheet.getStartTime().toString().substring(0, 10) + 
				"' and c_bpartner_id = " + timesheet.getAD_User().getC_BPartner_ID() , null).firstId();

		if(timeexpens_id != 0 && timeexpens_id != -1) {
			
			line = new MTimeExpenseLine(getCtx(), 0, get_TrxName());
			
			line.setS_TimeExpense_ID(timeexpens_id);
			line.setIsTimeReport(true);
			line.set_ValueOfColumn("sb_timesheet_ID", timesheet.get_ID());
			line.setIsActive(timesheet.isActive());
			line.setC_UOM_ID(UOM_id);
			line.setQty(timesheet.getbilltime());
			line.setC_Project_ID(timesheet.getC_Project_ID());
			line.setDateExpense(timesheet.getStartTime());
			line.setC_BPartner_ID(timesheet.getC_BPartner_ID());
			line.setIsInvoiced(timesheet.istimesheet_abrechen());
			
			line.saveEx();
			
			timesheet.setS_TimeExpenseLine_ID(timeexpens_id);
			
			timesheet.saveEx();
			
			return "@OK@";
			
		}

		
		timeExpense = new MTimeExpense(getCtx(), 0, get_TrxName());
		
		timeExpense.setAD_Org_ID(timesheet.getAD_Org_ID());
		timeExpense.setC_BPartner_ID(timesheet.getAD_User().getC_BPartner_ID());
		timeExpense.setDateReport(timesheet.getStartTime());
		timeExpense.setM_PriceList_ID(pricelist_id); 
		timeExpense.setM_Warehouse_ID(warehouse_id);
		timeExpense.setDocStatus("DR");
		timeExpense.setDocAction("CO");
		
		timeExpense.saveEx();
		
			
		line = new MTimeExpenseLine(getCtx(), 0, get_TrxName());
		
		line.setS_TimeExpense_ID(timeExpense.get_ID());
		line.setIsTimeReport(true);
		line.set_ValueOfColumn("sb_timesheet_ID", timesheet.get_ID());
		line.setIsActive(timesheet.isActive());
		line.setC_UOM_ID(UOM_id);
		line.setQty(timesheet.getbilltime());
		line.setC_Project_ID(timesheet.getC_Project_ID());
		line.setDateExpense(timesheet.getStartTime());
		line.setC_BPartner_ID(timesheet.getC_BPartner_ID());
		line.setIsInvoiced(timesheet.istimesheet_abrechen());
		
		line.saveEx();
		
		timesheet.setS_TimeExpenseLine_ID(line.getS_TimeExpenseLine_ID());
		
		timesheet.saveEx();

		return "@OK@";
	}

}
