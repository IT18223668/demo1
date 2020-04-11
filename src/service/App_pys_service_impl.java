package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.appointment_payment;
import model.cost;
import util.DBconnect;

public class App_pys_service_impl implements App_pys_service {

	private int size;
	private int  payID;
	private String payments;
	private String PyDoc;
	private String PyInst;
	private ArrayList<appointment_payment> apPys=null;
	
	@Override
	public ArrayList<appointment_payment> getAppPym() throws ClassNotFoundException, SQLException {
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from appointment_pays");
		ResultSet result=ps.executeQuery();
		
		ArrayList<appointment_payment> apPys=new ArrayList<appointment_payment>();
		while(result.next()) {
			payID=result.getInt(1);
			payments=result.getString(2);
			PyDoc=result.getString(3);
			PyInst=result.getString(4);
			apPys.add(new appointment_payment(payID, payments, PyDoc, PyInst));
			++size;
			}
		if(size>0) {
		this.apPys=apPys;
	}else 
		this.apPys=null;
		
		return this.apPys;
	}	

}
