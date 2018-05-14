<%
	session.invalidate();
	pageContext.forward("login.jsp?msg=User Logged out successfully!");
%>