<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<%@page session="true"%>
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
	<title>Color Admin | Dashboard</title>
	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	
	
	
	<!-- ================== BEGIN BASE CSS STYLE ================== -->
	<link href="<c:url value="/resources/assets/plugins/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" />					<!-- Core -->
	<link href="<c:url value="/resources/assets/plugins/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" />				<!-- List icon small image -->
	<link href="<c:url value="/resources/assets/css/animate.min.css"/>" rel="stylesheet" />										<!-- Logout menu animation -->
	<link href="<c:url value="/resources/assets/css/style.min.css"/>" rel="stylesheet" />											<!-- Core -->
	<link href="<c:url value="/resources/app/css/common.css"/>" rel="stylesheet"/>	
	<!-- ================== END BASE CSS STYLE ================== -->
	
	<!-- ================== BEGIN BASE JS ================== -->
	<script src="<c:url value="/resources/assets/plugins/pace/pace.min.js"/>"></script>
	<script src="<c:url value="/resources/assets/plugins/jquery/jquery-1.9.1.min.js"/>"></script>				<!-- Comp -->
	<script src="<c:url value="/resources/assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"/>"></script>		<!-- Edit Pannel -->
	<script src="<c:url value="/resources/assets/plugins/bootstrap/js/bootstrap.min.js"/>"></script>				<!-- Edit Pannel -->
	<!--[if lt IE 9]>
		<script src="<c:url value="/resources/assets/crossbrowserjs/html5shiv.js"/>"></script>
		<script src="<c:url value="/resources/assets/crossbrowserjs/respond.min.js"/>"></script>
		<script src="<c:url value="/resources/assets/crossbrowserjs/excanvas.min.js"/>"></script>
	<![endif]-->
	<script src="<c:url value="/resources/assets/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>		<!-- Edit Pannel -->
<!-- 	<script src="<c:url value="/resources/assets/plugins/jquery-cookie/jquery.cookie.js"/>"></script> -->
<script src="<c:url value="/resources/assets/js/dashboard.min.js"/>"></script>

<%-- <script src="<c:url value="/resources/assets/plugins/flot/jquery.flot.min.js"/>"></script> --%>
<%-- <script src="<c:url value="/resources/assets/plugins/flot/jquery.flot.time.min.js"/>"></script> --%>
<%-- <script src="<c:url value="/resources/assets/plugins/flot/jquery.flot.resize.min.js"/>"></script> --%>
<%-- <script src="<c:url value="/resources/assets/plugins/flot/jquery.flot.pie.min.js"/>"></script> --%>

	<script src="<c:url value="/resources/app/js/common.js"/>"></script>
	<!-- ================== END BASE JS ================== -->

	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<script src="<c:url value="/resources/assets/plugins/sparkline/jquery.sparkline.js"/>"></script>			<!-- Core -->
<!-- 	<script src="<c:url value="/resources/assets/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"/>"></script> -->
	<script src="<c:url value="/resources/assets/js/apps.min.js"/>"></script>									<!-- Core -->
	<!-- ================== END PAGE LEVEL JS ================== -->

<script>
		$(document).ready(function() {
			App.init();
			Dashboard.init();
		});
	</script>

<script type="text/javascript">
	
// 	//Browser Support Code

// 	function ajaxFunction(){
// 		var xRequest1; 				// The variable that makes Ajax possible!
// 		if(window.XMLHttpRequest){
// 			xRequest1=new XMLHttpRequest();
// 			// 	alert("111111");
// 		}else{
// 			xRequest1=new ActiveXObject("Microsoft.XMLHTTP");
// 			// 	alert("222222");
// 		}
// 		// Create a function that will receive data
// 		// sent from the server and will update
// 		// div section in the same page.
// 		xRequest1.onreadystatechange = function(){
// 		// 		alert(xRequest1.readyState);
// 		if(xRequest1.readyState == 4){
// 			var ajaxDisplay = document.getElementById('x');
// 			ajaxDisplay.innerHTML = xRequest1.responseText;
//  		}
// 	}
// 	xRequest1.open("GET", "/nenasalaproject/Admin/Employee/", true);
//  	location.replace("../Employee/");
// 	// 	alert(location.href+"./Employee/");
// 	xRequest1.send(null);
// }
	
</script>


