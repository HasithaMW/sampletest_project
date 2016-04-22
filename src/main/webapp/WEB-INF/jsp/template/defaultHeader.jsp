<!-- begin #header -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<div id="header" class="header navbar navbar-default navbar-fixed-top">
			<!-- begin container-fluid -->
			<div class="container-fluid" >
				<!-- begin mobile sidebar expand / collapse button -->
				<div class="navbar-header"style="width: 60%;" >
					<a href="index.html" class="navbar-brand"><span class="navbar-logo"></span> Color Admin</a>
					<div style="width: 100%;">
				<% 
							Integer hitsCount = (Integer)application.getAttribute("hitCounter"); 
							if( hitsCount ==null || hitsCount == 0 ){ /* First visit */
								out.print("Welcome to my website!"); 
								hitsCount = 1; 
							}else{ /* return visit */ 
								out.print("Welcome back to my website!"); 
								hitsCount += 1; 
							} 
							application.setAttribute("hitCounter", hitsCount); 
						%> 
						<font>Total number of visits: <%= hitsCount%></font>
						</div>
				</div>
					<button type="button" class="navbar-toggle" data-click="sidebar-toggled">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					
				
				<!-- end mobile sidebar expand / collapse button -->
			
				
			
				<!-- begin header navigation right -->
				<ul class="nav navbar-nav navbar-right">
					<li>
						<form class="navbar-form full-width">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Enter keyword" />
								<button type="submit" class="btn btn-search"><i class="fa fa-search"></i></button>
							</div>
						</form>
					</li>
					
					<li class="dropdown navbar-user">
						<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
<%-- 							<img src="${renderRequest.getContextPath()}/nenasalaproject/resources/assets/img/user-13.jpg" alt="" />  --%>
							<img src="<c:url value="/resources/assets/img/user-13.jpg"/>" alt="" />
							<span class="hidden-xs">Adam Schwartz</span> <b class="caret"></b>
						</a>
						<ul class="dropdown-menu animated fadeInLeft">
							<li class="arrow"></li>
							<li><a href="javascript:;">Edit Profile</a></li>
							<li><a href="javascript:;"><span class="badge badge-danger pull-right">2</span> Inbox</a></li>
							<li><a href="javascript:;">Calendar</a></li>
							<li><a href="javascript:;">Setting</a></li>
							<li class="divider"></li>
							<li><a href="login?logout">Log Out</a></li>
						</ul>
					</li>
				</ul>
				<!-- end header navigation right -->
			</div>
			<!-- end container-fluid -->
		</div>
		<!-- end #header -->