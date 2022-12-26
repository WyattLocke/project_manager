<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Personnel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="w-50 m-auto mt-3">
		<h1 class="text-primary">Edit Item</h1>
		<form:form class="form" action="/personnel/edit/${project.id}/${personnel.id}" method="post" modelAttribute="personnel">
			<input type="hidden" name="_method" value="put"/>
			<div class="mb-2">
				<form:label path="firstName" class="mb-2">First Name:</form:label>
				<form:errors path="firstName" class="text-danger"/>
				<form:input path="firstName" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="lastName" class="mb-2">Last Name:</form:label>
				<form:errors path="lastName" class="text-danger"/>
				<form:input path="lastName" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="contact" class="mb-2">Contact:</form:label>
				<form:errors path="contact" class="text-danger"/>
				<form:input path="contact" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="role" class="mb-2">Role:</form:label>
				<form:select path="role" type="text" class="form-control">
					<form:option value="staff">Staff</form:option>
					<form:option value="volunteer">Volunteer</form:option>
					<form:option value="scoreKeeper">Score Keeper</form:option>
				</form:select>
			</div>
			<form:hidden path="project" value="${project.id}"></form:hidden>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>