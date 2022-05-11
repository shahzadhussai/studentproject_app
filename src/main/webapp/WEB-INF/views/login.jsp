<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login portal</title>
</head>
<body>
	<h1>Student Login Portal</h1>
	<hr>
		<form action="saveDetails" method="post">

			Name <input type="text" name="name"/><br><br>
			City <input type="text" name="city"/><br><br>
			Email <input type="email" name="email"/><br><br>
			Mobile <input type="number" name="mobile"/><br><br>
			PinCode <input type="number" name="pincode"/><br><br>
			<input type="submit" value="save"/>
		
		</form>
		${msg} 
</body>
</html>