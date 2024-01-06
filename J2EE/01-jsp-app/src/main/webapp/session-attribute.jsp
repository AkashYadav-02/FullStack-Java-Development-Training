<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Session-Attribute Example</h2>
<% if (application.getAttribute("counter") == null) {
	application.setAttribute("counter", 0);
 
			}
 			int count = (Integer) application.getAttribute("counter");
			out.println("Old val: " + count);
 
			application.setAttribute("counter", ++count);
			out.println("<br>new val:" + count);
		  
 %>

 
</body>
</html>