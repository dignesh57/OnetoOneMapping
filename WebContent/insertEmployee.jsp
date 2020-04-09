<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="insert" method="post" action="ActionController">
	<table>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="uname"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" name="address"></td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Insert">
			</td>
		</tr>
	</table>
</form>
</body>
</html>