<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Session Example</h2>



<% if (session.getAttribute("counter") == null) {
				session.setAttribute("counter", 0);
 
			}
 
			int count = (Integer) session.getAttribute("counter");
			out.println("Old val: " + count);
 
			session.setAttribute("counter", ++count);
			out.println("<br>new val:" + count);
			session.setMaxInactiveInterval(5);	
 %>

 
</body>
</html>