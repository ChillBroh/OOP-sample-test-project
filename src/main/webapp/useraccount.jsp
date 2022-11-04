<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="cus" items="${cusDetails}"> 
		
		<table border="2">
		
		<thead>
		
		<tr>
		
			<td>ID</td>
			<td>Email</td>
			<td>Phone</td>
			<td>User Name</td>
			<td>Password</td>
			
		</tr>
			
		</thead>
		
		<tbody>
		
		<tr>
			<td>${cus.id}</td>
			<td>${cus.email}</td>
			<td>${cus.phone}</td>
			<td>${cus.username}</td>
			<td>${cus.password}</td>
		</tr>
		
		</tbody>
		</table>
		
	</c:forEach>
</body>
</html>