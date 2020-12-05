package service;

import java.sql.*;
import java.util.*;


import model.*;
import util.*;

public class customer_service_impl implements customer_service {
	private int customerid;
	private String UserName;
	private String Name;
	private String Age;
	private String ContactNumber;
	private String Email;
	private String HomeAddress;
	private String Password;
	private boolean status;
	private int size;
	
	
	@Override
	public boolean addcustomer(customer cust) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps = conn.prepareStatement("Insert into customer(Name,Age,ContactNumber,Email,HomeAddress,Password) "
				+ "values('" + cust.getName() + "','"+cust.getAge()+"','" + cust.getContactNumber() + "','" + cust.getEmail() + "','" + cust.getHomeAddress() + "','" + cust.getPassword() + "')");
				

		int res = ps.executeUpdate();
		
		if (res > 0)
		{
			status=true;
		}
		else {
			status=false;
		}
		
		
		return status;
	}

	@Override
	public boolean updatecustomer(customer cust) throws ClassNotFoundException, SQLException {
		boolean status = true;
		PreparedStatement ps= DBconnect.getCon().prepareStatement("update customer set Name= '"+cust.getName()+"' ,"
																			+ " Age= '"+cust.getAge()+ "'" + " ContactNumber= '"+cust.getContactNumber()+ "'" + " Email= '"+cust.getEmail()+ "'" + " HomeAddress= '"+cust.getHomeAddress()+ "'," + " Password= '"+cust.getPassword()+ "'"
																					+ " where customerid= "+cust.getCustomerid());
		
		int res = ps.executeUpdate();
		if (res > 0)
		{
				status=false;
		}
		else {
			status=false;
		}
		return status;
	}
	

}
