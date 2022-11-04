<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="login" method="post">
	
		<label for = "username">User Name : </label>
		<input type="text" id = "Username" name = "username">
		<br/>
		<br/>
		<label for = "pass">Password :</label>
		<input type="text" id="pass" name="pass">
		<br/> 
		<br/>
		
		<input type="submit" value= "Login">
	</form>
</body>
</html>