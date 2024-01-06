<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<div class="container">
		<form action="StudentController" method="get">
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">First
					Name</span> <input name="fname" type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">Last
					Name</span> <input name="lname" type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<div class="input-group mt-5 mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default">Email
				</span> <input name="email" type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default">
			</div>
			<input type="hidden" value="add" name="action">
			<button type="submit" class="btn btn-success">Add</button>
 
			</form>
			</div>
					
	

</body>
</html>