package com.gcect.One.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gcect.One.DAO.LoginDAO;
import com.gcect.One.DBUtil.DBConnection;
import com.gcect.One.StudentBean.LoginBean;

/**
 * Servlet implementation class studentLogin
 */
public class studentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Connection con=null;
	 LoginBean lb=null;
	 LoginDAO dao= null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentLogin() {
        super();
        // TODO Auto-generated constructor stub
     
        lb=new LoginBean();
        dao = new LoginDAO();
       
      

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		lb.setUsername(request.getParameter("uname"));
		lb.setPassword(request.getParameter("password"));
    
		PrintWriter pw=response.getWriter();
		if(dao.validate(lb))
		{
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
		pw.write("Failure");
		}
		
		
		/**lb.setUsername(request.getParameter("uname"));
		lb.setPassword(request.getParameter("password"));
		String status=dao.validate(lb);
		PrintWriter pw=response.getWriter();
		pw.write(status);*
		
		*
		*		pw.write("Username:");
		pw.write(lb.getUsername());
		pw.write("<br>");
		pw.write("Password:");
		pw.write(lb.getPassword());
	
		*
		*/
	}


}
