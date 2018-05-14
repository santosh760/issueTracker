<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Task Insertion Page</title>
  
  <s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />
<s:url var="url_footer" value="/static/css/sticky-footer-navbar.css"/>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet">
<link href="${url_footer}" type="text/css" rel="stylesheet">
 </head>
 <body>
 <%@include file="./common/menubar.jsp"%>
 <br><br><br>
 
 <center>
 <main>
 	<h2>Issue Details Submited :-</h2>
 	<br>
 	<table border="1">
 		<tr>
 		<td><h4>Issue Name</h4></td>
 		<td>${issuename}</td>
 		</tr>
 		<tr>
 		<td><h4>User ID</h4></td>
 		<td>${id}</td>
 		</tr>
 		
 		<tr>
 		<td><h4>User Name</h4></td>
 		<td>${createdby}</td>
 		</tr>
 		<tr>
 		<td><h4>Created By</h4></td>
 		<td>${createdby}</td>
 		</tr>
 		<tr>
 		<td><h4>Created Date and Time</h4></td>
 		<td>${createddate}</td>
 		</tr>
 		
 	</table>
 </main>
 <br><br><br>
 
	
<div align="center">
	<%@include file="./common/footer.jsp"%>
	</div>
	
 </body>
</html>