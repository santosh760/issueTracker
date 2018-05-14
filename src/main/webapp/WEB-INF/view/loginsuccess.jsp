<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@include file="imports.jsp"%>
<!doctype html>
<html lang="en">
 <head>
<%--   <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Login Page</title>
  
  <s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />
<s:url var="url_footer" value="/static/css/sticky-footer-navbar.css"/>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet"> --%>
<link href="${url_footer}" type="text/css" rel="stylesheet">
 </head>

 
 <body bgcolor="#BCF5A9">
 
 <%@include file="./common/menubar.jsp"%>
 

 
<%-- <h2>${userid}</h2> --%>
<div align="center">
 <main role="main" class="container">
      <h1 class="mt-5">Welcome <a href="#" >${msg}</a> In</h1>
      <h1> Issue Tracker Application</h1>
     </main> 
 
 <div id="footer">
        <div id="center">
            <%@include file="./common/footer.jsp"%>
        </div>
    </div>
 

	
 </body>
</html>