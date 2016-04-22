package com.nenasalaproject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nenasalaproject.entity.Employee;
import com.nenasalaproject.entity.User;
import com.nenasalaproject.service.UserService;

@Controller
@Component
@RequestMapping(value={"/Admin/User"})
public class UserController {
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("/Signup") 
	public ModelAndView loadSignup(Model model) {
		ModelAndView modelAndView = new ModelAndView("jsp.Signup");
		modelAndView.addObject("user1", new User());		// Add new User object it's name is "user1"
		return modelAndView;
	}
	
	@RequestMapping("/saveUser")	// **This method is executed when user click on the submit button in "AddUser.jsp" file.
	public ModelAndView saveUser(Model model, @Valid @ModelAttribute("user1")User user) {
		 
		//view.addObject("list", getList());
		userService.saveUser(user);		// Save User to the database.
		ModelAndView view = new ModelAndView("jsp.Signup");	// Create a "ModelAndView" object and load by the "text.jsp" file.
		model.addAttribute("user1", new User());
		return view;
	}

}
