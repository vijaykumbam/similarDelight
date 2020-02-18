package com.cg.delightOrder.util;

import java.util.ArrayList;
import com.cg.delightOrder.dto.SupplierBean;
import com.cg.delightOrder.dto.UpdatedTable;

public class Repo 
{
	private static ArrayList<SupplierBean> supplierlist = new ArrayList<SupplierBean>();
	public  static ArrayList<SupplierBean> getSupplierlist() 
	{
		return supplierlist;
	}
	public static void setSupplierlist(ArrayList<SupplierBean> supplierlist)
	{
		Repo.supplierlist = supplierlist;
	}

	public Repo()
	{
		SupplierBean  obj = new SupplierBean("vijayvenkat","sup11345","war12345","orange", 230, 230, 30, 011);
		SupplierBean obj1 = new SupplierBean("vijay","sup11345","war12345","grape", 230, 230, 30, 011);
		SupplierBean obj2 = new SupplierBean("venkat","sup112345","war12345","banana", 230, 230, 30, 011);
		SupplierBean obj3 = new SupplierBean("Ashritha","sup312345","war12345","kiwi", 230, 230, 30, 011);
		supplierlist.add(obj);
		supplierlist.add(obj1);
		supplierlist.add(obj2);
		supplierlist.add(obj3);	
		
		
		UpdatedTable obj4 = new UpdatedTable("rawId11606974", "orange", 20.0, 120, 20, 20, "VIJAYVENKATWARE",null, null, null,null, null);
		UpdatedTable obj5 = new UpdatedTable("rawId11606975", "orange", 20.0, 120, 20, 20, "VIJAYVENKATWARE",null, null, null,null, null);
		UpdatedTable obj6 = new UpdatedTable("rawId11606976", "orange", 20.0, 120, 20, 20, "VIJAYVENKATWARE",null, null, null,null, null);
		UpdatedTable obj7 = new UpdatedTable("rawId11606977", "orange", 20.0, 120, 20, 20, "VIJAYVENKATWARE",null, null, null,null, null);
		userTableList.add(obj4);
		userTableList.add(obj5);
		userTableList.add(obj6);
		userTableList.add(obj7);
		
	}
	
	//updated details with date and process ....List	
	static ArrayList<UpdatedTable> userTableList = new ArrayList<UpdatedTable>();
	public static ArrayList<UpdatedTable> getUserTableList()
	{
		return userTableList;
	}
	public static void setUserTableList(ArrayList<UpdatedTable> userTableList) 
	{
		Repo.userTableList = userTableList;
	}
	
	//user is added or not confirmation...........
	public boolean userAdded(UpdatedTable usertable)
	{
		userTableList.add(usertable);
		return true;
	}
	
	
}