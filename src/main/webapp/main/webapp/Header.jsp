<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<style>
		.body {
		    margin: 0;
		
		}
		.header {
		    margin: 0;
		    padding:  20px  ;
		}
		img {
		    float: left;
		    margin-right: 0;
		    
		   margin-right: 10px;
		
		}
		.header h1 {
		    text-align: left;
		    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
		    font-weight: 500;
		    letter-spacing: 0.1em;
		    font-size: 25px;
		
		}
		hr {
		    border: 2px solid black;
		}
		ul {
		    list-style: none;
		    margin: 0;
		    margin-right: 20px;
		    overflow: hidden; 
		    border-radius: 10px; 
		}
		li {
		    float: right;
		    
		}
		
		
		li a{
		    display: block;
		    padding: 16px 18px;
		    text-decoration: none;
		    font-weight: 500;
		    border-radius: 10%;
		    color: black;
		    font-size: 18px;
		}
		li a:hover {
		    background-color:#9AEAF0;
		    text-decoration: underline;
		    color: black;
		    border-radius: 5%;
		  	padding: 8px 10px;
		    
		}
		
		.clear {
		    clear: both;
		}
		.block h1 {
		    float: left;
		    text-align: left;
		    margin-left: 40px;
		    font-size: 25px;
		    text-decoration: underline;
		    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
		    letter-spacing: 0.2em;
		    margin-top: 34px;
		}
		.clear {
		    clear: both;
		}
		.block .social {
		  
		    float: left;
		    height: 28px;
		    width: 28px;
		    margin-left:40px ;
		  
		}
		.block .pay {
		  
		    float: left;
		    height: 48px;
		    width: 48px;
		    margin-left:40px ;
		    margin-top: 15px;
		  
		}
		.row {
		    width: 100%;
		    margin: auto;
		    padding: 0;
		}
		.block {
		    float: left;
		    width: 30%;
		    padding: 20px;
		    padding-top: 4px;
		}
		.block h3 {
		    letter-spacing: 0.2em;
		    padding-left: 5px;
		    margin-left: 35px;
		    font-size: 15px;
		}
		.block h3 a {
		    text-decoration: none;
		    color: black;
		    cursor: pointer;
		}
		.block h1 {
		    font-size: 15px;
		}
		ul li a.active {
    background-color: #007BFF; /* Change to your desired highlight color */
    color: #fff; /* Change the text color as needed */
}
    </style>
    <script>
document.addEventListener('DOMContentLoaded', function () {
    // Get the current page's URL
    var currentURL = window.location.pathname;

    // Find the corresponding menu item and add a class to highlight it
    var links = document.querySelectorAll('ul li a');
    for (var i = 0; i < links.length; i++) {
        if (links[i].getAttribute('href') === currentURL) {
            links[i].classList.add('active');
        }
    }
});
</script>
</head>
<body>
	<div class="header">        
        <ul>
        <img src="Images/logo.jpg" height="60" width="50">       
        <li><a href="ContactUs.jsp">Contact Us</a></li>
        <li><a href="">FAQ</a></li>
        <li><a href="">Services</a></li>
        <li><a href="AboutUs.jsp">About Us</a></li>
        <li><a href="Home.jsp">Home</a></li>
        <h1> DocDirect | The E-Channelling </h1>
    </ul>
    </div>
    <div class="clear"></div>
	<hr>
</body>
</html>