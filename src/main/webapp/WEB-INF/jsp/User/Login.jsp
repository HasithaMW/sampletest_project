<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>	<!-- Tag library URI; prefix is "frm" --> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
<!-- 	<H1> Login </H1> -->
<%-- 	<frm:form name="loginForm" action="Main" method="get"> --%>
<!-- 		Username: <input type="text" name="username" width="200"/> -->
<!-- 		<br/><br/> -->
<!-- 		Password:  <input type="password" name="password" width="200"/> -->
<!-- 		<br/><br/> -->
<!-- 		<input type="submit" value="Login"/> -->
<%-- 		<input type="hidden" name="${_csrf.parameterName}" value="$_csrf_tokwn"/> --%>
<!-- 		<br/><br/> -->
<!-- 		<a href="Signup"> Sign Up </a> -->
<%-- 	</frm:form> --%>
<!-- </body> -->
<!-- </html> -->

<html>
  <head>
    <title>Messages : Create</title>
    <style type="text/css">
    .error{
    	color: pin;
    	text-align: left;
    	font-size: 14px;
    	font-family: serif;
    }
    .logout{
    	color:green;
    	text-align: left;
    	font-size: 14px;
    	font-family: serif;
    }
    </style>
  </head>
  <body>
    <div>
        <form action="login" method="post">               
            <fieldset>
                <legend>Please Login</legend>
                <% if(request.getParameter("error")!= null) {%>
                <div class="error">    
                    ${error}
                </div>
                <%} %>
<%-- 				<h1 class="alert alert-error"> ${error}</h1> --%>
<%-- 				<h1 class="alert alert-success"> ${logout}</h1> --%>
                <% if(request.getParameter("logout")!= null) {%>
                <div class="logout">    
                    ${logout}
                </div>
                <%} %>
                <label for="username">Username :</label>
                <input type="text" id="username" name="username"/><br/>       
                <label for="password">Password  &nbsp; :</label>
                <input type="password" id="password" name="password"/>    
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </fieldset>
        </form>
    </div>
  </body>
</html>