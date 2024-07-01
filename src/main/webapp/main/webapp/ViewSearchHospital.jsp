<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Details</title>
<%@ include file="HospitalCSS.jsp" %>
<style>
    /* CSS for styling the table */
    table {
        width: 30%;
        margin: 20px auto;
        border-collapse: collapse;
        border: 1px solid #ccc;
    }

    th, td {
        padding: 8px;
        border: 1px solid #ccc;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    /* CSS for styling the buttons */
    .button-container {
        margin-top: 20px;
        text-align: center;
    }

    .button-container a {
        text-decoration: none;
        padding: 10px 20px;
        background-color: #007BFF;
        color: #fff;
        border: none;
        cursor: pointer;
        margin-right: 10px;
    }
</style>
</head>
<body>
	<table>
	
	<c:forEach var="hos" items="${hospitalDetails}">
	
	<c:set var="name" value ="${hos.hName}"/>
	<c:set var="address" value ="${hos.hAddress}"/>
	<c:set var="contactNumber" value ="${hos.hContactNumber}"/>
	<c:set var="email" value ="${hos.hEmail}"/>
	<c:set var="licenseNumber" value ="${hos.hLicenseNumber}"/>
	<c:set var="workingHours" value ="${hos.hWorkinghours}"/>
		
	
				<h2><center>Searched Hospital Details</center></h2>
				 
				<tr>
		
				<th>Hospital Name</th> 
				<td>${hos.hName}</td>
				</tr> 
				<tr>
				<th>Address  </th> 
				<td>${hos.hAddress}</td>
				</tr> 
				<tr>
				<th>Contact Number  </th>
				<td>${hos.hContactNumber}</td>
				</tr>
				<tr>
				<th>Email  </th>
				<td>${hos.hEmail}</td>
				</tr>
				<tr>
				<th>License Number  </th>
				<td>${hos.hLicenseNumber}</td>
				</tr> 
				<tr>
				<th>Working Hours  </th> 
				<td>${hos.hWorkinghours}</td>
				</tr> 
			
	</c:forEach>
	
	</table>
	
	<c:url value="UpdateHospital.jsp" var="hosUpdate">
		<c:param name="name" value="${name}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="contactNumber" value="${contactNumber}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="lNo" value="${licenseNumber}"/>
		<c:param name="wHours" value="${workingHours}"/>		
	</c:url>
	
	    
    <c:url value="DeleteHospital.jsp" var="hosDelete">
		<c:param name="name" value="${name}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="contactNumber" value="${contactNumber}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="lNo" value="${licenseNumber}"/>
		<c:param name="wHours" value="${workingHours}"/>	
	</c:url>
	
	<div class="button-cont">
	<a href="${hosUpdate}">
    <input class ="btn2" type="button" name="update" value="Update Hospital Data">
    </a>
	
	<a href="${hosDelete}">
    <input class ="btn3" type="button" name="delete" value="Delete Hospital Data">
    </a>
	</div>
</body>
</html>