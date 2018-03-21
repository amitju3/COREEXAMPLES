<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management Sample App</title>
</head>
<body>
	<div align="center">
		<h1>User's List</h1>
		
		<table border="1">

			<th>UserId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="user" items="${userslist}">
				<tr>
					<td>${user.userId}</td>
					<td>${user.fname}</td>
					<td>${user.lname}</td>
					<td>${user.uAddress}</td>
					<td>${user.userPhone}</td>
					<td><a href="update?id=${user.userId}">EditUser</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteuser?id=${user.userId}">DeleteUser</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="navigatetoreg">here</a>
		</h4>
	</div>
</body>
</html>