package com.gcect.One.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcect.One.DBUtil.DBConnection;
import com.gcect.One.StudentBean.RegistrationBean;


public class RegistrationDAO {
	public  int registerStudent(RegistrationBean rbean)
	{
		int rs = 0;
	Connection con=DBConnection.getDBConnection();
		  try { 
	   
		    PreparedStatement preparedStatement = con.prepareStatement("insert into STUDENT_TBL values(?,?,?,?,?,?,?)");
			  
            preparedStatement.setString(1, rbean.getFname());
            preparedStatement.setString(2, rbean.getLname());
            preparedStatement.setString(3, rbean.getRoll());
            preparedStatement.setString(4, rbean.getDept());
            preparedStatement.setString(5, rbean.getGnd());
            preparedStatement.setString(6, rbean.getMob());
            preparedStatement.setString(7, rbean.getEmail());
		    
             rs=preparedStatement.executeUpdate();
             System.out.println(rs);
	}
		  catch (SQLException e) {
			  printSQLException(e);
	        }

			return rs;
			
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

	



/**
 * 	
/*	private String Roll=null;
	public String generateRoll(){
		
		return roll;
	}
	
 * 
 * 
 * 
 *  public static String registerStudent(RegistrationBean rbean) throws ClassNotFoundException {
		    String status="Invalid Credentials!!!";
	        String INSERT_USERS_SQL = "INSERT INTO STUDENT_TBL" +
	            "  (FirstName, LastName, ROLL , DEPT, GND, DOB, MOB, EMAIL) VALUES " +
	            " (?, ?, ?, ?, ?,?,?,?);";
 * 
 * 
 * PreparedStatement preparedStatement = conn.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setString(1, rbean.getFname());
	            preparedStatement.setString(2, rbean.getLname());
	            preparedStatement.setString(3, rbean.getRoll());
	            preparedStatement.setString(4, rbean.getDept());
	            preparedStatement.setString(5, rbean.getGnd());
	            preparedStatement.setString(6, rbean.getDob());
	            preparedStatement.setString(7, rbean.getMob());
	            preparedStatement.setString(8, rbean.getEmail());

	            ResultSet rs=preparedStatement.executeQuery();
 * */
