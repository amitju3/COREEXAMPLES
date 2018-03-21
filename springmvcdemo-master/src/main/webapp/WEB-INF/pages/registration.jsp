<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Users</h1>
		<form:form method="POST" action="${pageContext.request.contextPath}/user/save"	modelAttribute="userbean">
			<table>
				<tr>
					<td>UserId:</td>
					<td><form:input path="userId" disabled="true" /></td>
				</tr>
				<tr>
					<td>FirstName:</td>
					<td><form:input path="fname" /></td>
				</tr>
				<tr>
					<td>LastName:</td>
					<td><form:input path="lname" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="uAddress" /></td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td><form:input path="userPhone" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit" />
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>