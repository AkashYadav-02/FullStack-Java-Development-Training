<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.model.aurionpro.Students"%>
<%@ page import="java.util.*"%>
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

	<c:set var="name" value="Akash ">
	</c:set>
	Welcome: ${name}

	<%
	String[] names = { "Yash", "Tanish" };
	pageContext.setAttribute("students", names);
	%>

	<c:forEach var="student" items="${students}">
		</br> ${student}
  </c:forEach>

	<%
	List<Students> students = new ArrayList<>();
	students.add(new Students("Akash ", "Yadav", true, 40));
	students.add(new Students("Yash", "Shinde", true, 90));
	students.add(new Students("Dipika", "Adak", true, 95));
	students.add(new Students("Tanish", "Batham", false, 100));
	students.add(new Students("Sahil", "Shinde", true, 51));
	students.add(new Students("Aman", "Singh", false, 30));

	pageContext.setAttribute("listOfStudent", students);
	%>

	<div class="container mt-5">
		<table class=" table table-striped ">
			<thead>
				<tr>

					<th>First Name</th>
					<th>Last Name</th>
					<th>Active</th>
					<th>Percentage</th>
					<th>Grade</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="student" items="${listOfStudent}">
					<tr>
						<td>${student.getFirstName()}</td>
						<td>${student.getLastName()}</td>


						<c:if test="${student.isSportsPersom()}">
							<td>5+ Extra Marks</td>
						</c:if>
						<c:if test="${not student.isSportsPersom()}">
							<td>Play more games</td>
						</c:if>


						<td>${student.percentage}</td>

						<c:choose>
						
						<c:when   test="${student.percentage>85 }">
						<td>Distinction</td>
						</c:when>
						
						<c:when   test="${student.percentage>60 }">
						<td>  First Class</td>
						</c:when>
						
						<c:when   test="${student.percentage>40 }">
						<td>  Second Class</td>
						</c:when>
						<c:otherwise>
						<td> Fail</td>
						</c:otherwise>
						</c:choose>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<c:set var="data" value="hello world" />

  Length of the string
  <b>${data}</b>: ${fn:length(data)}

  <br />
  <br /> Uppercase version of the string
  <b>${data}</b>: ${fn:toUpperCase(data)}

  <br />
  <br /> Does the string
  <b>${data}</b> start with
  <b>hello</b>?: ${fn:startsWith(data, "hello")}
  <br/>
  <c:set var="namesString" value="${fn: join(students,', ')}"></c:set>
  Student Names :${namesString}

	</div>






</body>
</html>