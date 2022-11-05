<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update data</title>
</head>
<body>


	<%
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
	%>
	
	<form action="#" method="post">
	
	<label for="id">Customer ID</label>
	<input type="text" id="id" name="id" value="<%= id%>" readonly>
	<br>
	<br>
	<label for="email">Email </label>
	<input type="email" id="email" name="email" value="<%= email%>">
	<br>
	<br>
	<label for="phone">Phone Number </label>
	<input type="text" id="phone" name="phone" value="<%= phone%>">
	<br>
	<br>
	<label for="username">UserName</label>
	<input type="text" id="username" name="username" value="<%= username%>">
	<br>
	<br>
	<label for="password">Password</label>
	<input type="password" id="password" name="password" value="<%= password%>">
	<br>
	<br>
	<input type="submit" name="sub-btn" value="Update My data">
	
	</form>
	
</body>
</html>