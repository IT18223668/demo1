package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.patients;

public interface patient_service {

	public boolean addPatient(patients pt)  throws ClassNotFoundException,SQLException;
	public ArrayList<patients> getPatient(int pid) throws ClassNotFoundException,SQLException;
	public boolean updatePatient(patients pt)  throws ClassNotFoundException,SQLException;
	public ArrayList<patients> getAllPatients() throws ClassNotFoundException,SQLException;
	
	public patients getpatientID(String id) throws ClassNotFoundException,SQLException;
	
	
}
