package model;

public class suppliers {

private int SupplierID;
	
	private String Name;

	private String address ;

	private String ContactNumber;

	private String Email;

	private String join_date;
	
	private String item;
	
	public suppliers(int supplierID, String name, String address, String contactNumber, String email, String join_date,
			String item) {
		super();
		SupplierID = supplierID;
		Name = name;
		this.address = address;
		ContactNumber = contactNumber;
		Email = email;
		this.join_date = join_date;
		this.item = item;
	}
	
	
	public suppliers(String name, String address, String contactNumber, String email, String join_date, String item) {
		super();
		Name = name;
		this.address = address;
		ContactNumber = contactNumber;
		Email = email;
		this.join_date = join_date;
		this.item = item;
	}




	public suppliers() {
		super();
	}


	public int getSupplierID() {
		return SupplierID;
	}
	

	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}
	

	public String getName() {
		return Name;
	}
	

	public void setName(String name) {
		Name = name;
	}
	

	public String getAddress() {
		return address;
	}
	

	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getContactNumber() {
		return ContactNumber;
	}
	

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	

	public String getEmail() {
		return Email;
	}
	

	public void setEmail(String email) {
		Email = email;
	}
	

	public String getJoin_date() {
		return join_date;
	}
	

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	

	public String getItem() {
		return item;
	}
	

	public void setItem(String item) {
		this.item = item;
	}

	
}
