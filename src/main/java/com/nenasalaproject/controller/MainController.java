package com.nenasalaproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nenasalaproject.entity.Employee;
import com.nenasalaproject.entity.User;
import com.nenasalaproject.security.UserDetailsServiceImpl;
import com.nenasalaproject.service.CivilStatusService;
import com.nenasalaproject.service.EmployeeService;
import com.nenasalaproject.service.GenderService;


@Controller
@Component
public class MainController {
	
		// 1. ----URL Mapping-------------------------------------------------------------------------------------------

	@RequestMapping(value="/Admin/Main", method=RequestMethod.GET) 
	public ModelAndView loadMain(Model model, @RequestParam(value="uname",required=false)String username, @RequestParam(value="pword", required=false)String password) {
		ModelAndView modelAndView = new ModelAndView("jsp.Home");
		return modelAndView;
	}
	
//	@RequestMapping("/*")
//	public Model loadLeftMenu( Model model){
//		return model;
//	}
		
	@RequestMapping(value="/login", method=RequestMethod.GET)
		public ModelAndView loadLogin(Model model, @RequestParam(value="error", required=false) String error, 
				@RequestParam(value="logout", required=false)String logout, HttpServletRequest request, HttpServletResponse response) {
			ModelAndView modelAndView = new ModelAndView();
				modelAndView.setViewName("init.Login");
			
			if(error != null){
				modelAndView.addObject("error", "Invalid Username or Password");
				System.out.println("aaaaa");
			}
			if(logout != null){
				modelAndView.addObject("logout", "Successfully Signout");
				Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			    if (auth != null){    
			        new SecurityContextLogoutHandler().logout(request, response, auth);
			    }
			    
			}
			return modelAndView;
		}
		
//		
//		@RequestMapping("/success") 
//		public ModelAndView loadHomePage(User user) {
//			ModelAndView modelAndView = new ModelAndView("jsp.Home");
//			return modelAndView;
//		}
//		
//		@RequestMapping(value="/logout", method = RequestMethod.GET)
//		public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//		    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		    if (auth != null){    
//		        new SecurityContextLogoutHandler().logout(request, response, auth);
//		    }
//		    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
//		}
//		
//		@RequestMapping(value="/login.htm", method=RequestMethod.GET) 
//		public ModelAndView logIn(User user) {
//			ModelAndView modelAndView = new ModelAndView("jsp.Home"); 
//			modelAndView.addObject("user",user);
//			return modelAndView;
//		}
		
}
