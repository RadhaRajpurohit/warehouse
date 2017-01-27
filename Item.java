package com.manhpack9;

import java.util.Date;

public class Item {
	private int itemCode;
	private  String itemName;
	private double price;
	private String location;
	private String unit;
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private int beginningInventory;
	private int  quantity;
	private String category;
	private Warehouse warehouse_location;
	public int getItemCode() {
		return itemCode;
	}
	public Item(int itemCode, String itemName, double price, String location, String unit, Date dateOfManufacture,
			Date dateOfExpiry, int beginningInventory, int quantity, String category, Warehouse warehouse_location) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.location = location;
		this.unit = unit;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.beginningInventory = beginningInventory;
		this.quantity = quantity;
		this.category = category;
		this.warehouse_location = warehouse_location;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public int getBeginningInventory() {
		return beginningInventory;
	}
	public void setBeginningInventory(int beginningInventory) {
		this.beginningInventory = beginningInventory;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Warehouse getWarehouse_location() {
		return warehouse_location;
	}
	public void setWarehouse_location(Warehouse warehouse_location) {
		this.warehouse_location = warehouse_location;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", location=" + location
				+ ", unit=" + unit + ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry
				+ ", beginningInventory=" + beginningInventory + ", quantity=" + quantity + ", category=" + category
				+ ", warehouse_location=" + warehouse_location + "]";
	}
	
	
}

	


