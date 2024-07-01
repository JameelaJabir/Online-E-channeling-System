<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Hospital</title>
<%@ include file="HospitalCSS.jsp" %>
</head>
<body>
<div class ="background">

            <div class ="container">
            
			<h2>Add New Hospital</h2>
    			<form action="insert" method="post">
    			<div class="form1">    			
		        <!-- Hospital Name -->
		        <div class ="form-group">
		        <label for="hospitalName">Hospital Name:</label>
		        <input type="text" placeholder="Nawaloka Base Hospital" id="hospitalName" name="hospitalName" required><br><br>
		 		</div>
		        <!-- Address -->
		        <div class ="form-group">
		        <label for="hospitalAddress">Address:</label>
		        <input type="text" placeholder="Negombo" id="hospitalAddress" name="hospitalAddress" required><br><br>
				</div>
		        <!-- Contact Number -->
		        <div class ="form-group">
		        <label for="contactNumber">Contact Number:</label>
		        <input type="tel" placeholder="07xx xxx xxx" id="contactNumber" name="contactNumber" required><br><br>
				</div>
		        <!-- Email -->
		        <div class ="form-group">
		        <label for="hospitalEmail">Email:</label>
		        <input type="email" placeholder="nawaloka@gmail.com" id="hospitalEmail" name="hospitalEmail"><br><br>
				</div>
		        <!-- License Number -->
		        <div class ="form-group">
		        <label for="licenseNumber">License Number:</label>
		        <input type="text" placeholder="SL-NVL-563" id="licenseNumber" name="licenseNumber"><br><br>
				</div>
		 		<!-- Working Hours -->
		 		<div class ="form-group">
		        <label for="workingHours">Working Hours:</label>
		        <input type="text" placeholder="18" id="workingHours" name="workingHours"><br><br>
				</div>
				<!-- Submit Button -->
				<div class ="form-group">
				
		        <input class ="btn" type="submit" name="submit" value="Add Hospital">
		    
		    	</div>
                
                </div>
		    </form>
		</div>
    </div>
    <div style="margin-bottom: -8px;"></div>
</body>
</html>