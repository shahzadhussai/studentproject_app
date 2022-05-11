<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student record</title>
</head>
<body>
<h1>List All Student Record</h1>
<hr>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>City</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>PinCode</th>
		
		<th>Delete</th>
		<th>Update</th>
	</tr>
		
		<c:forEach items="${students}" var="student">  
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.city}</td>
				<td>${student.email}</td>
				<td>${student.mobile}</td>
				<td>${student.pincode}</td>
				
				<td><a href="delete?id=${student.id}">delete</a></td>
				<td><a href="update?id=${student.id}">update</a></td>
			</tr>
		</c:forEach> 
	
</table>

</body>
</html>