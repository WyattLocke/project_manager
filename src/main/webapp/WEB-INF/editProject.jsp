<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Project</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="w-50 m-auto mt-3">
		<h1 class="text-primary">Edit Project</h1>
		<form:form class="form" action="/project/edit/${project.id}" method="post" modelAttribute="project">
			<input type="hidden" name="_method" value="put"/>
			<div class="mb-2">
				<form:label path="name" class="mb-2">Name:</form:label>
				<form:errors path="name" class="text-danger"/>
				<form:input path="name" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="code" class="mb-2">Code:</form:label>
				<form:errors path="code" class="text-danger"/>
				<form:input path="code" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="description" class="mb-2">Description:</form:label>
				<form:errors path="description" class="text-danger"/>
				<form:input path="description" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="venue" class="mb-2">Venue:</form:label>
				<form:errors path="venue" class="text-danger"/>
				<form:input path="venue" type="text" class="form-control"/>
			</div>
			<div class="mb-2">
				<form:label path="catering" class="mb-2">Catering:</form:label>
				<form:errors path="catering" class="text-danger"/>
				<form:input path="catering" type="text" class="form-control"/>
			</div>
			<div class="mb-4">
				<form:label path="entertainment" class="mb-2">Entertainment:</form:label>
				<form:errors path="entertainment" class="text-danger"/>
				<form:input path="entertainment" type="text" class="form-control"/>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
		<div class="mt-3">
			<form action="/project/delete/${project.id}" method="post">
				<input type="hidden" name="_method" value="delete"/>
				<button class="btn btn-danger">Delete Project</button>
			</form>
		</div>
	</div>
</body>
</html>