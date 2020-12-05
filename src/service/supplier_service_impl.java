package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import model.suppliers;
import util.DBconnect;

public class supplier_service_impl implements supplier_service {

	
	private int SupplierID;
	private String Name;
	private String address ;
	private String ContactNumber;
	private String Email;
	private String join_date;
	private String item;
	
	private int size;
	public boolean status;
	private ArrayList<suppliers> sp1=null;
	
	@Override
	public boolean addsupplier(suppliers spl) throws ClassNotFoundException, SQLException {
		
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Insert into supplier(name,address,contactNo,mail,joinDate,item) values('"+spl.getName()+"','"+spl.getAddress()+"','"+spl.getContactNumber()+"','"+spl.getEmail()+"','"+spl.getJoin_date()+"','"+spl.getItem()+"')");
		 int res=ps.executeUpdate();
		 
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
	public boolean updatesupplier(suppliers spl) throws ClassNotFoundException, SQLException {
		
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("");
		
		
		int res=ps.executeUpdate("Update supplier set name='"+spl.getName()+"',address='"+spl.getAddress()+"',contactNo='"+spl.getContactNumber()+"',mail='"+spl.getEmail()+"',joinDate='"+spl.getJoin_date()+"',item='"+spl.getItem()+"' where supID="+spl.getSupplierID());
		
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
	public ArrayList<suppliers> getSupplier() throws ClassNotFoundException, SQLException {

		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from supplier");
		ResultSet rs=ps.executeQuery();

		ArrayList<suppliers> sp1=new ArrayList<suppliers>();
		while(rs.next()) {
			SupplierID=rs.getInt(1);
			Name=rs.getString(2);
			address=rs.getString(3);
			ContactNumber=rs.getString(4);
			Email=rs.getString(5);
			join_date=rs.getString(6);
			item=rs.getString(7);
			sp1.add(new  suppliers(SupplierID, Name, address, ContactNumber, Email, join_date, item));
			++size;
		}
		if(size>0) {
			this.sp1=sp1;
			
		}else 
			this.sp1=null;
			
		return this.sp1;
		
		
		
	}

	@Override
	public boolean deletesupplier(int sid) throws ClassNotFoundException, SQLException {
	
		boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from supplier where supID ="+sid);
		
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
