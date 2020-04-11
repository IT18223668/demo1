package model;

public class employee {

	private int Eid;
	private String Ename;
	private String basicS;
	private String bonus;
	
	
	public employee(int eid, String ename, String basicS, String bonus) {
		super();
		Eid = eid;
		Ename = ename;
		this.basicS = basicS;
		this.bonus = bonus;
	}
	
	
	
	public employee(int eid, String basicS, String bonus) {
		super();
		Eid = eid;
		this.basicS = basicS;
		this.bonus = bonus;
	}



	public int getEid() {
		return Eid;
	}



	public void setEid(int eid) {
		Eid = eid;
	}



	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getBasicS() {
		return basicS;
	}
	public void setBasicS(String basicS) {
		this.basicS = basicS;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	
}
