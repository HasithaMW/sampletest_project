
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="resources/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" />					<!-- Core -->
	<link href="resources/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" />				<!-- List icon small image -->
	<link href="resources/assets/css/animate.min.css" rel="stylesheet" />										<!-- Logout menu animation -->
	<link href="resources/assets/css/style.min.css" rel="stylesheet" />											<!-- Core -->
	<link rel="stylesheet" href="resources/app/css/common.css">	
	<!-- ================== END BASE CSS STYLE ================== -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="resources/assets/plugins/pace/pace.min.js"></script>
	<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN BASE JS ================== -->
	<script src="resources/assets/plugins/jquery/jquery-1.9.1.min.js"></script>				<!-- Comp -->
	<script src="resources/assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>		<!-- Edit Pannel -->
	<script src="resources/assets/plugins/bootstrap/js/bootstrap.min.js"></script>				<!-- Edit Pannel -->
	<!--[if lt IE 9]>
		<script src="resources/assets/crossbrowserjs/html5shiv.js"></script>
		<script src="resources/assets/crossbrowserjs/respond.min.js"></script>
		<script src="resources/assets/crossbrowserjs/excanvas.min.js"></script>
	<![endif]-->
	<script src="resources/assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>		<!-- Edit Pannel -->
<!-- 	<script src="resources/assets/plugins/jquery-cookie/jquery.cookie.js"></script> -->
	<!-- ================== END BASE JS ================== -->

	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<script src="resources/assets/plugins/sparkline/jquery.sparkline.js"></script>			<!-- Core -->
<!-- 	<script src="resources/assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script> -->
	<script src="resources/assets/js/apps.min.js"></script>									<!-- Core -->
	<!-- ================== END PAGE LEVEL JS ================== -->


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/app/css/common.css">
</head>
<body>
	<tiles:insertAttribute name="mainContent"></tiles:insertAttribute>
</body>
</html>