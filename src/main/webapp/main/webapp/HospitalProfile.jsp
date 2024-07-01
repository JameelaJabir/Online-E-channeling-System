<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital</title>

</head>
<body>
<h1>Hospital Details</h1>
	<form action="search" method="post">
	    <input type="text" id="licenseNumber" name="licenseNumber" placeholder="Enter License Number">		
        <input type="submit" name="submit" value="Search Hospital">
    </form>
    
    <a href="AddHospital.jsp">
    <input type="button" name="insert" value="Add New Hospital">
    </a>
    <h1>All Hospitals</h1>
    <table>
        <tr>
            <th>Hospital Name</th>
            <th>Address</th>
            <th>Contact Number</th>
            <th>Email</th>
            <th>License Number</th>
            <th>Working Hours</th>
        </tr>
        <c:forEach var="hospital" items="${allHospitals}">
            <tr>
                <td>${hospital.hName}</td>
                <td>${hospital.hAddress}</td>
                <td>${hospital.hContactNumber}</td>
                <td>${hospital.hEmail}</td>
                <td>${hospital.hLicenseNumber}</td>
                <td>${hospital.hWorkinghours}</td>
            </tr>
        </c:forEach>
    </table>
    
    
</body>
</html>