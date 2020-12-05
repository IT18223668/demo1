package model;

public class patients {
	private int pid;
	private String pname;
	private String age;
	private String weight;
	private String height;
	private String address;
	private String diagnose;
	private String drugs;
	private double fee;
	
	
	
	public patients(int pid, String pname, String age, String weight, String height, String address, String diagnose,
			String drugs) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.address = address;
		this.diagnose = diagnose;
		this.drugs = drugs;
	}



	public patients(int pid, String pname, String age, String weight, String height, String address, String diagnose,
			String drugs, double fee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.address = address;
		this.diagnose = diagnose;
		this.drugs = drugs;
		this.fee = fee;
	}



	public patients() {
		super();
	}
	
	
	
	public patients(int pid) {
		super();
		this.pid = pid;
	}
	public patients(String pname, String age, String weight, String height, String address, String diagnose,
			String drugs) {
		super();
		this.pname = pname;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.address = address;
		this.diagnose = diagnose;
		this.drugs = drugs;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	public String getDrugs() {
		return drugs;
	}
	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}



	public double getFee() {
		return fee;
	}



	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
}
