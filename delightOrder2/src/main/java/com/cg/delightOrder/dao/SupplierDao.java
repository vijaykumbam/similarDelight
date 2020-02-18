package com.cg.delightOrder.dao;

import java.util.List;

import com.cg.delightOrder.dto.SupplierBean;
import com.cg.delightOrder.dto.UpdatedTable;
import com.cg.delightOrder.util.Repo;

public class SupplierDao 
{
	Repo obj = new Repo();
	
	
	public SupplierBean ordertracking(String sd)
	{
		List<SupplierBean>supplierList = Repo.getSupplierlist();
		for(SupplierBean sq:supplierList)
		{
			if(sq.getSupperId().contentEquals(sd))
			{
				return sq;
			}
		}
		return null;
	}


	public boolean adduserToList(UpdatedTable userTable) 
	{
		return (obj.userAdded(userTable));
	}

	
	public boolean doesRawMaterialOrderIdExist(String orderId)
	{
		List<SupplierBean>supplierList = Repo.getSupplierlist();
		for(SupplierBean sb :supplierList)
		{
			if(sb.getSupperId().equals(orderId))
				return true;
		}
		return false;
		// TODO Auto-generated method stub
	}
	
}
