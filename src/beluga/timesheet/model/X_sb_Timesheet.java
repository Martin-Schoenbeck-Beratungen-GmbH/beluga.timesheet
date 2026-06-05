/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package beluga.timesheet.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for sb_Timesheet
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="sb_Timesheet")
public class X_sb_Timesheet extends PO implements I_sb_Timesheet, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20260603L;

    /** Standard Constructor */
    public X_sb_Timesheet (Properties ctx, int sb_Timesheet_ID, String trxName)
    {
      super (ctx, sb_Timesheet_ID, trxName);
      /** if (sb_Timesheet_ID == 0)
        {
			setAD_User_ID (0);
			setC_BPartner_ID (0);
			setsb_timesheet_ID (0);
			settimesheet_abrechen (true);
// Y
			settimesheet_ignore (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_sb_Timesheet (Properties ctx, int sb_Timesheet_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, sb_Timesheet_ID, trxName, virtualColumns);
      /** if (sb_Timesheet_ID == 0)
        {
			setAD_User_ID (0);
			setC_BPartner_ID (0);
			setsb_timesheet_ID (0);
			settimesheet_abrechen (true);
// Y
			settimesheet_ignore (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_sb_Timesheet (Properties ctx, String sb_Timesheet_UU, String trxName)
    {
      super (ctx, sb_Timesheet_UU, trxName);
      /** if (sb_Timesheet_UU == null)
        {
			setAD_User_ID (0);
			setC_BPartner_ID (0);
			setsb_timesheet_ID (0);
			settimesheet_abrechen (true);
// Y
			settimesheet_ignore (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_sb_Timesheet (Properties ctx, String sb_Timesheet_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, sb_Timesheet_UU, trxName, virtualColumns);
      /** if (sb_Timesheet_UU == null)
        {
			setAD_User_ID (0);
			setC_BPartner_ID (0);
			setsb_timesheet_ID (0);
			settimesheet_abrechen (true);
// Y
			settimesheet_ignore (false);
// N
        } */
    }

    /** Load Constructor */
    public X_sb_Timesheet (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_sb_Timesheet[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_Value (COLUMNNAME_AD_User_ID, null);
		else
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException
	{
		return (org.compiere.model.I_C_Project)MTable.get(getCtx(), org.compiere.model.I_C_Project.Table_ID)
			.getPO(getC_Project_ID(), get_TrxName());
	}

	/** Set Project.
		@param C_Project_ID Financial Project
	*/
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1)
			set_Value (COLUMNNAME_C_Project_ID, null);
		else
			set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
	}

	/** Get Project.
		@return Financial Project
	  */
	public int getC_Project_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments()
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Create TimeExpens.
		@param Create_TimeExpens Create TimeExpens
	*/
	public void setCreate_TimeExpens (String Create_TimeExpens)
	{
		set_Value (COLUMNNAME_Create_TimeExpens, Create_TimeExpens);
	}

	/** Get Create TimeExpens.
		@return Create TimeExpens	  */
	public String getCreate_TimeExpens()
	{
		return (String)get_Value(COLUMNNAME_Create_TimeExpens);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set End Time.
		@param EndTime End of the time span
	*/
	public void setEndTime (Timestamp EndTime)
	{
		set_Value (COLUMNNAME_EndTime, EndTime);
	}

	/** Get End Time.
		@return End of the time span
	  */
	public Timestamp getEndTime()
	{
		return (Timestamp)get_Value(COLUMNNAME_EndTime);
	}

	/** Set InternalComments.
		@param InternalComments InternalComments
	*/
	public void setInternalComments (String InternalComments)
	{
		set_Value (COLUMNNAME_InternalComments, InternalComments);
	}

	/** Get InternalComments.
		@return InternalComments	  */
	public String getInternalComments()
	{
		return (String)get_Value(COLUMNNAME_InternalComments);
	}

	public org.compiere.model.I_S_TimeExpenseLine getS_TimeExpenseLine() throws RuntimeException
	{
		return (org.compiere.model.I_S_TimeExpenseLine)MTable.get(getCtx(), org.compiere.model.I_S_TimeExpenseLine.Table_ID)
			.getPO(getS_TimeExpenseLine_ID(), get_TrxName());
	}

	/** Set Expense Line.
		@param S_TimeExpenseLine_ID Time and Expense Report Line
	*/
	public void setS_TimeExpenseLine_ID (int S_TimeExpenseLine_ID)
	{
		if (S_TimeExpenseLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_S_TimeExpenseLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_S_TimeExpenseLine_ID, Integer.valueOf(S_TimeExpenseLine_ID));
	}

	/** Get Expense Line.
		@return Time and Expense Report Line
	  */
	public int getS_TimeExpenseLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeExpenseLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Start Time.
		@param StartTime Time started
	*/
	public void setStartTime (Timestamp StartTime)
	{
		set_Value (COLUMNNAME_StartTime, StartTime);
	}

	/** Get Start Time.
		@return Time started
	  */
	public Timestamp getStartTime()
	{
		return (Timestamp)get_Value(COLUMNNAME_StartTime);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set billtime.
		@param billtime billtime
	*/
	public void setbilltime (BigDecimal billtime)
	{
		set_Value (COLUMNNAME_billtime, billtime);
	}

	/** Get billtime.
		@return billtime	  */
	public BigDecimal getbilltime()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_billtime);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set rounddown15.
		@param rounddown15 rounddown15
	*/
	public void setrounddown15 (String rounddown15)
	{
		set_Value (COLUMNNAME_rounddown15, rounddown15);
	}

	/** Get rounddown15.
		@return rounddown15	  */
	public String getrounddown15()
	{
		return (String)get_Value(COLUMNNAME_rounddown15);
	}

	/** Set rounddown30.
		@param rounddown30 rounddown30
	*/
	public void setrounddown30 (String rounddown30)
	{
		set_Value (COLUMNNAME_rounddown30, rounddown30);
	}

	/** Get rounddown30.
		@return rounddown30	  */
	public String getrounddown30()
	{
		return (String)get_Value(COLUMNNAME_rounddown30);
	}

	/** Set roundup15.
		@param roundup15 roundup15
	*/
	public void setroundup15 (String roundup15)
	{
		set_Value (COLUMNNAME_roundup15, roundup15);
	}

	/** Get roundup15.
		@return roundup15	  */
	public String getroundup15()
	{
		return (String)get_Value(COLUMNNAME_roundup15);
	}

	/** Set roundup30.
		@param roundup30 roundup30
	*/
	public void setroundup30 (String roundup30)
	{
		set_Value (COLUMNNAME_roundup30, roundup30);
	}

	/** Get roundup30.
		@return roundup30	  */
	public String getroundup30()
	{
		return (String)get_Value(COLUMNNAME_roundup30);
	}

	/** Set timesheet_ID.
		@param sb_timesheet_ID timesheet_ID
	*/
	public void setsb_timesheet_ID (int sb_timesheet_ID)
	{
		if (sb_timesheet_ID < 1)
			set_ValueNoCheck (COLUMNNAME_sb_timesheet_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_sb_timesheet_ID, Integer.valueOf(sb_timesheet_ID));
	}

	/** Get timesheet_ID.
		@return timesheet_ID	  */
	public int getsb_timesheet_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_sb_timesheet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set sb_timesheet_UU.
		@param sb_timesheet_UU sb_timesheet_UU
	*/
	public void setsb_timesheet_UU (String sb_timesheet_UU)
	{
		set_Value (COLUMNNAME_sb_timesheet_UU, sb_timesheet_UU);
	}

	/** Get sb_timesheet_UU.
		@return sb_timesheet_UU	  */
	public String getsb_timesheet_UU()
	{
		return (String)get_Value(COLUMNNAME_sb_timesheet_UU);
	}

	/** Set abrechnen.
		@param timesheet_abrechen abrechnen
	*/
	public void settimesheet_abrechen (boolean timesheet_abrechen)
	{
		set_Value (COLUMNNAME_timesheet_abrechen, Boolean.valueOf(timesheet_abrechen));
	}

	/** Get abrechnen.
		@return abrechnen	  */
	public boolean istimesheet_abrechen()
	{
		Object oo = get_Value(COLUMNNAME_timesheet_abrechen);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set billendtime.
		@param timesheet_billendtime billendtime
	*/
	public void settimesheet_billendtime (Timestamp timesheet_billendtime)
	{
		set_Value (COLUMNNAME_timesheet_billendtime, timesheet_billendtime);
	}

	/** Get billendtime.
		@return billendtime	  */
	public Timestamp gettimesheet_billendtime()
	{
		return (Timestamp)get_Value(COLUMNNAME_timesheet_billendtime);
	}

	/** Set billstarttime.
		@param timesheet_billstarttime billstarttime
	*/
	public void settimesheet_billstarttime (Timestamp timesheet_billstarttime)
	{
		set_Value (COLUMNNAME_timesheet_billstarttime, timesheet_billstarttime);
	}

	/** Get billstarttime.
		@return billstarttime	  */
	public Timestamp gettimesheet_billstarttime()
	{
		return (Timestamp)get_Value(COLUMNNAME_timesheet_billstarttime);
	}

	/** Set ignore.
		@param timesheet_ignore ignore
	*/
	public void settimesheet_ignore (boolean timesheet_ignore)
	{
		set_Value (COLUMNNAME_timesheet_ignore, Boolean.valueOf(timesheet_ignore));
	}

	/** Get ignore.
		@return ignore	  */
	public boolean istimesheet_ignore()
	{
		Object oo = get_Value(COLUMNNAME_timesheet_ignore);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set timespend.
		@param timespend timespend
	*/
	public void settimespend (BigDecimal timespend)
	{
		set_Value (COLUMNNAME_timespend, timespend);
	}

	/** Get timespend.
		@return timespend	  */
	public BigDecimal gettimespend()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_timespend);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set transfer values.
		@param transfer_values transfer values
	*/
	public void settransfer_values (String transfer_values)
	{
		set_Value (COLUMNNAME_transfer_values, transfer_values);
	}

	/** Get transfer values.
		@return transfer values	  */
	public String gettransfer_values()
	{
		return (String)get_Value(COLUMNNAME_transfer_values);
	}
}