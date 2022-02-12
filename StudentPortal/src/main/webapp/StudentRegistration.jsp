<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"> 
<title>Insert title here</title>
</head>
<body>
<div class="mainDiv">
<form action="studentReg" method ="post" class="shadow">
		<table class="table">
			<tr>
				<td><h1>Student Registration</h1></td>
				<td></td>
			</tr>

			<tr class="row">
				<td>First Name </td>
				<td><input type="text" name="fname"></td>
			</tr>
			
			<tr>
				<td> Last Name </td>
				<td><input type="text" name="lname"></td>
			</tr>

	        <tr>
				<td>Roll </td>
				<td><input type="number" name="roll"></td>
			</tr>

			<tr>
				<td>Department </td>
				<td><input type="text" name="dept"></td>
			</tr>
			
			<tr>
				<td>Gender </td>
				<td> 
				<select  name="gnd">
                     <option value="Male">Male</option>
                     <option value="Female">Female</option>
                     <option value="Other">Other</option>
               </select>
               </td>
			</tr>
			
			<tr>
			    <td>Mobile Number </td>
				<td><input type="number" name="mob"></td>
			</tr>
			
			
			<tr>
				<td>Email ID </td>
				<td><input type="email" name="email"></td>
			</tr>
			
			
			<tr>
				<td>Password </td>
				<td><input type="text" name="pass"></td>
			</tr>
			
				<tr>
				<td>Confirm Password</td>
				<td><input type="text" name="cpass"></td>
			</tr>

			<tr>
				<td><input id="btn" type="submit" name="submit" value="register"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>