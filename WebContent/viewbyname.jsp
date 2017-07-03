<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FIND BY NAME</title>
</head>
<body>
	<a href="Home.jsp"> HOME</a>
	<form action="findbyname"  method="post">
		ENTER BOOK NAME; <input type="text" name="name"> <input
			type="submit" value="SEARCH">

	</form>
	<table>
		<tr>
			<td>Book Names:</td>
			<td>Book ID:</td>
		</tr>
	</table>
	<c:forEach var="books" items="${list}">
		<tr>
			<td>${books.name}</td>		
			<td>${books.id}</td>
		</tr>
		</br>
	</c:forEach>
	</center>
</body>
</html>