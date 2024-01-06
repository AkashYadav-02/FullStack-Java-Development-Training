<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.model.aurionpro.GetName" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<h1>Hello world</h1>
    <h2> <%= GetName.getName() %></h2>	

	<h2>
		current date :<%=new Date()%></h2>

	


	<%!String welcome(String val) {

		return "Welcome" + val;

	}%>


	 <h2> employee name :<%= welcome("Yash") %></h2>
	 </body>
</html>