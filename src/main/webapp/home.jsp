<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="submitAction" method="post">
		<table>
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>