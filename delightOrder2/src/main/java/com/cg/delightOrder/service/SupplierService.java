package com.cg.delightOrder.service;
import java.util.Scanner;
import com.cg.delightOrder.dao.SupplierDao;
import com.cg.delightOrder.dto.SupplierBean;
import com.cg.delightOrder.dto.UpdatedTable;
import com.cg.delightOrder.exception.InvalidRawMaterialOrderId;

public class SupplierService 
{

	Scanner sc=new Scanner(System.in);
	SupplierDao obj = new SupplierDao();
	
	public SupplierBean ordertracking(String sd)
	{
		SupplierBean s = obj.ordertracking(sd);
		if(s!=null)
			return s;
		else
			return null;
	}
	
	public boolean addRawMaterialToList(UpdatedTable userTable) 
	{
		return (obj.adduserToList(userTable));
	}

	
	public boolean doesRawMaterialOrderIdExist(String orderId) throws InvalidRawMaterialOrderId
	{
		boolean res = obj.doesRawMaterialOrderIdExist(orderId);
		try
		{
			if(res==false)
			{
				throw new InvalidRawMaterialOrderId("invalidrawmaterial");
			}
		}
		catch(InvalidRawMaterialOrderId e)
		{
			e.printStackTrace();
		}
		return (obj.doesRawMaterialOrderIdExist(orderId)) ;		
	}

	
}
