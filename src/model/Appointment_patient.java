package model;

public class Appointment_patient {
	private int p_id;
	private int D_id;
	private String p_name;
	private String p_age;
	
	private String p_gender;
	private String p_address;
	private String p_email;
	private String p_phone;
	
	public Appointment_patient() {
		super();
	}
	
	
	



	public int getD_id() {
		return D_id;
	}






	public void setD_id(int d_id) {
		D_id = d_id;
	}






	public Appointment_patient(int d_id, String p_name, String p_age, String p_gender, String p_address, String p_email,
			String p_phone) {
		super();
		D_id = d_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_gender = p_gender;
		this.p_address = p_address;
		this.p_email = p_email;
		this.p_phone = p_phone;
	}






	public Appointment_patient(int p_id, int d_id, String p_name, String p_age, String p_gender, String p_address,
			String p_email, String p_phone) {
		super();
		this.p_id = p_id;
		D_id = d_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_gender = p_gender;
		this.p_address = p_address;
		this.p_email = p_email;
		this.p_phone = p_phone;
	}






	public int getP_id() {
		return p_id;
	}



	public void setP_id(int p_id) {
		this.p_id = p_id;
	}



	public String getP_name() {
		return p_name;
	}



	public void setP_name(String p_name) {
		this.p_name = p_name;
	}



	public String getP_age() {
		return p_age;
	}



	public void setP_age(String p_age) {
		this.p_age = p_age;
	}






	public String getP_gender() {
		return p_gender;
	}



	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}



	public String getP_address() {
		return p_address;
	}



	public void setP_address(String p_address) {
		this.p_address = p_address;
	}



	public String getP_email() {
		return p_email;
	}



	public void setP_email(String p_email) {
		this.p_email = p_email;
	}



	public String getP_phone() {
		return p_phone;
	}



	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}
	
	
	
}
