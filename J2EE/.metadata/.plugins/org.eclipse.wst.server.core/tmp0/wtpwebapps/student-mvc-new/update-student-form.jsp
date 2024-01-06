<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.aurionpro.model.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Inside Update student page</h1>


	<div class="container">
		<form action="StudentController" method="get">
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">First
					Name</span> <input name="fname" type="text"  value="${theStudent.firstName}"class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">Last
					Name</span> <input name="lname" type="text" value="${theStudent.lastName}" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">Email
				</span> <input name="email"value="${theStudent.email}" type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<input type="hidden" value="update" name="action">
		<input type="hidden" value="${theStudent.id }" name="id" >
			<button type="submit" class="btn btn-success">Update</button>
 
			</form>
			</div>
</body>
</html>