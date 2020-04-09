<%@page import="com.Bean.EmpPersonInfo"%>
<%@page import="com.Bean.EmpBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%EmpBean e=(EmpBean)session.getAttribute("emp"); 
	EmpPersonInfo epi=e.getEpi();
%>
<form name="update" method="post" action="ActionController">
	<table>
		<tr>
			<td>EMP ID</td>
			<td><input type="text" name="empid" value="<%=e.getEmpid()%>" readonly="readonly"></td>
		</tr>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="uname" value="<%=e.getUname()%>"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=epi.getFname()%>"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=epi.getEmail()%>"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" name="address" value="<%=epi.getAddress()%>"></td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="update">
			</td>
		</tr>
	</table>
</form>
</body>
</html>