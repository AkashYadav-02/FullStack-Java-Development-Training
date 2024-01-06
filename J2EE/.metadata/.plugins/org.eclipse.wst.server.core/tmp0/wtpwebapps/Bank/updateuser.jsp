<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container border mt-5 bg-light text-dark">
		<button type="button" name="back" class="btn btn-dark mb-4">
			<i class="fas fa-arrow-left"></i> Back
		</button>
		<form action="userController" class="col-md-7 mx-auto" method="get">
			<h4>Update ${user.firstName} ${user.lastName}'s Profile</h4>
			<hr>
			</select><br> <label for="firstname">FirstName : </label> <input
				type="text" class="form-control" name="firstname"
				value="${user.firstName}" required> <label for="lastname">LastName:
			</label> <input type="text" class="form-control" name="lastname"
				value="${user.lastName}" id="lastname" required> <label
				for="username">Username :</label> <input type="text"
				class="form-control" name="username" value="${user.userName}"
				id="username" required>

			<!-- Avoid displaying password field with sensitive data -->
			<label for="password">Password :</label> <input type="password"
				class="form-control" name="password" value="${user.getPassWord()}"
				id="pass" required> <input type="hidden" name="action"
				value="save"> <input type="hidden" name="id"
				value="${user.getId()}">
			<button type="action"  
				class="submit btn btn-outline-primary mt-3">Save</button>
		</form>
	</div>
</body>
<style>
.submit {
	margin-left: 7rem
}
.container {
	max-width: 600px;
	margin: auto;
	padding: 20px;
	border-radius: 8px;
	background-color: #fff;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
}
</style>
</html>