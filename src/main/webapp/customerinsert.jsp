<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cusinsert" method="POST">
	
	<label for="email">Enter Your email :</label>
	<input type="text" id="email" name= "email">
	<br>
	<br>
	<label for="phone">Enter Your phone number :</label>
	<input type="text" id="phone" name= "phone">
	<br>
	<br>
	<label for="uname">Enter user name :</label>
	<input type="text" id="uname" name= "uname">
	<br>
	<br>
	<label for="pass">Enter password :</label>
	<input type="text" id="pass" name= "pass">
	<br>
	<br>
	
	<input type="submit" value="Create customer">
	<input type="reset" value="Rest details">
	</form>
</body>
</html>