<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> </h1>
  <h2>  Name :<%=request.getParameter("name") %></h2>
    <h2>  Email :<%=request.getParameter("email") %></h2>
      <h2>  Degree :<%=request.getParameter("degree") %></h2>
      
        <h2>  Gender :<%=request.getParameter("gender") %></h2>
          <h2>  Specialization :<% String[] arr = request.getParameterValues("specialization");
if (arr != null) {
    for (String st : arr) {%>
    <%= st+ " " %> 
<%
    }
}
%></h2>
          
<%--         
 --%>            
</body>
</html>