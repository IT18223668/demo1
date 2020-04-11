package model;

public class cost {
	private int costid;
	private String Description;
	private String cost;
	private String date;
	
	
	public cost(int costid, String description, String cost, String date) {
		super();
		this.costid = costid;
		Description = description;
		this.cost = cost;
		this.date = date;
	}
	
	
	
	public cost(String description, String cost, String date) {
		super();
		Description = description;
		this.cost = cost;
		this.date = date;
	}



	public cost(String description, String cost) {
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
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
	
	
	
	
}
