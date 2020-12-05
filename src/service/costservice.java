package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.cost;

public interface costservice {
	public boolean addcost(cost cst) throws ClassNotFoundException,SQLException;
	public ArrayList<cost> getAllCost() throws ClassNotFoundException,SQLException;
	public boolean updatecost(cost cst) throws ClassNotFoundException,SQLException;
	public boolean deletecost(int costid) throws ClassNotFoundException,SQLException;
	
}
