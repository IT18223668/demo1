package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.patients;
import util.DBconnect;

public class patient_service_implement implements patient_service {
	
	private int size;
	private int id;
	private String name;
	private String age;
	private String weight;
	private String height;
	private String address;
	private String diagnose;
	private String drugs;
	private double fee;
	public boolean status;
	
	private ArrayList<patients> pt1=null;
	@Override
	public boolean addPatient(patients pt) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Insert into patients(name,age,weight,height,address,diagnose,drugs)  values('"+pt.getPname()+"','"+pt.getAge()+"','"+pt.getWeight()+"','"+pt.getHeight()+"','"+pt.getAddress()+"','"+pt.getDiagnose()+"','"+pt.getDrugs()+"')" );
		
		int res = ps.executeUpdate();
		if (res > 0)
		{
				PreparedStatement ps1=conn.prepareStatement("Insert into report(opd) values(350)");
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
	public ArrayList<patients> getPatient(int pid) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Select * from patients where ="+ pid );
		
		ResultSet rs=ps.executeQuery();
		ArrayList<patients> pt1=new ArrayList<patients>();
		while(rs.next()) {
			id=rs.getInt(1);
			name=rs.getString(2);
			age=rs.getString(3);
			weight=rs.getString(4);
			height=rs.getString(5);
			address=rs.getString(6);
			drugs=rs.getString(7);
			
			pt1.add(new patients(id, name, age, weight, height, address, diagnose, drugs));
			size++;
		}
		if(size>0) {
			this.pt1=pt1;
			
		}else 
			this.pt1=null;
			
		return this.pt1;
		
		
	}

	@Override
	public boolean updatePatient(patients pt) throws ClassNotFoundException, SQLException {
		Connection conn = DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("update patients set name='"+pt.getPname()+"', age='"+pt.getAge()+"', weight='"+pt.getWeight()+"', height='"+pt.getHeight()+"',address='"+pt.getAddress()+"', diagnose='"+pt.getDiagnose()+"', drugs='"+pt.getDrugs()+"' where pid="+pt.getPid());
		
		int res = ps.executeUpdate();
		if (res > 0) {
			PreparedStatement ps1=conn.prepareStatement("Insert into report(opd) values(350)");
			int res1=ps1.executeUpdate();
			if(res1>0) {
				status=true;
			}else {
				status=false;
			}
		} else {
			status = false;
		}
		
		return status;
	}

	@Override
	public ArrayList<patients> getAllPatients() throws ClassNotFoundException, SQLException {

		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from patients");
		ResultSet rs=ps.executeQuery();
		
		ArrayList<patients> pt1=new ArrayList<patients>();
		while(rs.next()) {
			id=rs.getInt(1);
			name=rs.getString(2);
			age=rs.getString(3);
			weight=rs.getString(4);
			height=rs.getString(5);
			address=rs.getString(6);
			diagnose=rs.getString(7);
			drugs=rs.getString(8);
			fee=rs.getDouble(9);
			pt1.add(new patients(id, name, age, weight, height, address, diagnose, drugs,fee));
			++size;
		}
		if(size>0) {
			this.pt1=pt1;
			
		}else 
			this.pt1=null;
			
		return this.pt1;
		
		
			
	}

	@Override
	public patients getpatientID(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
