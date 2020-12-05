package model;

public class appointment_payment {
	private int payId;
	private double payment;
	private double doctorPy;
	
	
	
	
	public appointment_payment(int payId, double payment, double doctorPy) {
		super();
		this.payId = payId;
		this.payment = payment;
		this.doctorPy = doctorPy;
	}



	public appointment_payment(double payment, double doctorPy) {
		super();
		this.payment = payment;
		this.doctorPy = doctorPy;
	}



	public int getPayId() {
		return payId;
	}



	public void setPayId(int payId) {
		this.payId = payId;
	}



	public double getPayment() {
		return payment;
	}



	public void setPayment(double payment) {
		this.payment = payment;
	}



	public double getDoctorPy() {
		return doctorPy;
	}



	public void setDoctorPy(double doctorPy) {
		this.doctorPy = doctorPy;
	}




	
	
	
}
