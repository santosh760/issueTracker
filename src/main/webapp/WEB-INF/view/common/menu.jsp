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
	
	<p>
	<header>
      <!-- Fixed navbar -->
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="./home.htm">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
              <li>
              <a class="nav-link" href="./addIssue.htm">Create New Issues<span class="sr-only">(current)</span></a>
            </li>
             <li>
              <a class="nav-link" href="#">Edit  Issues<span class="sr-only">(current)</span></a>
            </li>
             <li>
              <a class="nav-link" href="#">Delete Issues<span class="sr-only">(current)</span></a>
            </li>
             <li>
              <a class="nav-link" href="./listAll.htm">Show List Of Issues<span class="sr-only">(current)</span></a>
            </li>
             <li>
              <a class="nav-link" href="#">Show List Of Issues based on Date Range<span class="sr-only">(current)</span></a>
            </li>
             
            <li align="right">
              <a class="nav-link" href="./logoutProcess.htm">Logout<span class="sr-only">(current)</span></a>
            </li>
          </ul>
        </div>
      </nav>
    </header>
</p>
</c:if>

