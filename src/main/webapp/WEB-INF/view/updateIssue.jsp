<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#F3E2A9">
<%@include file="./common/menubar.jsp"%>
<div>
<h2>${msg}</h2>
</div>
<div align="center" > 
<font size="30">Issue List</font>
</div>
<br><br><br>
<div align="center">

<div class = "col-md-12" style = "overflow-x: auto">  




	
	
	
	<table border="1"  cellpadding="5">
	
	
                            <tr style="color: red;">
                                <th>SR</th>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Creted By</th>
                                <th>Created Date and Time</th>                               
                                 <th>Last Updated By</th>
                                  <th>Last Updated Date and Time</th>
                               	<th>Edit Issue</th>
                                <th>Delete Isuue</th>
                            </tr>
                            <%
                           int i=0;
                    %>
                    <c:forEach items="${requestScope.issuelist}" var="issue">
                    	<tr>
                                    <td><%=++i%></td>
                                    <td><c:out value="${issue.id}"></c:out></td>
                                    <td><c:out value="${issue.issuename}"></c:out></td>
                                   <td> <c:out value="${issue.createdBy}"></c:out></td>
                                  <td> <c:out value="${issue.createdDateTime}"></c:out></td>
                                  <td> <c:out value="${issue.lastModifiedBy}"></c:out></td>
                                  <td> <c:out value="${issue.lastModifiedDateTime}"></c:out></td>
                                <td> <a href="editIsuue.htm?issueid=${issue.id}"> Edit </a> </td>
                                <td> <a href="deleteIssuelink.htm?issueid=${issue.id}"> Delete </a> </td>
                                    
                                    
                                </tr>
                    </c:forEach>
                        
                 </form>
			</td>
			</tr>
			<%-- </c:forEach> --%>
			</table>
	
	
	
	
	</div>
	
	</div>
	
</body>
</html>