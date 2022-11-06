<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete account</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		
		
		
	%>
	<h1>DELETE CUSTOMER ACCOUNT</h1>
	<form action="deletecustomer" method="post">
	
	<label for="id">Customer ID</label>
	<input type="text" id="id" name="id" value="<%= id%>" readonly>
	<br>
	<br>
	<label for="email">Email </label>
	<input type="email" id="email" name="email" value="<%= email%>" readonly>
	<br>
	<br>
	<label for="phone">Phone Number </label>
	<input type="text" id="phone" name="phone" value="<%= phone%>" readonly>
	<br>
	<br>
	<label for="username">UserName</label>
	<input type="text" id="username" name="username" value="<%= username%>" readonly>
	<br>
	<br>
	<input type="submit" name="del-btn" value="Delete My account">
	
	</form>
	
</body>
</html>