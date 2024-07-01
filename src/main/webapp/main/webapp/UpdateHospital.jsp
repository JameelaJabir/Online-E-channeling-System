<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Hospital</title>
<%@ include file="HospitalCSS.jsp" %>
</head>
<body>
	
<%
	String hospitalName = request.getParameter("name");
	String hospitalAddress = request.getParameter("address");
	String hosContactNumber = request.getParameter("contactNumber");
	String hospitalEmail = request.getParameter("email");
	String licenseNo = request.getParameter("lNo");
	String wHours = request.getParameter("wHours");
%>
<div class ="background">
	<div class ="container">
	<h2>Update Hospital Details</h2>
	    <form action="update" method="post">
	    <div class="form1"> 
	        <!-- Hospital Name -->
	        <div class ="form-group">
	        <label for="hospitalName">Hospital Name:</label>
	        <input type="text" id="hospitalName" name="hospitalName" value="<%= hospitalName %>"><br><br>
			</div>
	        <!-- Address -->
	        <div class ="form-group">
	        <label for="hospitalAddress">Address:</label>
	        <input type="text" id="hospitalAddress" name="hospitalAddress" value="<%= hospitalAddress%>"><br><br>
			</div>
	        <!-- Contact Number -->
	        <div class ="form-group">
	        <label for="contactNumber">Contact Number:</label>
	        <input type="tel" id="contactNumber" name="contactNumber" value="<%= hosContactNumber %>"><br><br>
			</div>
	        <!-- Email -->
	        <div class ="form-group">
	        <label for="hospitalEmail">Email:</label>
	        <input type="email" id="hospitalEmail" name="hospitalEmail" value="<%= hospitalEmail %>"><br><br>
			</div>
	        <!-- License Number -->
	        <div class ="form-group">
	        <label for="licenseNumber">License Number:</label>
	        <input type="text" id="licenseNumber" name="licenseNumber" value="<%= licenseNo %>"readonly><br><br>
			</div>
	 		<!-- Working Hours -->
	 		<div class ="form-group">
	        <label for="workingHours">Working Hours:</label>
	        <input type="text" id="workingHours" name="workingHours" value="<%= wHours %>"><br><br>
			</div>
			<!-- Submit Button -->
			<div class ="form-group">
	        <input class ="btn2" type="submit" name="submit" value="Update Hospital">
     		</div>
         </div>
     </form>
   </div>
</div>
<div style="margin-bottom: -8px;"></div>
</body>
</html>