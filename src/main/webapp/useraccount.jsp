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
<table border="2">
	<c:forEach var="cus" items="${cusDetails}"> 
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="username" value="${cus.username}"/>
	<c:set var="password" value="${cus.password}"/>
	
		
		
		
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
		</c:forEach>
</table>
	
	<c:url value="updatecustomer.jsp" var="cusupdate">
	
	<c:param name="id" value="${id}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}">
		<input type="button" name="update-btn" value="Update My data">
	</a>	
	
	
</body>
</html>