package com.cg.delightOrder.ui;

import java.util.Scanner;
import com.cg.delightOrder.dto.SupplierBean;
import com.cg.delightOrder.exception.InvalidRawMaterialOrderId;
import com.cg.delightOrder.service.SupplierService;

public class Main {

	public static void main(String[] args) throws InvalidRawMaterialOrderId
	{
		SupplierService obj= new SupplierService();
		while(true)
		{
		System.out.println("Enter the chooice\n1->Does trackId exist \n2->RawMaterial details \n3-Update the Raw Material stock");
		Scanner sc = new Scanner(System.in);
		int sw = sc.nextInt();
				switch(sw)
				{
				case 1:
				{
					System.out.println("Dose RawMaterial OrderExist functionality");
					String orderId = sc.next();
					boolean resu = obj.doesRawMaterialOrderIdExist(orderId);
					System.out.println(resu);
					System.out.println("=================================");
					break;	
				}
				case 2:
					{
						System.out.println("Enter the trackingId");
						String  sd = sc.next();
						//SupplierService obj = new SupplierService();
						SupplierBean  se = obj.ordertracking(sd);
						System.out.println(se);
						System.out.println("=================================");
						break;
					}
				case 3:
				{
					System.out.println("Enter the trackingId to update");
					break;
				}
				default:
				{
					System.out.println("default");
					break;
				}
				}
	}}

}