<script type="text/javascript">
// Spring.addDecoration(new Spring.AjaxEventDecoration({
//    elementId: "jsp.Employee",
//    formId: "x",
//    event: "onclick",
//    params: {fragments: "body"}
// }));
</script>


</head>
<body>

	<!-- begin #page-loader -->
<!-- 	<div id="page-loader" class="fade in"><span class="spinner"></span></div> -->
	<!-- end #page-loader -->

	<!-- begin #page-container -->
 	<div id="page-container" class="fade page-sidebar-fixed page-header-fixed">			<!-- class="fade page-sidebar-fixed page-header-fixed" -->
		
		<!-- begin #header -->
 		<div id="header" class="header navbar navbar-default navbar-fixed-top">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
 		</div> 
		<!-- end #header -->
		
		<!-- begin #sidebar -->
 			<div id="sidebar" class="sidebar">
				<tiles:insertAttribute name="leftMenu"></tiles:insertAttribute>
			</div>
 			<div class="sidebar-bg"></div>
			<!-- end #sidebar -->
		
		<!-- begin #content -->
		<div id="content" class="content">
<!-- 			<div id="x"> -->
			
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
<!-- 			</div> -->
		</div>
		<!-- end #content -->
		
		
		
		
		<!-- begin theme-panel -->
        <div class="theme-panel">
            <a href="javascript:;" data-click="theme-panel-expand" class="theme-collapse-btn"><i class="fa fa-cog"></i></a>
            <div class="theme-panel-content">
                <h5 class="m-t-0">Color Theme</h5>
                <ul class="theme-list clearfix">
                    <li class="active"><a href="javascript:;" class="bg-green" data-theme="default" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Default">&nbsp;</a></li>
                    <li><a href="javascript:;" class="bg-red" data-theme="red" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Red">&nbsp;</a></li>
                    <li><a href="javascript:;" class="bg-blue" data-theme="blue" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Blue">&nbsp;</a></li>
                    <li><a href="javascript:;" class="bg-purple" data-theme="purple" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Purple">&nbsp;</a></li>
                    <li><a href="javascript:;" class="bg-orange" data-theme="orange" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Orange">&nbsp;</a></li>
                    <li><a href="javascript:;" class="bg-black" data-theme="black" data-click="theme-selector" data-toggle="tooltip" data-trigger="hover" data-container="body" data-title="Black">&nbsp;</a></li>
                </ul>
                <div class="divider"></div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label double-line">Header Styling</div>
                    <div class="col-md-7">
                        <select name="header-styling" class="form-control input-sm">
                            <option value="1">default</option>
                            <option value="2">inverse</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label">Header</div>
                    <div class="col-md-7">
                        <select name="header-fixed" class="form-control input-sm">
                            <option value="1">fixed</option>
                            <option value="2">default</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label double-line">Sidebar Styling</div>
                    <div class="col-md-7">
                        <select name="sidebar-styling" class="form-control input-sm">
                            <option value="1">default</option>
                            <option value="2">grid</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label">Sidebar</div>
                    <div class="col-md-7">
                        <select name="sidebar-fixed" class="form-control input-sm">
                            <option value="1">fixed</option>
                            <option value="2">default</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label double-line">Sidebar Gradient</div>
                    <div class="col-md-7">
                        <select name="content-gradient" class="form-control input-sm">
                            <option value="1">disabled</option>
                            <option value="2">enabled</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-5 control-label double-line">Content Styling</div>
                    <div class="col-md-7">
                        <select name="content-styling" class="form-control input-sm">
                            <option value="1">default</option>
                            <option value="2">black</option>
                        </select>
                    </div>
                </div>
                <div class="row m-t-10">
                    <div class="col-md-12">
                        <a href="#" class="btn btn-inverse btn-block btn-sm" data-click="reset-local-storage"><i class="fa fa-refresh m-r-3"></i> Reset Local Storage</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- end theme-panel -->
		
		<!-- begin scroll to top btn -->
		<a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i class="fa fa-angle-up"></i></a>
		<!-- end scroll to top btn -->

		
 	</div>
	<!-- end page container -->
	
	
	
	
	
<!--	
	<script type="text/javascript">
       (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
       (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
       m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
       })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
    
       ga('create', 'UA-53034621-1', 'auto');
       ga('send', 'pageview');
    </script>
    -->
	
	
	<!-- Begin My Footer -->
	<div id="footer" >
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
	<!-- End My Footer -->
	
</body>
</html>





