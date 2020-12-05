package service;

import java.sql.*;
import java.util.*;


import model.*;
import util.*;

public class costserviceImpl implements costservice {
	
	private int size;
	private String description;
	private double cost;
	private boolean status; 
	private int costId;
	private String date;
	private ArrayList<cost> cst1=null;
	
	@Override
	public boolean addcost(cost cst) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps = conn.prepareStatement("Insert into cost(description,cost,date) values('" + cst.getDescription()+ "','" + cst.getCost() + "','"+cst.getDate()+"')");
		
		int res = ps.executeUpdate();
		if (res > 0)
		{
			PreparedStatement ps1=conn.prepareStatement("Insert into report(cost) values('"+cst.getCost()+"')");
			int res1=ps1.executeUpdate();
				if(res1>0) {
					status=true;
				}else {
					status=false;
				}
		}
		else {
			status=false;
		}
		
		
		return status;
	}

	@Override
	public  ArrayList<cost> getAllCost() throws ClassNotFoundException,SQLException{
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from cost");
		ResultSet result=ps.executeQuery();
		
		ArrayList<cost> cst1=new ArrayList<cost>();
		while(result.next()) {
			costId=result.getInt(1);
			description=result.getString(2);
			cost=result.getDouble(3);
			date=result.getString(4);
			cst1.add(new cost(costId,description,cost,date));
			++size;
		}
		if(size>0) {
			this.cst1=cst1;
			
		}else 
			this.cst1=null;
			
		return this.cst1;
		
		
			
	}

	@Override
	public boolean updatecost(cost cst) throws ClassNotFoundException, SQLException {
		
		boolean status = true;
		PreparedStatement ps= DBconnect.getCon().prepareStatement("update cost set description=' " + cst.getDescription() + "' ,"
																	+ "  cost= '"+cst.getCost()+"' ,"
																			+ " date= '"+cst.getDate()+ "'"
																					+ " where costid= "+cst.getCostid());
		
		int res=ps.executeUpdate();
		if(res>0) {
			status=true;
		}
		else {
			status=false;
		}
		return status;
	}

	@Override
	public boolean deletecost(int costid) throws ClassNotFoundException, SQLException {
		
		boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from cost where costid = "+costid);
		
		int result=ps.executeUpdate();
		if(result>0) {
			status=true;
		}
		else {
			status=false;
		}
			
		
		return status;
	}

	

	
}
