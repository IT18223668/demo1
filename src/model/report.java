package model;

public class report {
	private int reportID;
	private double Cost;
	private double Payment;
	private double docPays;
	
	
	
	
	public report() {
		super();
	}




	public report(int reportID, double cost, double payment, double docPays) {
		super();
		this.reportID = reportID;
		Cost = cost;
		Payment = payment;
		this.docPays = docPays;
	}




	public report(double cost, double payment, double docPays) {
		super();
		Cost = cost;
		Payment = payment;
		this.docPays = docPays;
	}




	public int getReportID() {
		return reportID;
	}




	public void setReportID(int reportID) {
		this.reportID = reportID;
	}




	public double getCost() {
		return Cost;
	}




	public void setCost(double cost) {
		Cost = cost;
	}




	public double getPayment() {
		return Payment;
	}




	public void setPayment(double payment) {
		Payment = payment;
	}




	public double getDocPays() {
		return docPays;
	}




	public void setDocPays(double docPays) {
		this.docPays = docPays;
	}
	
	
	
	
}
