<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShowByPrice</title>
</head>
<body bgcolor="orange">
	<a href="Home.jsp"> HOME</a>
	<center>
		<h3>SEARCHIMG BOOK WITHIN RANGE:</h3>
		<form action="findbyprice" method="post">
			ENTER MINIMUM PRICE:<input type="text" name="min"></br>
			</br> ENTER MAXIMUM PRICE:<input type="text" name="max"></br>
			</br>
			<Button type="submit" " value="max">SEARCH</Button>
		</form>
		<table>
			<tr>
				<td>Book Names:</td>
			</tr>
		</table>
		<c:forEach var="books" items="${list}">
			<tr>
				<td>${books.name}</td>
			</tr>
			</br>
		</c:forEach>
	</center>
</body>
</html>