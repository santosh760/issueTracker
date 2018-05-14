<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!--
Author: Bhushan Medage
Author URL: http://manavisoft.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Issues Management System</title>


<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />

<s:url var="url_font" value="/static/css2/font-awesome.css" />
<s:url var="url_font_awesome" value="/static/css2/style.css" />
<s:url var="url_footer" value="/static/css/sticky-footer-navbar.css"/>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">

<link href="${url_font}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" media="all"  rel="stylesheet">
<link href="${url_footer}" type="text/css" rel="stylesheet">
</head>




<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Glassy Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="/static/css2/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<link rel="stylesheet" href="/static/css2/style.css" type="text/css" media="all" /> <!-- Style-CSS --> 
<!-- //css files -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700" rel="stylesheet">
<!-- //web-fonts -->
</head>
<body>
<%@include file="./common/menubar.jsp"%>
		<!--header-->
		<br>
			<br>
				<div class="header-w3l">
			<h1>Register New User</h1>
		</div>
		<!--//header-->
		<!--main-->
		<div class="main-w3layouts-agileinfo">
	           <!--form-stars-here-->
						<div class="wthree-form">
							<!-- <h2>Fill out the form below to Register</h2> -->
							<form action="./submitIsuues.htm" method="post" name="registerform">
								<div class="form-sub-w3">
									<input type="text" name="issuename" placeholder=" Issue Name " required="" />
								<div class="icon-w3">
									<i class="fa fa-user" aria-hidden="true"></i>
								</div>
								</div>
								
								
								
								<div class="clear"></div>
								<div class="submit-agileits">
									<input type="submit" value="ADD">
								</div>
							</form>

						</div>
				<!--//form-ends-here-->

		</div>
		<!--//main-->
		<!--footer-->
		<br>
		<br>
		<%@include file="./common/footer.jsp"%>
		<!--//footer-->
</body>
</html>