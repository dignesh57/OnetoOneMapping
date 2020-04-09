<%@page import="com.Dao.EmpDao"%>
<%@page import="com.Bean.EmpBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<EmpBean> employees=EmpDao.getAllEmployees(); %>
<body>
<table>
<tr>
<td>ID</td>
<td>USERNAME</td>
<td>FNAME</td>
<td>EMAIL</td>
<td>ADDRESS</td>
<td>UPDATE</td>
<td>DELETE</td>
</tr>
<%for(EmpBean e:employees){ %>
<form action="ActionController" method="post">
<tr>
<td><%=e.getEmpid() %></td>
<td><%=e.getUname() %></td>
<td><%=e.getEpi().getFname() %></td>
<td><%=e.getEpi().getEmail() %></td>
<td><%=e.getEpi().getAddress() %></td>
<td><input type="submit" name="action" value="updateEmp"></td>
<td><input type="submit" name="action" value="deleteEmp"></td>
<input type="hidden" name="id" value="<%=e.getEmpid()%>">
</tr>
</form>
<% } %>
</table>
</body>
</body>
</html>