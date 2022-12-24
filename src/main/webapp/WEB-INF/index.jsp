<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class=" w-75 m-auto mt-4"> 
		<h1 class="mb-3 text-primary">Project Dashboard</h1>
		<div class="d-flex justify-content-between">
			<div class="w-25">
				<h4 class="mb-3">Hello Wesley,</h4>
				<p>Here you will find your current and previous projects. You can create new projects and manage their contents.</p>
				<a href="/project/new" class="btn btn-primary">New Project</a>
			</div>
			<div class="w-50">
				<h2>Current Projects</h2>
				<table class="table table-striped">
					<c:forEach var="project" items="${projects}">			
						<tr>
							<td><a href="/project/${project.id}"><c:out value="${project.name}"/></a></td>
						</tr>
					</c:forEach>					
				</table>
			</div>
		</div>
		<div class="mb-4 w-50 m-auto">
			<div class="m-auto mt-3">
				<h2 class="text-center">Previous Projects</h2>
				<table class="table table-striped">
				
					<tr>
						<td></td>
					</tr>
					
				</table>
			</div>
		</div>
		<div class="w-25 m-auto">
			<h2>View a Project</h2>
			<form action="/project/readonly" class="form">
				<div class="mb-3">				
					<label for="code" class="mb-2">Project Code:</label>
					<input type="text" name="code" class="form-control"/>
				</div>
				<button type="submit" class="btn btn-primary">Search</button>
			</form>
		</div>
	</div>
</body>
</html>