package model;

public class customer {

	private int customerid;
	
	private String Name;
	private String Age;
	private String ContactNumber;
	private String Email;
	private String HomeAddress;
	private String Password;
	
	
	
	public customer(String name, String age, String contactNumber, String email, String homeAddress, String password) {
		super();
		Name = name;
		Age = age;
		ContactNumber = contactNumber;
		Email = email;
		HomeAddress = homeAddress;
		Password = password;
	}
	public customer() {
		super();
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
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
	public String getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
}
