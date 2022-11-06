<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">

	body {
	font-family: Hind semiBold;
}

</style>
</head>
<body>
		<h1>LOGIN PAGE</h1>
		<form action="login" method="post">
	
		<label for = "username">User Name : </label>
		<input type="text" id = "Username" name = "username" placeholder = "Enter UserName">
		<br/>
		<br/>
		<label for = "pass">Password :</label>
		<input type="password" id="pass" name="pass" placeholder="Enter Password">
		<br/> 
		<br/>
		
		<input type="submit" name="sb-btnl"value= "Login">
	</form>
	
</body>
</html>