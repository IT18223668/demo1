package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect implements ConProvider {

static Connection c=null;
	
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection(url, user, password);
			System.out.println("DB connected");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return c;
	}
}
