package service;

import java.sql.SQLException;
import java.util.ArrayList;

import model.suppliers;

public interface supplier_service {

	public boolean addsupplier(suppliers spl) throws ClassNotFoundException, SQLException;
	public boolean updatesupplier(suppliers spl) throws ClassNotFoundException, SQLException;
	public ArrayList<suppliers> getSupplier() throws ClassNotFoundException, SQLException;
	public boolean deletesupplier(int sid) throws ClassNotFoundException, SQLException;
	
	
}
