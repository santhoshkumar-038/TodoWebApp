<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
<title>Login Page</title>
</head>
<body>
	<div class="container">
	<h1>Welcome to login page!</h1>
	<br>
	<br>
	<pre>${errorMessage}</pre>
	<form method="post">
		Name: <input type=text name="name"/><br><br>
		Password: <input type=password name="password"/><br><br>
		<input type=submit />
	</form>
	</div>
	
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>