<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>UserList</title>
</head>
<body class="container">
	<table class="table">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Name</th>
			<th>Status</th>
			<th>Update</th>

			<th>Disable</th>
		</tr>

		<c:forEach var="tr" items="${user_list}">
			<c:url var="updateLink" value="adminController">
				<c:param name="action" value="loadUser" />
				<c:param name="id" value="${tr.getId()}" />
			</c:url>
			<c:url var="deleteLink" value="adminController">
				<c:param name="action" value="delete" />
				<c:param name="id" value="${tr.getId()}" />
			</c:url>
			<c:set var="status" value="" />

			<c:choose>
				<c:when test="${tr.active == 1}">
					<c:set var="status" value="Enable" />
				</c:when>
				<c:when test="${tr.active == 0}">
					<c:set var="status" value="Disable" />
				</c:when>
			</c:choose>


			<tr>
				<td>${tr.id}</td>
				<td>${tr.firstName}</td>
				<td>${tr.lastName}</td>
				<td>${tr.userName}</td>
				   <td > ${status}</td>
				<td><a href="${updateLink}" class="btn btn-warning">Update
				</a></td>
				<td><a href="${deleteLink}" class="btn btn-danger">Disable </a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>