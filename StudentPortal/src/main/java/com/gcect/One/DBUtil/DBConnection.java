package com.gcect.One.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con=null;
	public static Connection getDBConnection()
	{
	//the forName method allows us to establish our connection
		
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//------------------------------>  connection string, user name, password
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Your_username","Your_Password");
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	return con;
	}
}
