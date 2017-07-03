<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserting Books</title>
</head>
<body bgcolor="grey">
	<br />
	<a href="Home.jsp"> HOME </a>
	<center>
		<form action="Addbook" method="post">
			<h1>ADDING NEW BOOK</h1>
			Enter Book ID: <input type="number" name="id"><br /> <br />Enter
			Book Name: <input type="text" name="name"><br /> <br />Enter
			Book price: <input type="number" name="price"><br />
			<br /> <input type="submit" value="ADD BOOK"><br />
		</form>
	</center>
</body>
</html>