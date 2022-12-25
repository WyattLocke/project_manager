<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Sponsor</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="w-50 m-auto mt-3">
		<h1 class="text-primary">Edit Sponsor</h1>
		<form:form class="form" action="/sponsor/edit/${project.id}/${sponsor.id}" method="post" modelAttribute="sponsor">
			<input type="hidden" name="_method" value="put"/>
			<div class="mb-2">
				<form:label path="name" class="mb-2">Name:</form:label>
				<form:errors path="name" class="text-danger"/>
				<form:input path="name" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="tier" class="mb-2">Tier:</form:label>
				<form:errors path="tier" class="text-danger"/>
				<form:input path="tier" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="amount" class="mb-2">Amount:</form:label>
				<form:input path="amount" type="text" class="form-control"/>
			</div>
			<form:hidden path="project" value="${project.id}"></form:hidden>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>