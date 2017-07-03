<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="pink">
	<em><h1>WELCOME FOR REGISTERING PUBHUB100</h1></em>
	<form action="RegisterServlet"  method="post">
		<br /> ENTER YOUR NAME: <input type="text" name="name"><br />
		<br /> ENTER YOUR EMAIL: <input type="email" name="email"><br />
		<br /> ENTER YOUR PASSWORD: <input type="password" name="password">
		<br />
		<br /> <input type="submit" value="REGISTER">
	</form>
</body>
</html>