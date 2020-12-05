package model;

public class Employee {

	
	private int EmployeeID;
	
	private String Name;

	private String Designation;

	private String MobileNo;

	private String Nic;

	private String Address;
	
	
	
	
	
	
	public Employee() {
		super();
	}

	
	
	public Employee(String name, String designation, String mobileNo, String nic, String address) {
		super();
		Name = name;
		Designation = designation;
		MobileNo = mobileNo;
		Nic = nic;
		Address = address;
	}



	public Employee(int employeeID, String name, String designation, String mobileNo, String nic, String address
			) {
		super();
		EmployeeID = employeeID;
		Name = name;
		Designation = designation;
		MobileNo = mobileNo;
		Nic = nic;
		Address = address;
		
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getNic() {
		return Nic;
	}

	public void setNic(String nic) {
		Nic = nic;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


	
	
	
	
	
	
	
	
}
