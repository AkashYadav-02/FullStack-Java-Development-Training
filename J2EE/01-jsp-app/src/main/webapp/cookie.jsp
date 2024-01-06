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
CookieTest[] cookies=request.getCookies();
    boolean isColorSet=false;
    
    if(cookies!=null){
    	for(CookieTest c: cookies){
    		if( c.getName().equals("color")){
    			String bgcolor=c.getValue();
    			out.println("<p> Cookie is set color is :"+bgcolor+"</p>");
    			isColorSet=true;
    		}
    	}
    }
    if(!isColorSet){
    	CookieTest newCookie=new CookieTest("color","red");
    	newCookie.setMaxAge(60*60*24);
    	response.addCookie(newCookie);
    	isColorSet=true;
    }
%>
</body>
</html>