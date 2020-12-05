package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import model.doctor;
import util.*;

public class doctor_service_impl implements doctor_service {
	
	private int docId;
	private String docName;
	private String age;
	private String specialization;
	private String contactno;
	private String password;
	private String days;
	private String email;
	private boolean status; 
	
	private ArrayList<doctor> doc1=null;
	private int size;
	
	@Override
	public boolean addDoc(doctor doc) throws ClassNotFoundException, SQLException {
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Insert into doctor(docName,age,specialization,contactno,password,days,email) values('"+doc.getDocName()+"','"+doc.getAge()+"','"+doc.getSpecialization()+"','"+doc.getContactNo()+"','"+doc.getPassword()+"','"+doc.getDaysattempt()+"','"+doc.getEmail()+"')");
		
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
	public boolean updateDoc(doctor doc) throws ClassNotFoundException, SQLException {
		boolean status=true;
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Update doctor set docName= '"+doc.getDocName()+"' , age= '"+doc.getAge()+"', specialization= '"+doc.getSpecialization()+"', contactno='"+doc.getContactNo()+"',password='"+doc.getPassword()+"',days ='"+doc.getDaysattempt()+"',email='"+doc.getEmail()+"' where docID= "+doc.getDocId());
		
		int res = ps.executeUpdate();
		if(res>0) {
			status=true;
		}
		else {
			status=false;
		}
		
		return status;
	}

	@Override
	public boolean deleteDoc(int dID) throws ClassNotFoundException, SQLException {
		boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from doctor where docID= "+dID);
		
		int result=ps.executeUpdate();
		if(result>0) {
			status=true;
		}
		else {
			status=false;
		}
			
		
		return status;
		
	}

	@Override
	public ArrayList<doctor> getAlldocs() throws ClassNotFoundException, SQLException {
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from doctor");
		ResultSet result=ps.executeQuery();
		
		ArrayList<doctor> doc1=new ArrayList<doctor>();
		while(result.next()) {
			docId=result.getInt(1);
			docName=result.getString(2);
			age=result.getString(3);
			specialization=result.getString(4);
			contactno=result.getString(5);
			password=result.getString(6);
			days=result.getString(7);
			email=result.getString(8);
			
			doc1.add(new doctor(docId, docName, age, specialization, contactno, password, days, email));
			++size;
		}
		if(size>0) {
			this.doc1=doc1;
			
		}else 
			this.doc1=null;
			
		return this.doc1;
		
		
	}

}
