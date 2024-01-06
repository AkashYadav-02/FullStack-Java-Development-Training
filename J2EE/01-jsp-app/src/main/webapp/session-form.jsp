<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	<form action="#" method="get">
		<div class="mb-3">
			<label for="task" class="form-label">Task</label> <input type="text"
				name="input" class="form-control" id="task" aria-describedby="text">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
	</form>
 
	<%
	String item = request.getParameter("input");
	List<String> todos = (List<String>) session.getAttribute("todoList");
	if (todos == null) {
		todos = new ArrayList<String>();
	}
	if (item != null && item != " ") {
		if (!todos.contains(item)) {
			todos.add((String) item);
			session.setAttribute("todoList", todos);
		}
	}
 
	for (String task : todos) {
		out.println(task);
	}
	%>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</html>