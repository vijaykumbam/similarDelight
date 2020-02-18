package com.cg.delightOrder.dto;

public class SupplierBean extends Object
{
	String SupplierName;
	String SupperId;
	String WarehouseId;
	String RawMaterialName;
	double price;
	double price_per_unit;
	double quantity_Unit;
	double quantity_Value;
	
	public SupplierBean(String supplierName, String supperId, String warehouseId, String rawMaterialName, double price,
			double price_per_unit, double quantity_Unit, double quantity_Value) 
	{
		this.SupplierName = supplierName;
		this.SupperId = supperId;
		this.WarehouseId = warehouseId;
		this.RawMaterialName = rawMaterialName;
		this.price = price;
		this.price_per_unit = price_per_unit;
		this.quantity_Unit = quantity_Unit;
		this.quantity_Value = quantity_Value;
	}
	
	
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupperId() {
		return SupperId;
	}
	public void setSupperId(String supperId) {
		SupperId = supperId;
	}
	public String getWarehouseId() {
		return WarehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		WarehouseId = warehouseId;
	}
	public String getRawMaterialName() {
		return RawMaterialName;
	}
	public void setRawMaterialName(String rawMaterialName) {
		RawMaterialName = rawMaterialName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public double getQuantity_Unit() {
		return quantity_Unit;
	}
	public void setQuantity_Unit(double quantity_Unit) {
		this.quantity_Unit = quantity_Unit;
	}
	public double getQuantity_Value() {
		return quantity_Value;
	}
	public void setQuantity_Value(double quantity_Value) {
		this.quantity_Value = quantity_Value;
	}
	public String toString()
	{
		return "SupplierName ->"+SupplierName +"\nSupperId ->" +SupperId+"\nWarehouseId ->"+WarehouseId+"\nRawMaterialName->"+RawMaterialName+
				"\nprice->"+price+"\nprice_per_unit->"+price_per_unit+"\nquantity_Unit>"+quantity_Unit+"\nquantity_Value->"+quantity_Value;
		
	}
}
