<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update portal</title>
</head>
<body>
	<h1>Student Update Portal</h1>
	<hr>
		<form action="updateDetails" method="post">
			
			ID <input type="text" name="id" value="${student.id}"/><br><br>
			Name <input type="text" name="name" value="${student.name}"/><br><br>
			City <input type="text" name="city" value="${student.city}"/><br><br>
			Email <input type="email" name="email" value="${student.email}"/><br><br>
			Mobile <input type="number" name="mobile" value="${student.mobile}"/><br><br>
			PinCode <input type="number" name="pincode" value="${student.pincode}"/><br><br>
			<input type="submit" value="update"/>
		
		</form>
		${msg} 
</body>
</html>