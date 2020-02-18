package com.cg.delightOrder.dto;

import java.time.LocalDate;
import java.util.Date;

public class UpdatedTable extends Object
{
	String orderId;
	String name;
	double price_per_unit;
	double quantityValue;
	double quantityUnits;
	double price;
	String warehouseId;
	LocalDate deliveryDate;
	LocalDate manufDate;
	LocalDate expiryDate;
	LocalDate processDate;
	String qualityCheck;
	

	public UpdatedTable(String orderId, String name, double price_per_unit, double quantityValue,
			double quantityUnits,
			double price, String warehouseId, LocalDate deliveryDate, LocalDate manufDate,
			LocalDate expiryDate,
			LocalDate processDate, String qualityCheck) 
	{
		super();
		this.orderId = orderId;
		this.name = name;
		this.price_per_unit = price_per_unit;
		this.quantityValue = quantityValue;
		this.quantityUnits = quantityUnits;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufDate = manufDate;
		this.expiryDate = expiryDate;
		this.processDate = processDate;
		this.qualityCheck = qualityCheck;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice_per_unit() {
		return price_per_unit;
	}


	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}


	public double getQuantityValue() {
		return quantityValue;
	}


	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}


	public double getQuantityUnits() {
		return quantityUnits;
	}


	public void setQuantityUnits(double quantityUnits) {
		this.quantityUnits = quantityUnits;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getWarehouseId() {
		return warehouseId;
	}


	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}


	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public LocalDate getManufDate() {
		return manufDate;
	}


	public void setManufDate(LocalDate manufDate) {
		this.manufDate = manufDate;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public LocalDate getProcessDate() {
		return processDate;
	}


	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}


	public String getQualityCheck() {
		return qualityCheck;
	}


	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}


	public String toString()
	{
		return "[OrderId ->"+orderId +"\name ->"+name+"\nprice_per_unit ->"+price_per_unit+"\nquantityValue->"+quantityValue+
				"\nquantityUnits->"+quantityUnits+"\n price->"+price+"\nwarehouseId->"+warehouseId
           +"\ndeliveryDate ->"+deliveryDate +"\nmanufDate ->"+manufDate+"\nexpiryDate ->"+expiryDate
         +"\nprocessDate ->"+processDate +"\nqualityCheck ->"+qualityCheck+"]";
		}	
}
