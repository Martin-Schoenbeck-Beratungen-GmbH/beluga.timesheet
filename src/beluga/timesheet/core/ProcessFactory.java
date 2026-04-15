package beluga.timesheet.core;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

public class ProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className)  {
		if ("beluga.timesheet.core.Process".equalsIgnoreCase(className)) {
			return new Timesheet() ;}
		else if ("beluga.timesheet.core.TimeExpense".equalsIgnoreCase(className)){
			return new TimeExpense();}
		return null;

	}

}
