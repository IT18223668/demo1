package model;

public class cost {
	private int costid;
	private String Description;
	private double cost;
	private String date;
	
	
	
	
	public cost() {
		super();
	}

	public cost(int costid, String description, double cost, String date) {
		super();
		this.costid = costid;
		Description = description;
		this.cost = cost;
		this.date = date;
	}
	
	public cost(int costid) {
		super();
		this.costid=costid;
	}
	
	
	public cost(String description, double cost, String date) {
		super();
		Description = description;
		this.cost = cost;
		this.date = date;
	}



	public cost(String description, double cost) {
		super();
		Description = description;
		this.cost = cost;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getCostid() {
		return costid;
	}
	public void setCostid(int costid) {
		this.costid = costid;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	
	
	
}
