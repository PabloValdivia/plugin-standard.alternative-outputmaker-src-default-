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
package org.output.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_OrderOutput
 *  @author iDempiere (generated) 
 *  @version Release 3.1 - $Id$ */
public class X_C_OrderOutput extends PO implements I_C_OrderOutput, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20151203L;

    /** Standard Constructor */
    public X_C_OrderOutput (Properties ctx, int C_OrderOutput_ID, String trxName)
    {
      super (ctx, C_OrderOutput_ID, trxName);
      /** if (C_OrderOutput_ID == 0)
        {
			setC_OrderOutput_ID (0);
			setC_Order_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_C_OrderOutput (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_OrderOutput[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Order Output.
		@param C_OrderOutput_ID Order Output	  */
	public void setC_OrderOutput_ID (int C_OrderOutput_ID)
	{
		if (C_OrderOutput_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_OrderOutput_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_OrderOutput_ID, Integer.valueOf(C_OrderOutput_ID));
	}

	/** Get Order Output.
		@return Order Output	  */
	public int getC_OrderOutput_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OrderOutput_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_OrderOutput_UU.
		@param C_OrderOutput_UU C_OrderOutput_UU	  */
	public void setC_OrderOutput_UU (String C_OrderOutput_UU)
	{
		set_Value (COLUMNNAME_C_OrderOutput_UU, C_OrderOutput_UU);
	}

	/** Get C_OrderOutput_UU.
		@return C_OrderOutput_UU	  */
	public String getC_OrderOutput_UU () 
	{
		return (String)get_Value(COLUMNNAME_C_OrderOutput_UU);
	}

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Order_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Description.
		@param Text Description	  */
	public void setText (String Text)
	{
		set_Value (COLUMNNAME_Text, Text);
	}

	/** Get Description.
		@return Description	  */
	public String getText () 
	{
		return (String)get_Value(COLUMNNAME_Text);
	}
}