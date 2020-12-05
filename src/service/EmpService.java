package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;


public interface EmpService {
	
	public boolean addEmployee(Employee emp) throws ClassNotFoundException,SQLException;
	public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException,SQLException;
	public boolean updateEmployee(Employee emp) throws ClassNotFoundException,SQLException;
	public boolean deleteEmployee(int EmployeeID) throws ClassNotFoundException,SQLException;


}
