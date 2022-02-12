<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.gcect.One.Servlet.studentLogin.*"%>
<%@page import="com.gcect.One.DBUtil.*"%>
<%@page import="com.gcect.One.DAO.LoginDAO"%>
<%@page import="com.gcect.One.StudentBean.LoginBean"%>  
  

 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>Welcome</h1>
<%
try
{ 
        Connection con=DBConnection.getDBConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select FirstName, LastName, ROLL, DEPT,GND, MOB, EMAIL from STUDENT_TBL, LOGIN_TBL where EMAIL=USERNAME");
    
        if(rs.next()==false )
        {
            out.println("No Records in the table");
        }
        else
        {%>
       
        <table border="1">
        <tr><th>First Name</th><th>Last Name</th><th>ROLL</th><th>Dept</th><th>Gender</th><th>Mobile</th><th>Email</th></tr>
        <%
            do
            {%>
           
            <tr><td><%= rs.getString(1)%></td><td><%= rs.getString(2)%></td><td><%= rs.getString(3)%></td><td><%= rs.getString(4)%></td><td><%= rs.getString(5)%></td><td><%= rs.getString(6)%></td><td><%= rs.getString(7)%></td></tr>
           
            <%}while(rs.next());
        }
       
}
catch(Exception e)
{
    System.out.println(e.getMessage());
    e.getStackTrace();
}
%>
</table>
</body>
</html>