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
	<h1>Inside student page</h1>


	<hr />
	<a href="add-student-from.jsp" class="btn btn-primary  mt-3"> Add
		student</a>
	<div class="container mt-5">
	  
	<form action="StudentController" method="get">
	<label for="searchBy">Search By:</label>
            <select class="form-control" name="searchBy" id="searchBy">
               <option   Select  >Choose</option>
                <option value="id">ID</option>
                <option value="first_name">First Name</option>
                 <option value="last_name">Last Name</option>
                  <option value="email">Email</option>
                
            </select>
<input class="form-control" type="text" name="value">
<input type="hidden" name="action" value="search">
<button type="submit" class="btn btn-success">Search</button>
</form>

		<table class=" table table-striped ">
			<thead>
				<tr>
					<th>id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<c:forEach var="student" items="${studentlist}">

				<c:url var="updateLink" value="StudentController">
					<c:param name="action" value="load" />
					<c:param name="id" value="${student.getId()}" />
				</c:url>
				<c:url var="deleteLink" value="StudentController">
					<c:param name="action" value="delete" />
					<c:param name="id" value="${student.getId()}" />
				</c:url>
				<tr>


					<td>${student.getId()}</td>
					<td>${student.getFirstName()}</td>
					<td>${student.getLastName()}</td>
					<td>${student.getEmail()}</td>
					<td><a href="${updateLink}" class="btn btn-warning">Update
					</a></td>
					<td><a href="${deleteLink}" class="btn btn-danger">Delete
					</a></td>
				</tr>
			</c:forEach>

		</table>
</body>
</html>