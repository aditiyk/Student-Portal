package com.gcect.One.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gcect.One.DAO.RegistrationDAO;
import com.gcect.One.DBUtil.DBConnection;
import com.gcect.One.StudentBean.LoginBean;
import com.gcect.One.StudentBean.RegistrationBean;

/**
 * Servlet implementation class studentReg
 */
public class studentReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 RegistrationBean rbean=null;
	 RegistrationDAO rdao=null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentReg() {
        super();
        // TODO Auto-generated constructor stub
        
        rbean=new RegistrationBean();
        rdao=new RegistrationDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		rbean.setFname(request.getParameter("fname"));
		rbean.setLname(request.getParameter("lname"));
		rbean.setRoll(request.getParameter("roll"));
		rbean.setDept(request.getParameter("dept"));
		rbean.setGnd(request.getParameter("gnd"));
		rbean.setMob(request.getParameter("mob"));
		rbean.setEmail(request.getParameter("email"));
		
		String pass= request.getParameter("pass");
		String pass1= request.getParameter("cpass");
		
        PrintWriter pw=response.getWriter();

  
        if(pass.equals(pass1)) {
            int rs= rdao.registerStudent(rbean);
            if(rs>0) {
            	pw.write("success");
            }
            else pw.write("failure");
        }
        else
        	pw.write("Password does not match!");
       
		
	}
	
}
