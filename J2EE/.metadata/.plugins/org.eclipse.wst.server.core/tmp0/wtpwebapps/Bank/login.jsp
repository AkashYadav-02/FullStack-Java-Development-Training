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
		<form action="loginController" method="get">
			<div class="mb-3">
				<label class="form-label">Select Role:</label>
				<div class="d-flex justify-content-start">
					<div class="form-check form-check-inline me-3">
						<input class="form-check-input" type="radio" name="action"
							value="admin" id="admin" required> <label
							class="form-check-label" for="admin">Admin</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="action"
							value="user" id="user" required> <label
							class="form-check-label" for="user">User</label>
					</div>
				</div>
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email:</label> <input
					type="text" class="form-control" id="email" name="email" required>
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password:</label> <input
					type="password" class="form-control" id="password" name="password"
					required>
			</div>
			<button type="submit" class="btn btn-primary  active ">Login</button>
		</form>
	</div>
</body>
</html>
