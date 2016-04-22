<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>		<!-- Tag library URI; prefix is "frm" -->
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->
	<h1>Signup Form</h1>
	<frm:form action="saveUser" commandName="user1">
		<table>
			<tr>
				<td>Username:</td>
				<td><frm:input path="username" /> <!-- Path attribute is used to bind attribute names of the "user1" object. -->
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><frm:password path="password" /> <!-- Path attribute is used to bind attribute names of the "user1" object. -->
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SignUp" /></td>
			</tr>

		</table>
	</frm:form>
<!-- </body> -->
<!-- </html> -->