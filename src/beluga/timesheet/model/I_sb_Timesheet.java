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
package beluga.timesheet.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for sb_Timesheet
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
@SuppressWarnings("all")
public interface I_sb_Timesheet 
{

    /** TableName=sb_Timesheet */
    public static final String Table_Name = "sb_Timesheet";

    /** AD_Table_ID=1000033 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

    /** Column name Comments */
    public static final String COLUMNNAME_Comments = "Comments";

	/** Set Comments.
	  * Comments or additional information
	  */
	public void setComments (String Comments);

	/** Get Comments.
	  * Comments or additional information
	  */
	public String getComments();

    /** Column name Create_TimeExpens */
    public static final String COLUMNNAME_Create_TimeExpens = "Create_TimeExpens";

	/** Set Create TimeExpens	  */
	public void setCreate_TimeExpens (String Create_TimeExpens);

	/** Get Create TimeExpens	  */
	public String getCreate_TimeExpens();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name EndTime */
    public static final String COLUMNNAME_EndTime = "EndTime";

	/** Set End Time.
	  * End of the time span
	  */
	public void setEndTime (Timestamp EndTime);

	/** Get End Time.
	  * End of the time span
	  */
	public Timestamp getEndTime();

    /** Column name InternalComments */
    public static final String COLUMNNAME_InternalComments = "InternalComments";

	/** Set InternalComments	  */
	public void setInternalComments (String InternalComments);

	/** Get InternalComments	  */
	public String getInternalComments();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name S_TimeExpenseLine_ID */
    public static final String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";

	/** Set Expense Line.
	  * Time and Expense Report Line
	  */
	public void setS_TimeExpenseLine_ID (int S_TimeExpenseLine_ID);

	/** Get Expense Line.
	  * Time and Expense Report Line
	  */
	public int getS_TimeExpenseLine_ID();

	public org.compiere.model.I_S_TimeExpenseLine getS_TimeExpenseLine() throws RuntimeException;

    /** Column name StartTime */
    public static final String COLUMNNAME_StartTime = "StartTime";

	/** Set Start Time.
	  * Time started
	  */
	public void setStartTime (Timestamp StartTime);

	/** Get Start Time.
	  * Time started
	  */
	public Timestamp getStartTime();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name billtime */
    public static final String COLUMNNAME_billtime = "billtime";

	/** Set billtime	  */
	public void setbilltime (BigDecimal billtime);

	/** Get billtime	  */
	public BigDecimal getbilltime();

    /** Column name rounddown15 */
    public static final String COLUMNNAME_rounddown15 = "rounddown15";

	/** Set rounddown15	  */
	public void setrounddown15 (String rounddown15);

	/** Get rounddown15	  */
	public String getrounddown15();

    /** Column name rounddown30 */
    public static final String COLUMNNAME_rounddown30 = "rounddown30";

	/** Set rounddown30	  */
	public void setrounddown30 (String rounddown30);

	/** Get rounddown30	  */
	public String getrounddown30();

    /** Column name roundup15 */
    public static final String COLUMNNAME_roundup15 = "roundup15";

	/** Set roundup15	  */
	public void setroundup15 (String roundup15);

	/** Get roundup15	  */
	public String getroundup15();

    /** Column name roundup30 */
    public static final String COLUMNNAME_roundup30 = "roundup30";

	/** Set roundup30	  */
	public void setroundup30 (String roundup30);

	/** Get roundup30	  */
	public String getroundup30();

    /** Column name sb_timesheet_ID */
    public static final String COLUMNNAME_sb_timesheet_ID = "sb_timesheet_ID";

	/** Set timesheet_ID	  */
	public void setsb_timesheet_ID (int sb_timesheet_ID);

	/** Get timesheet_ID	  */
	public int getsb_timesheet_ID();

    /** Column name sb_timesheet_UU */
    public static final String COLUMNNAME_sb_timesheet_UU = "sb_timesheet_UU";

	/** Set sb_timesheet_UU	  */
	public void setsb_timesheet_UU (String sb_timesheet_UU);

	/** Get sb_timesheet_UU	  */
	public String getsb_timesheet_UU();

    /** Column name timesheet_abrechen */
    public static final String COLUMNNAME_timesheet_abrechen = "timesheet_abrechen";

	/** Set abrechnen	  */
	public void settimesheet_abrechen (boolean timesheet_abrechen);

	/** Get abrechnen	  */
	public boolean istimesheet_abrechen();

    /** Column name timesheet_billendtime */
    public static final String COLUMNNAME_timesheet_billendtime = "timesheet_billendtime";

	/** Set billendtime	  */
	public void settimesheet_billendtime (Timestamp timesheet_billendtime);

	/** Get billendtime	  */
	public Timestamp gettimesheet_billendtime();

    /** Column name timesheet_billstarttime */
    public static final String COLUMNNAME_timesheet_billstarttime = "timesheet_billstarttime";

	/** Set billstarttime	  */
	public void settimesheet_billstarttime (Timestamp timesheet_billstarttime);

	/** Get billstarttime	  */
	public Timestamp gettimesheet_billstarttime();

    /** Column name timesheet_ignore */
    public static final String COLUMNNAME_timesheet_ignore = "timesheet_ignore";

	/** Set ignore	  */
	public void settimesheet_ignore (boolean timesheet_ignore);

	/** Get ignore	  */
	public boolean istimesheet_ignore();

    /** Column name timespend */
    public static final String COLUMNNAME_timespend = "timespend";

	/** Set timespend	  */
	public void settimespend (BigDecimal timespend);

	/** Get timespend	  */
	public BigDecimal gettimespend();

    /** Column name transfer_values */
    public static final String COLUMNNAME_transfer_values = "transfer_values";

	/** Set transfer values	  */
	public void settransfer_values (String transfer_values);

	/** Get transfer values	  */
	public String gettransfer_values();
}
