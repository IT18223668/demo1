package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.stock;
import util.*;

public class stock_manage_imp implements stock_manage {
	
	private int size;
	private int itemNumber;
	private String itemName;
	private String itemType;
	private String brandName;
	private String supplierID;
	private String supplierName;
	private String price;
	private String quantity;
	private String setReOrderLevel;
	private String perTablet;
	private String perCard;
	private boolean status; 
	private ArrayList<stock> item1=null;
	
	@Override
	public boolean addItem(stock item) throws ClassNotFoundException, SQLException {
		Connection connection = DBconnect.getCon();
		PreparedStatement ps = connection.prepareStatement("Insert into stock(itemName,itemType,brandName,supplierID,supplierName,price,quantity,setReOrderLevel,perTablet,perCard) values('" + item.getItemName()+ "','" + item.getItemType()+ "','" + item.getBrandName()+ "','" + item.getSupplierID()+ "','" + item.getSupplierName()+ "','" + item.getPrice()+ "','" + item.getQuantity()+ "','" + item.getSetReOrderLevel()+ "','" + item.getPerTablet()+ "','" + item.getPerCard()+"')");
		
		int res = ps.executeUpdate();
		if (res > 0)
		{
		status=true;	
		}
		else {
			status=false;
		}
		
		
		return status;
	
	}

	@Override
	public ArrayList<stock> getAllItem() throws ClassNotFoundException, SQLException {
		PreparedStatement ps=DBconnect.getCon().prepareStatement("select * from stock");
		ResultSet result=ps.executeQuery();
		
		ArrayList<stock> item1 = new ArrayList<stock>();
		while(result.next()) {
			itemNumber=result.getInt(1);
			itemName=result.getString(2);
			itemType=result.getString(3);
			brandName=result.getString(4);
			supplierID=result.getString(5);
			supplierName=result.getString(6);
			price=result.getString(7);
			quantity=result.getString(8);
			setReOrderLevel=result.getString(9);
			perTablet=result.getString(10);
			perCard=result.getString(11);
			
			item1.add(new stock(itemNumber,itemName,itemType,brandName,supplierID,supplierName,price,quantity,setReOrderLevel,perTablet,perCard));
			
			++size;
		}
		if(size>0) {
			this.item1=item1;
			
		}else 
			this.item1=null;
			
		return this.item1;
	}

	@Override
	public boolean updateItem(stock item) throws ClassNotFoundException, SQLException {
		boolean status = true;
		PreparedStatement ps= DBconnect.getCon().prepareStatement("Update stock set itemName=' " + item.getItemName() + "' ,"
																	+ "  itemType=' " + item.getItemType() + "' ,"
																	+ "  brandName=' " + item.getBrandName() + "' ,"
																	+ "  supplierID=' " + item.getSupplierID() + "' ,"
																	+ "  supplierName=' " + item.getSupplierName() + "' ,"  															
																	+ "  price=' " + item.getPrice() + "' ,"  
																	+ "  quantity=' " + item.getQuantity() + "' ,"
																	+ "  setReOrderLevel=' " + item.getSetReOrderLevel() + "' ,"
																	+ "  perTablet=' " + item.getPerTablet() + "' ,"
																	+ "  perCard=' " + 	item.getPerCard() + "' where itemNumber="+item.getItemNumber());
		
		int res=ps.executeUpdate();
		if(res>0) {
			status=true;
		}
		else {
			status=false;
		}
		return status;
	}

	@Override
	public boolean deleteItem(int itemNumber) throws ClassNotFoundException, SQLException {
		boolean status =true;
		
		PreparedStatement ps=DBconnect.getCon().prepareStatement("Delete from stock where itemNumber = "+itemNumber);
		
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
