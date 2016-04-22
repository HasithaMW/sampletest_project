<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page import="com.nenasalaproject.entity.Employee"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="<c:url value="/resources/jquery/css/jquery-ui.css"/>" />

<style type="text/css">
select {
	width: 232px;
}

/* http://stackoverflow.com/questions/5003142/show-jdbc-resultset-in-html-in-jsp-page-using-mvc-and-dao-pattern */
td {
	padding: 8px;
}
</style>

<!-- ================== BEGIN PAGE LEVEL STYLE ================== -->
<link
	href="<c:url value="/resources/assets/plugins/DataTables/media/css/dataTables.bootstrap.min.css"/>"
	rel="stylesheet" />
	
	<script src="<c:url value="/resources/app/js/common.js"/>"></script>
<!-- ================== END PAGE LEVEL STYLE ================== -->


	<h1>Employee Form</h1>
	
	<c:if test="${not empty msg}">
		<div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>${msg}</strong>
		</div>
	</c:if>

	<%-- <frm:errors path="*" cssClass="errorblock" element="div" /> --%>


	<frm:form modelAttribute="employee" action = "update" method="POST" id ="x">
		<div class="row">
			<div class="col-md-1"><input type="hidden" name="id" id="t" value="${employee.id}"></div>

			<div class="col-md-4">

				<fieldset>
					<div class="form-group">
						<label>First Name </label>
						<frm:input path="fname" class="form-control input-sm" />
						<frm:errors path="fname" cssClass="error" />
					</div>

					<div class="form-group">
						<label>Gender</label>
						<frm:select path="genderId" class="form-control input-sm">
							<frm:option value="" label="-- Select Gender --" />
							<frm:options items="${genders}" itemValue="id" />
							<!-- ComboBox items are got by departments list -->
						</frm:select>
						<frm:errors path="genderId" cssClass="error" />
					</div>
					<div class="form-group">
						<label>Date of Birth </label>
						<frm:input type="text" path="dob" id="dob"
							class="form-control input-sm dpicker" />
						<frm:errors path="dob" cssClass="error" />
					</div>
					<div class="form-group">
						<label>NIC No. </label>
						<frm:input path="nic" class="form-control input-sm" />
						<frm:errors path="nic" cssClass="error" />
					</div>
					<div class="form-group">
						<label>Address </label>
						<frm:textarea path="address" rows="6"
							class="form-control input-sm" />
						<frm:errors path="address" cssClass="error" />
					</div>

				</fieldset>
			</div>

			<div class="col-md-1"></div>


			<div class="col-md-4">
				<fieldset>
					<div class="form-group">
						<label>Last Name </label>
						<frm:input path="lname" class="form-control input-sm" />
						<frm:errors path="lname" cssClass="error" />
					</div>
					<div class="form-group">
						<label>Civil Status</label>
						<frm:select path="civilStatusId" class="form-control input-sm">
							<frm:option value="" label=" -- Select Civil Status --" />
							<frm:options items="${civilstatuss}" itemValue="id" />
							<!-- ComboBox items are got by departments list -->
						</frm:select>
						<frm:errors path="civilStatusId" cssClass="error" />
					</div>
					
					<div class="form-group">
						<label>Telephone No. </label>
						<frm:input path="land" class="form-control input-sm" />
						<frm:errors path="land" cssClass="error" />
					</div>
					<div class="form-group">
						<label>Mobile Phone No. </label>
						<frm:input path="mobile" class="form-control input-sm" />
						<frm:errors path="mobile" cssClass="error" />
					</div>
					<div class="form-group">
						<label>E-mail </label>
						<frm:input path="email" class="form-control input-sm" />
						<frm:errors path="email" cssClass="error" />
					</div>
				</fieldset>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
			</div>
			
			<div class="col-md-2">
				<div class="form-group">
					<input type="submit" value="Update" class="btn btn-primary m-r-5 m-b-5" />
				</div>
		
			</div>
			
		</div>
		
	</frm:form>



	<!-- begin row -->
	<div class="row">
		<!-- begin col-12 -->
		<div class="col-md-12">
			<!-- begin panel -->
			<div class="panel panel-inverse">
				<div class="panel-heading">
					<div class="panel-heading-btn">
						<a href="javascript:;"
							class="btn btn-xs btn-icon btn-circle btn-default"
							data-click="panel-expand"><i class="fa fa-expand"></i></a> <a
							href="javascript:;"
							class="btn btn-xs btn-icon btn-circle btn-success"
							data-click="panel-reload"><i class="fa fa-repeat"></i></a> <a
							href="javascript:;"
							class="btn btn-xs btn-icon btn-circle btn-warning"
							data-click="panel-collapse"><i class="fa fa-minus"></i></a> <a
							href="javascript:;"
							class="btn btn-xs btn-icon btn-circle btn-danger"
							data-click="panel-remove"><i class="fa fa-times"></i></a>
					</div>
					<h4 class="panel-title">Data Table - Default</h4>
				</div>
				<div class="panel-body">
					<table id="tbl" class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Gender</th>
								<th>NIC No.</th>
								<th>e-mail</th>
 								<th></th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${employees}" var="emp">
							<tr class="odd gradeX">
								<td>${emp.fname}</td>
								<td>${emp.lname}</td>
								<td>${emp.genderId}</td>
								<td>${emp.nic}</td>
								<td>${emp.email}</td>
<%-- 								<td><input type="hidden" name="id" id="t" value="${emp.id}"></td> --%>
								<td> 
									<c:url value="${emp.id}" var="userUrl" />
									<button onclick="location.href='${userUrl}'">Load</button>
								</td>
						
<!-- 								<td><input type="button" value="update" /> <input type="button" value="Delete" /></td> -->
							</tr>

						</c:forEach>
						
						
							<%
// 								List<Employee> emplo = (List) request.getAttribute("employees");
// 								System.out.println(emplo.size());
// 								for (Employee employee : (List<Employee>) request.getAttribute("employees")) {
							%>
<!-- 							<tr class="odd gradeX"> -->
<%-- 								<td><%=employee.getFname()%></td> --%>
<%-- 								<td><%=employee.getLname()%></td> --%>
<%-- 								<td><%=employee.getGenderId()%></td> --%>
<%-- 								<td><%=employee.getNic()%></td> --%>
<%-- 								<td><%=employee.getEmail()%></td> --%>
<!-- 							</tr> -->
							<%
// 								}
							%>

						</tbody>
					</table>
				</div>
			</div>
			<!-- end panel -->
		</div>
		<!-- end col-12 -->
	</div>


	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<script
		src="<c:url value="/resources/assets/plugins/DataTables/media/js/jquery.dataTables.js"/>"></script>
	<script
		src="<c:url value="/resources/assets/plugins/DataTables/media/js/dataTables.bootstrap.min.js"/>"></script>
	<script
		src="<c:url value="/resources/assets/plugins/DataTables/extensions/Responsive/js/dataTables.responsive.min.js"/>"></script>
	<script
		src="<c:url value="/resources/assets/js/table-manage-default.demo.min.js"/>"></script>
	<!-- 	<script src="<c:url value="/resources/assets/js/apps.min.js"/>"></script> -->
	<!-- ================== END PAGE LEVEL JS ================== -->


	<script>
		// alert("111");
		$('#tbl').DataTable();
		// alert("2222");
	</script>
