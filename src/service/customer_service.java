package service;

import java.sql.SQLException;

import model.*;

public interface customer_service {
	public boolean addcustomer(customer cust) throws ClassNotFoundException,SQLException;
	public boolean updatecustomer(customer cust) throws ClassNotFoundException,SQLException;
}
