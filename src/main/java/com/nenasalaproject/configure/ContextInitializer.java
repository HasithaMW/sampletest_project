package com.nenasalaproject.configure;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ContextInitializer implements WebApplicationInitializer {

	// ---- 1. Entry point to the system. ---------------------------------------------------------------------------------------------------
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext contex = new AnnotationConfigWebApplicationContext();			// Create the 'root' Spring application context
		contex.register(SpringConfigure.class);		// Registering the Spring configuration class
		
		contex.setServletContext(servletContext);		// Set servlet context to the root spring application context.
		
		Dynamic servlet = servletContext.addServlet("dispatcher1", new DispatcherServlet(contex));		// Register and map the dispatcher servlet
		//servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

//	public class MyWebAppInitializer implements WebApplicationInitializer {
//
//	    @Override
//	    public void onStartup(ServletContext container) {
//	      // Create the 'root' Spring application context
//	      AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//	      rootContext.register(AppConfig.class);
//
//	      // Manage the lifecycle of the root application context
//	      container.addListener(new ContextLoaderListener(rootContext));
//
//	      // Create the dispatcher servlet's Spring application context
//	      AnnotationConfigWebApplicationContext dispatcherContext =
//	        new AnnotationConfigWebApplicationContext();
//	      dispatcherContext.register(DispatcherConfig.class);
//
//	      // Register and map the dispatcher servlet
//	      Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
//	      dispatcher.setLoadOnStartup(1);
//	      dispatcher.addMapping("/");
//	    }
//
//	 }
	
}
