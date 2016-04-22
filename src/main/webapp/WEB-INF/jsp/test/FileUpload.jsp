<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h3>File Upload:</h3>
 
 <c:if test="${not empty msg}">
		    <div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>${msg}</strong>
		    </div>
		</c:if>
 
 Select a file to upload: <br />
  <form action="upload" method="post" enctype="multipart/form-data"> 
  	<input type="file" name="file" size="50" /> <br /> 
  	<input type="submit" value="Upload File" /> 
  	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
  	</form>

</body>
</html>



