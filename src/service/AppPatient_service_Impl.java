package service;

import java.sql.*;
import java.util.*;


import model.*;
import util.*;


public class AppPatient_service_Impl implements AppPatient_service {

	private boolean status;
	@Override
	public boolean addappointpatient(Appointment_patient ApS) throws ClassNotFoundException, SQLException {
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Insert into appointment_patient(patientName,age,gender,email,phonenum,address,doctorid) values('"+ApS.getP_name()+"','"+ApS.getP_age()+"','"+ApS.getP_gender()+"','"+ApS.getP_email()+"','"+ApS.getP_phone()+"','"+ApS.getP_address()+"','"+ApS.getD_id()+"')");
		
		int rs=ps.executeUpdate();
		
		if(rs>0) {
			status=true;
		}else {
			status=false;
		}
		
		
		return status;
	}

	@Override
	public boolean updateAppoinPatient(Appointment_patient ApS) throws ClassNotFoundException, SQLException {
		Connection conn=DBconnect.getCon();
		PreparedStatement ps=conn.prepareStatement("Update appointment_patient set patientName='"+ApS.getP_name()+"',age='"+ApS.getP_age()+"',gender='"+ApS.getP_gender()+"',email='"+ApS.getP_email()+"',phonenum='"+ApS.getP_phone()+"',address='"+ApS.getP_address()+"' where AppPtID="+ApS.getP_id());
		int rs=ps.executeUpdate();
		
		if(rs>0) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}

	@Override
	public boolean deleteAppointment(int ApPtID) throws ClassNotFoundException, SQLException {
boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from appointment_patient where AppPtID = "+ApPtID);
		
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
