package service;


import java.sql.SQLException;
import java.util.ArrayList;

import model.stock;

public interface stock_manage {
	public boolean addItem(stock item) throws ClassNotFoundException,SQLException;
	public ArrayList<stock> getAllItem() throws ClassNotFoundException,SQLException;
	public boolean updateItem(stock item) throws ClassNotFoundException,SQLException;
	public boolean deleteItem(int itemNumber) throws ClassNotFoundException,SQLException;	

	
}
