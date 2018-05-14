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
  <title>User Registration Page</title>
  
  <s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" />
<s:url var="url_footer" value="/static/css/sticky-footer-navbar.css"/>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_font_awesome}" type="text/css" rel="stylesheet">
<link href="${url_footer}" type="text/css" rel="stylesheet">

<script>  
function validateform(){  
var fname=document.registerform.firstname.value;  
var lname=document.registerform.lastname.value;
var email=document.registerform.email.value;
var atposition=email.indexOf("@");  
var dotposition=email.lastIndexOf(".");
var contact=document.registerform.contact.value;
var address=document.registerform.address.value;
var loginname=document.registerform.loginname.value;
var password=document.registerform.password.value;
  
if (fname==null || fname==""||fname>65||fname<123){  
  alert("Invalid First Name");  
  return false;
}else if (lname==null || lname==""||fname>65||fname<123){  
	  alert("Invalid Last Name");  
	  return false;
}else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){  
	  alert("Please enter a valid e-mail address \n example:-abc@gamil.com");  
	  return false;
}else if(isNaN(contact)||contact==null){
	alert("Invalid Contact Number");
	return false;
}else if(address==null||address==""){
	alert("Invalid Address");
	return false;
}else if(loginname==""||loginname==null){
	alert("Invalid Login Name");
	return false;
}else if(password==null || password==""){  
  alert("Password can't be blank");  
  return false;  
  }  
}  
</script>
 </head>
 <body>
 <%@include file="./common/header.jsp"%>
 <br><br><br><div>
 
<center>
		<fieldset style="width:600px">
			<legend><h3>User Registration FORM</h3></legend>
			<form action="./submitUserRegister.htm" method="post" name="registerform" onsubmit="return validateform()">
				<table>
					<tr>
						<td>First Name -</td>
						<td><input type="text" name="firstname"></td>
					</tr>
					<tr>
						<td>Last Name -</td>
						<td><input type="text" name="lastname"></td>
					</tr>
					<tr>
						<td>Email -</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Contact -</td>
						<td><input type="text" name="contact" maxlength="10"></td>
					</tr>
					<tr>
						<td>Address -</td>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<td>Login Name -</td>
						<td><input type="text" name="loginname"></td>
					</tr>
					<tr>
						<td>Password -</td>
						<td><input type="text" name="password"></td>
					</tr>
					</table>
				
				<br><br><button type="submit" value="Submit">Register User</button>
				</form>
		</fieldset>
	</center>
	</div>
	
<div align="center">
	<%@include file="./common/footer.jsp"%>
	</div>
	
 </body>
</html>