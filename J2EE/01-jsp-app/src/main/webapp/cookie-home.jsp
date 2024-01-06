<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

	<%
	String favBook = "PHP";
		CookieTest[] cookies = request.getCookies();
		if (cookies != null) {
			for (CookieTest c : cookies) {
		if (c.getName().equals("favlang")) {
			      
			       favBook=c.getValue();
			
		}
			}
		}
	%>
	<h2>
		fav book is :
		<%=favBook%>
	</h2>
	<ul>
		<li>adbc bank</li>
		<li>adac bank</li>
		<li>asas bank</li>
	</ul>
	<h2>
		fav language is :
		<%=favBook%>
	</h2>
	<ul>
		<li>adbc bank</li>
		<li>adac bank</li>
		<li>asas bank</li>
	</ul>
	<h2>
		fav Tool is :
		<%=favBook%>
	</h2>
	<ul>
		<li>adbc bank</li>
		<li>adac bank</li>
		<li>asas bank</li>
	</ul>
	<a href='cookies-personlize-form.jsp'> Pesonallized experience </a>

</body>
</html>