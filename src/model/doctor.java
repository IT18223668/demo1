package model;

public class doctor {
	private int docId;
	private String docName;
	private String age;
	private String specialization;
	private String contactNo;
	private String password;
	private String daysattempt;
	private String email;
	
	public doctor() {
		super();
	}

	
	

	public doctor(int docId, String docName, String age, String specialization, String contactNo, String password,
			String daysattempt, String email) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.age = age;
		this.specialization = specialization;
		this.contactNo = contactNo;
		this.password = password;
		this.daysattempt = daysattempt;
		this.email = email;
	}




	public doctor(String docName, String age, String specialization, String contactNo, String password, String daysattempt,
			String email) {
		super();
		this.docName = docName;
		this.age = age;
		this.specialization = specialization;
		this.contactNo = contactNo;
		this.password = password;
		this.daysattempt = daysattempt;
		this.email = email;
	}




	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public String getDaysattempt() {
		return daysattempt;
	}



	public void setDaysattempt(String daysattempt) {
		this.daysattempt = daysattempt;
	}


	
	
	
}
