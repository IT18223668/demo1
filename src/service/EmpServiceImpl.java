package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import model.Employee;

import util.DBconnect;

public class EmpServiceImpl implements EmpService {
	
	
	private int size;
	
    private int EmployeeID;
	
	private String Name;

	private String Designation;

	private String MobileNo;

	private String Nic;

	private String Address;
	
	private boolean status; 
	
	private ArrayList<Employee> emp1=null;
	
	
	
	
	
	
	
	@Override
	public boolean addEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps = conn.prepareStatement("Insert into employee(Name,Designation,MobileNo,Nic,Address) values('" + emp.getName()+ "','" + emp.getDesignation() + "','"+emp.getMobileNo()+"','"+emp.getNic()+"','"+emp.getAddress()+"')");
				
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
	public  ArrayList<Employee> getAllEmployee() throws ClassNotFoundException,SQLException{
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from employee");
		ResultSet result=ps.executeQuery();
		
		ArrayList<Employee> emp1=new ArrayList<Employee>();
		while(result.next()) {
			EmployeeID=result.getInt(1);
			Name=result.getString(2);
			Designation=result.getString(3);
			MobileNo=result.getString(4);
			Nic=result.getString(5);
			Address=result.getString(6);
			emp1.add(new Employee(EmployeeID,Name,Designation,MobileNo,Nic,Address));
			++size;
		}
		if(size>0) {
			this.emp1=emp1;
			
		}else 
			this.emp1=null;
			
		return this.emp1;
		
		
			
	}
	
	
	@Override
	public boolean updateEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		
		boolean status = true;
		PreparedStatement ps= DBconnect.getCon().prepareStatement("update employee set Name=' " + emp.getName() + "' ,"+ "  Designation= '"+emp.getDesignation()+"' ,"+ " MobileNo= '"+emp.getMobileNo()+ "' ,"+ " Nic= '"+emp.getNic()+"' ,"+ " Address= '"+emp.getAddress()+"'"
				+ "where empid= "+emp.getEmployeeID());
				
																	
																			
		
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
	public boolean deleteEmployee(int EmployeeID) throws ClassNotFoundException, SQLException {
		
		boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from employee where EmployeeID = "+EmployeeID);
		
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


