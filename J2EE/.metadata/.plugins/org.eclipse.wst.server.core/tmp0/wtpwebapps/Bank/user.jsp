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
<title>Login</title>
<style>
body {
	background-color: #f8f9fa;
}

.form-container {
	max-width: 500px;
	margin: auto;
	padding: 20px;
	border-radius: 8px;
	background-color: #fff;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
}
</style>
</head>
<body>
<div class="container mt-5 form-container">
		<h1 class="text-center mb-4">Welcome To ABC Bank</h1>
		<form action="userController" method="get">
		 <div class="mb-3 text-center">
		<button type="submit" class="btn btn-primary  active "  name="action" value="transaction">Transaction</button>
		<button type="submit" class="btn btn-success active " name="action" value="passbook">Passbook</button>
		<button type="submit" class="btn btn-secondary active " name="action" value="edit">edit</button>
			</div>
			<button type="submit" class="btn btn-danger  active " name ="action" value=" logout">Logout</button>
		</form>
	</div>
</body>
</html>