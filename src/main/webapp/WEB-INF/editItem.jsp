<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Item</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="w-50 m-auto mt-3">
		<h1 class="text-primary">Edit Item</h1>
		<form:form class="form" action="/item/edit/${project.id}/${item.id}" method="post" modelAttribute="item">
			<input type="hidden" name="_method" value="put"/>
			<div class="mb-2">
				<form:label path="name" class="mb-2">Name:</form:label>
				<form:errors path="name" class="text-danger"/>
				<form:input path="name" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="value" class="mb-2">Value:</form:label>
				<form:errors path="value" class="text-danger"/>
				<form:input path="value" type="text" class="form-control"/>
			</div>
			<form:hidden path="project" value="${project.id}"></form:hidden>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>