<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="${project.name}"/></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="w-75 m-auto mt-4">
		<div class="d-flex justify-content-between">
			<h1 class="text-primary text-center"><c:out value="${project.name}"/></h1>
			<a href="/"><button class="btn btn-primary">Dashboard</button></a>
		</div>
		<div class="mb-5">
			<div class="w-50">
				<h5><c:out value="${project.description}"/></h5>
			</div>
		</div>
		<div class="mb-5">
			<a href="/project/edit/${project.id}"><button class="btn btn-primary">Edit Project</button></a>
		</div>
		<div class="mb-5">
			<h3>Sponsors:</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Tier</th>
						<th>Amount</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>				
					<c:forEach var="sponsor" items="${project.sponsors}">
					<tr>
						<td><c:out value="${sponsor.name}"/></td>
						<td><c:out value="${sponsor.tier}"/></td>
						<td>$<c:out value="${sponsor.amount}"/></td>
						<td class="d-flex">
							<a href="/sponsor/edit/${project.id}/${sponsor.id}"><button class="btn btn-success me-2">Edit</button></a>
							<form action="/sponsor/delete/${project.id}/${sponsor.id}" method="post">
								<input type="hidden" name="_method" value="delete"/>
								<button class="btn btn-danger">Delete</button>
							</form>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="/sponsor/new/${project.id}"><button class="btn btn-primary">New Sponsor</button></a>
		</div>
		<div class="d-flex justify-content-between mb-5">		
			<div class="w-50 me-4">		
				<div>
					<h3>Logistics:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Venue: </b><c:out value="${project.venue}"/></td>
							<td>  
								<form action="/venue/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.venue}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Catering: </b><c:out value="${project.catering}"/></td>
							<td>  
								<form action="/catering/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.catering}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Entertainment: </b><c:out value="${project.entertainment}"/></td>
							<td>  
								<form action="/entertainment/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.entertainment}">
								</form>
							</td>
						</tr>
					</table>
				</div>
				<div>
					<h3>Products:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Shirts</b></td>
							<td>  
								<form action="/shirts/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.shirts}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Hats</b></td>
							<td>  
								<form action="/hats/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.hats}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Swag</b></td>
							<td>  
								<form action="/swag/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.swag}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Ditty Bags</b></td>
							<td>  
								<form action="/dittybags/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.dittyBags}">
								</form>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="w-50">		
				<div>
					<h3>Administrative:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Registration</b></td>
							<td>  
								<form action="/registration/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.registration}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Website</b></td>
							<td>  
								<form action="/website/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.website}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Print Materials</b></td>
							<td>  
								<form action="/printmaterials/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.printMaterials}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Scoring Devices</b></td>
							<td>  
								<form action="/scoringdevices/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.scoringDevices}">
								</form>
							</td>
						</tr>
					</table>
				</div>
				<div>
					<h3>Finance:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Bank</b></td>
							<td>  
								<form action="/bank/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.bank}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Cash Bags</b></td>
							<td>  
								<form action="/cashbags/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.cashBags}">
								</form>
							</td>
						</tr>
						<tr>
							<td><b>Cash Boxes</b></td>
							<td>  
								<form action="/cashboxes/change/${project.id}/${checklist.id}" method="post">
									<input type="hidden" name="_method" value="put"/>
									<input type="submit" value="${checklist.cashBoxes}">
								</form>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div class="w-75 m-auto">		
			<div class="mb-5">
				<h3>Fundraising Items(Value):</h3>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Name</th>
							<th>Value</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>					
						<c:forEach var="item" items="${project.fundraisingItems}">
							<tr>
								<td><c:out value="${item.name}"/></td>
								<td>$<c:out value="${item.value}"/></td>
								<td class="d-flex">
									<a href="/item/edit/${project.id}/${item.id}"><button class="btn btn-success me-2">Edit</button></a>
									<form action="/item/delete/${project.id}/${item.id}" method="post">
										<input type="hidden" name="_method" value="delete"/>
										<button class="btn btn-danger">Delete</button>
									</form>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="/item/new/${project.id}"><button class="btn btn-primary">New Item</button></a>
			</div>
			<div>
				<h3>Personnel:</h3>
				<div>
					<h4>Staff</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Contact</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>					
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'staff'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
									<td>
										<form action="/personnel/delete/${project.id}/${person.id}" method="post">
											<input type="hidden" name="_method" value="delete"/>
											<button class="btn btn-danger">Delete</button>
										</form>
									</td>
								</tr>
							</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div>
					<h4>Volunteers</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Contact</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'volunteer'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
									<td>
										<form action="/personnel/delete/${project.id}/${person.id}" method="post">
											<input type="hidden" name="_method" value="delete"/>
											<button class="btn btn-danger">Delete</button>
										</form>
									</td>
								</tr>
							</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div>
					<h4>Score Keepers</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Contact</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>					
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'scoreKeeper'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
									<td>
										<form action="/personnel/delete/${project.id}/${person.id}" method="post">
											<input type="hidden" name="_method" value="delete"/>
											<button class="btn btn-danger">Delete</button>
										</form>
									</td>
								</tr>
							</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<a href="/personnel/new/${project.id}"><button class="btn btn-primary mb-5">New Personnel</button></a>
			</div>
		</div>
	</div>
</body>
</html>