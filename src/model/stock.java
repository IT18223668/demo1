package model;

public class stock {
	private int ItemNumber;
	private String ItemName;
	private String ItemType;
	private String BrandName;
	private String SupplierID;
	private String SupplierName;
	private String Price;
	private String Quantity;
	private String SetReOrderLevel;
	private String perTablet;
	private String perCard;
	
	public stock() {
		super();
	}

	public stock(int itemNumber, String itemName, String itemType, String brandName, String supplierID,
			String supplierName, String price, String quantity, String setReOrderLevel, String perTablet, String perCard) {
		super();
		ItemNumber = itemNumber;
		ItemName = itemName;
		ItemType = itemType;
		BrandName = brandName;
		SupplierID = supplierID;
		SupplierName = supplierName;
		Price = price;
		Quantity = quantity;
		SetReOrderLevel = setReOrderLevel;
		this.perTablet = perTablet;
		this.perCard = perCard;
	}

	public stock(String itemName, String itemType, String brandName, String supplierID, String supplierName,
			String price, String quantity, String setReOrderLevel, String perTablet, String perCard) {
		super();
		ItemName = itemName;
		ItemType = itemType;
		BrandName = brandName;
		SupplierID = supplierID;
		SupplierName = supplierName;
		Price = price;
		Quantity = quantity;
		SetReOrderLevel = setReOrderLevel;
		this.perTablet = perTablet;
		this.perCard = perCard;
	}

	public int getItemNumber() {
		return ItemNumber;
	}

	public void setItemNumber(int itemNumber) {
		ItemNumber = itemNumber;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemType() {
		return ItemType;
	}

	public void setItemType(String itemType) {
		ItemType = itemType;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String supplierID) {
		SupplierID = supplierID;
	}

	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getSetReOrderLevel() {
		return SetReOrderLevel;
	}

	public void setSetReOrderLevel(String setReOrderLevel) {
		SetReOrderLevel = setReOrderLevel;
	}

	public String getPerTablet() {
		return perTablet;
	}

	public void setPerTablet(String perTablet) {
		this.perTablet = perTablet;
	}

	public String getPerCard() {
		return perCard;
	}

	public void setPerCard(String perCard) {
		this.perCard = perCard;
	}
	
	
	
}
