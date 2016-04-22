package com.nenasalaproject.controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.nenasalaproject.entity.Employee;

@Controller
@Component
@RequestMapping(value={"/Admin/Test/"})
public class TestConfig {
	
	@RequestMapping("SessinoTest/")
	public ModelAndView loadSessioTest(Model model, HttpServletResponse response) {
		
		ModelAndView modelAndView = new ModelAndView("jsp.SessionTest");
//		response.encodeURL("/");
		
		response.setIntHeader("Refresh", 5);	// Set refresh, autoload time as 5 seconds 
		//response.sendRedirect(arg0);
//		try {
//			response.sendError(407, "Need authentication!!!" );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return modelAndView;
	}
	
	
	@RequestMapping("FileUpload/")
	public ModelAndView loadFileUpload(Model model, HttpServletResponse response) {
		
		ModelAndView modelAndView = new ModelAndView("jsp.FileUpload");
//		response.encodeURL("/");
		
		//response.sendRedirect(arg0);
//		try {
//			response.sendError(407, "Need authentication!!!" );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return modelAndView;
	}
	
	@RequestMapping("FileUpload/upload")
	public ModelAndView fileUpload(Model model, HttpServletResponse response,HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView("jsp.Upload");
		
		
		return modelAndView;
	}

}
