<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
 String val=(String) request.getParameter("fav");
      out.println("<h2> Your Selected language is :"+val);
  	CookieTest newCookie=new CookieTest("favlang",val);
 	newCookie.setMaxAge(60*60*24);
 	response.addCookie(newCookie);
 %>
     
     <a  href="cookie-home.jsp">Home Page</a>
     
</body>
</html>