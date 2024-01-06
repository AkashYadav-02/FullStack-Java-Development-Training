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
<title>Passbook</title>
</head>
<body class="container">
	<table class="table">
		<tr>
			<th>Id</th>
			<th>User Acc No.</th>
			<th>Beneficiary Acc No.</th>
			<th>User Acc Balance</th>
			<th>Amount</th>
			<th>Beneficiary Name</th>
			<th>User Acc Type</th>
			<th>Transaction type</th>	
			
			
					</tr>

		<c:forEach var="tr" items="${t_list}">
			<c:url var="updateLink" value="adminController">
				<c:param name="action" value="loadUser" />
				<c:param name="id" value="${tr.tid}" />
			</c:url>
			<c:url var="deleteLink" value="adminController">
				<c:param name="action" value="delete" />
				<c:param name="id" value="${tr.tid}" />
			</c:url>
			<c:set var="status" value="" />

			
			<tr>
				<td>${tr.tid}</td>
				<td>${tr.userAccount}</td>
				<td>${tr.baccount}</td>
				<td>${tr.userBalance}</td>
				<td>${tr.bamount}</td>
				  <td > ${tr.bname}</td>
				  <td>${tr.userAccountType}</td>
				  <td>${tr.transactionType}</td>
				  
							</tr>
		</c:forEach>

	</table>

</body>
</html>