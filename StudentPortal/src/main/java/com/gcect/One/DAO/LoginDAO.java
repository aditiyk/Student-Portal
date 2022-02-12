package com.gcect.One.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcect.One.DBUtil.DBConnection;
import com.gcect.One.StudentBean.LoginBean;

public class LoginDAO {
	public boolean validate(LoginBean lb)
	{
	boolean status=false;
	
	//Connection object con created
	
	Connection con=DBConnection.getDBConnection();
	try {
	PreparedStatement ps=con.prepareStatement("select * from LOGIN_TBL where UserName=? and Password=?");
	ps.setString(1, lb.getUsername());
	ps.setString(2, lb.getPassword());
	ResultSet rs=ps.executeQuery();
	status = rs.next();
	}catch(SQLException e) {printSQLException(e);};
	return status;
	}
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}