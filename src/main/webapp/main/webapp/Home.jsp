<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
.container {
    background-image: url('Images/home3.jpg'); /* Replace 'your-downloaded-image.jpg' with your image filename */
    background-size: cover;
    background-position: center;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: top-center;
}
.content {
    text-align: center;
    color: #2F3656;
    margin-top: 50px;
}

h1 {
    font-size: 36px;
}

p {
    font-size: 18px;
}
.buttons {
    margin-top: 20px;
}

.btn1 {
    display: inline-block;
    padding: 10px 20px;
    background-color: #007BFF;
    color: #fff;
    text-decoration: none;
    border: none;
    border-radius: 20px;
    margin: 5px;
    font-weight: bold;
    font-size: 22px;
    transition: background-color 0.3s;
}

.btn1:hover {
    background-color: #2D324C;
}
.btn2 {
    display: inline-block;
    padding: 10px 20px;
    background-color: #007BFF;
    color: #fff;
    text-decoration: none;
    border: none;
    border-radius: 20px;
    margin: 5px;
    font-weight: bold;
     font-size: 22px;
    transition: background-color 0.3s;
}

.btn2:hover {
    background-color: #2D324C;
</style>
</head>
<body>
<%@ include file="Header.jsp" %>
<div class="container" >
	<div class="content">
	  	<h1>Welcome to DocDirect</h1>
		<h3>How is health today!</h3>
		<h3>Don't worry. Health Meets Convenience.</h3>
		<h3>Your gateway to hassle-free health care scheduling.</h3> 
		<h3>Empowering your choices.</h3>
	
		<div class="buttons">
			<a href="#" class="btn1">Register now</a>
		    <a href="#" class="btn2">Login</a>
    	</div>
    </div>
</div>
<%@ include file="Footer.jsp" %>
</body>
</html>
