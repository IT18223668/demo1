package model;

public class appointment_payment {
	private int payId;
	private String payment;
	private String doctorPy;
	private String institutePy;
	
	
	
	public appointment_payment(int payId, String payment, String doctorPy, String institutePy) {
		super();
		this.payId = payId;
		this.payment = payment;
		this.doctorPy = doctorPy;
		this.institutePy = institutePy;
	}



	public appointment_payment(String payment, String doctorPy, String institutePy) {
		super();
		this.payment = payment;
		this.doctorPy = doctorPy;
		this.institutePy = institutePy;
	}



	public int getPayId() {
		return payId;
	}



	public void setPayId(int payId) {
		this.payId = payId;
	}



	public String getPayment() {
		return payment;
	}



	public void setPayment(String payment) {
		this.payment = payment;
	}



	public String getDoctorPy() {
		return doctorPy;
	}



	public void setDoctorPy(String doctorPy) {
		this.doctorPy = doctorPy;
	}



	public String getInstitutePy() {
		return institutePy;
	}



	public void setInstitutePy(String institutePy) {
		this.institutePy = institutePy;
	}
	
	
	
}
