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
			<h3>Sponsors:</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Name</th>
						<th>Tier</th>
						<th>Amount</th>
					</tr>
				</thead>
				<tbody>				
					<c:forEach var="sponsor" items="${project.sponsors}">
					<tr>
						<td><c:out value="${sponsor.name}"/></td>
						<td><c:out value="${sponsor.tier}"/></td>
						<td>$<c:out value="${sponsor.amount}"/></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="d-flex justify-content-between mb-5">		
			<div class="w-50 me-4">		
				<div>
					<h3>Logistics:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Venue: </b><c:out value="${project.venue}"/></td>
							<c:choose>
								<c:when test = "${checklist.venue.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.venue}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.venue}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Catering: </b><c:out value="${project.catering}"/></td>
							<c:choose>
								<c:when test = "${checklist.catering.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.catering}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.catering}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Entertainment: </b><c:out value="${project.entertainment}"/></td>
							<c:choose>
								<c:when test = "${checklist.entertainment.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.entertainment}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.entertainment}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</table>
				</div>
				<div>
					<h3>Products:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Shirts: </b></td>
							<c:choose>
								<c:when test = "${checklist.shirts.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.shirts}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.shirts}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Hats: </b></td>
							<c:choose>
								<c:when test = "${checklist.hats.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.hats}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.hats}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Swag: </b></td>
							<c:choose>
								<c:when test = "${checklist.swag.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.swag}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.swag}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Ditty Bags: </b></td>
							<c:choose>
								<c:when test = "${checklist.dittyBags.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.dittyBags}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.dittyBags}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</table>
				</div>
			</div>
			<div class="w-50">		
				<div>
					<h3>Administrative:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Registration: </b></td>
							<c:choose>
								<c:when test = "${checklist.registration.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.registration}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.registration}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Website: </b></td>
							<c:choose>
								<c:when test = "${checklist.website.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.website}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.website}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Print Materials: </b></td>
							<c:choose>
								<c:when test = "${checklist.printMaterials.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.printMaterials}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.printMaterials}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Scoring Devices: </b></td>
							<c:choose>
								<c:when test = "${checklist.scoringDevices.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.scoringDevices}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.scoringDevices}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</table>
				</div>
				<div>
					<h3>Finance:</h3>
					<table class="table table-striped">
						<tr>
							<td><b>Bank: </b></td>
							<c:choose>
								<c:when test = "${checklist.bank.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.bank}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.bank}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Cash Bags: </b></td>
							<c:choose>
								<c:when test = "${checklist.cashBags.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.cashBags}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.cashBags}"/></td>
								</c:otherwise>
							</c:choose>
						</tr>
						<tr>
							<td><b>Cash Boxes: </b></td>
							<c:choose>
								<c:when test = "${checklist.cashBoxes.equals('in progress')}">							
									<td class="text-warning"><c:out value="${checklist.cashBoxes}"/></td>
								</c:when>
								<c:otherwise>
									<td class="text-success"><c:out value="${checklist.cashBoxes}"/></td>
								</c:otherwise>
							</c:choose>
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
						</tr>
					</thead>
					<tbody>					
						<c:forEach var="item" items="${project.fundraisingItems}">
							<tr>
								<td><c:out value="${item.name}"/></td>
								<td>$<c:out value="${item.value}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="mb-4">
				<h3>Personnel:</h3>
				<div>
					<h4>Staff</h4>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Contact</th>
							</tr>
						</thead>
						<tbody>					
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'staff'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
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
							</tr>
						</thead>
						<tbody>
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'volunteer'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
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
							</tr>
						</thead>
						<tbody>					
							<c:forEach var="person" items="${project.personnel}">
							<c:if test="${person.role == 'scoreKeeper'}">						
								<tr>
									<td><c:out value="${person.firstName}"/></td>
									<td><c:out value="${person.lastName}"/></td>
									<td><c:out value="${person.contact}"/></td>
								</tr>
							</c:if>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>