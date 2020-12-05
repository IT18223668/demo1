package service;

import java.sql.SQLException;

import model.Appointment_patient;

public interface AppPatient_service {

	public boolean addappointpatient(Appointment_patient ApS) throws ClassNotFoundException, SQLException;
	public boolean updateAppoinPatient(Appointment_patient ApS) throws ClassNotFoundException, SQLException;
	public boolean deleteAppointment(int ApPtID) throws ClassNotFoundException, SQLException;
	
}
