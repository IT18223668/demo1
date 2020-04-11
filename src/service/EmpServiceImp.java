package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.employee;
import util.DBconnect;

public class EmpServiceImp implements EmpService {

	private int size;
	private int Emid;
	private String basic;
	private String bonus;
	private ArrayList<employee> e1=null;
	
	
	@Override
	public ArrayList<employee> getEmpSal() throws ClassNotFoundException, SQLException {
		
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from employee_salary");
		ResultSet result=ps.executeQuery();
		
		ArrayList<employee> e1=new ArrayList<employee>();
		while(result.next()) {
			Emid=result.getInt(1);
			basic=result.getString(2);
			bonus=result.getString(3);
			e1.add(new employee(Emid,basic,bonus));
			++size;
		}
		if(size>0) {
			this.e1=e1;
			
		}else 
			this.e1=null;
			
		return this.e1;
		
		
		
	}

}
