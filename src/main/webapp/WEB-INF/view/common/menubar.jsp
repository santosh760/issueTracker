<%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp"%>
<c:if test="${sessionScope.userid==null}">
	<%-- user is not logged in --%>
	
	<p>
	<h1>Login First
</p>
</c:if>


<c:if test="${sessionScope.userid!=null}">
	<%-- user is logged in --%>
<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}

.active {
    background-color: red;
}
</style>
</head>
<body>

<ul>
  <li><a href="./addIssue.htm">Create New Issues</a></li>  
   <li><a href="./listAll.htm">Show List Of Issues</a></li>
   <li><a href="./updateIssue.htm">Edit/Delete  Issues</a></li>
  <li><a href="./showBydate.htm">Show List Of Issues based on Date Range</a></li>
  <li><a href="./logoutProcess.htm">Logout</a></li>
 
</ul>


</body>
</html>


</c:if>