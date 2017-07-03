
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VIEWALL</title>
</head>

<body bgcolor="yellow">
	<a href="Home.jsp"> HOME</a>

	<br>
	<br>
	<center>
		<form action="Findall" method="post">
			<h2>
				Click here to display Available books:</br>
			</h2>
			<button type="submit" value="all">SHOW ALL</button>
		</form>
		</br>
		</br>
		</br>
		<h3>
			<table>
				<tr>
					<td>id:</td>
					<td>Book name:</td>
					<td>Price:</td>

				</tr>

				<c:forEach var="book" items="${list1}">
					<tr>
						<td>${book.id}</td>
						<td>${book.name}</td>
						<td>${book.price}</td>
					</tr>
				</c:forEach>
			</table>
		</h3>
	</center>
</body>
</html>