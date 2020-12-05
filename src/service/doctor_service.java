package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.*;

public interface doctor_service {
	public boolean addDoc(doctor doc) throws ClassNotFoundException, SQLException;
	public boolean updateDoc(doctor doc) throws ClassNotFoundException, SQLException;
	public boolean deleteDoc(int dID) throws ClassNotFoundException, SQLException;
	public ArrayList<doctor> getAlldocs()throws ClassNotFoundException, SQLException;
	
	
}
