package com.nenasalaproject.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nenasalaproject.entity.Employee;
import com.nenasalaproject.service.CivilStatusService;
import com.nenasalaproject.service.EmployeeService;
import com.nenasalaproject.service.GenderService;

@Controller
@Component
@RequestMapping(value={"/Admin/Employee"})
public class EmployeController {
	
	@Autowired
	@Qualifier("genderService")
	private GenderService genderService;			// @Resourse(name="genderService") can be use instead of @Autowired and @Qualifier annotations
	
	@Autowired
	@Qualifier("civilstatusService")
	private CivilStatusService civilStatusService;
	
	@RequestMapping("/")
	public ModelAndView loadEmployee(Model model, HttpServletResponse response) {
		
		ModelAndView modelAndView = new ModelAndView("jsp.Employee");
		model.addAttribute("employee",new Employee());
		modelAndView.addObject("genders", genderService.getAll());
		modelAndView.addObject("civilstatuss",civilStatusService.getAll());
		modelAndView.addObject("employees", employeeService.getAll());
//		response.encodeURL("/");
		
//		response.setIntHeader("Refresh", 5);	// Set refresh, autoload time as 5 seconds 
		//response.sendRedirect(arg0);
//		try {
//			response.sendError(407, "Need authentication!!!" );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/{id}")
	public ModelAndView showEmployee(@PathVariable("id") int id, Model model) {

//		logger.debug("showUser() id: {}", id);
		ModelAndView modelAndView = new ModelAndView("jsp.Employee");
		Employee employee = employeeService.getById(id);
		model.addAttribute("employee",employee);
		if (employee == null) {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "Employee not found.");
		}
		
		modelAndView.addObject("genders", genderService.getAll());
		modelAndView.addObject("civilstatuss",civilStatusService.getAll());
		modelAndView.addObject("employees", employeeService.getAll());
		

		return modelAndView;

	}
	
	@RequestMapping(value = "/deleteEmployee/{id}")
	public ModelAndView deleteEmployee(@PathVariable("id") int id, Model model, HttpServletResponse response) {

//		logger.debug("showUser() id: {}", id);
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"+id);
		ModelAndView modelAndView = new ModelAndView("jsp.Employee");
		employeeService.deleteEmployee(employeeService.getById(id));	
//		Employee employee = employeeService.getById(id);
		model.addAttribute("employee",new Employee());
//		if (employee == null) {
//			model.addAttribute("css", "danger");
//			model.addAttribute("msg", "Employee not found.");
//		}
		
		modelAndView.addObject("css", "success");
		modelAndView.addObject("msg", "Employee deleted successfully.");
		
		modelAndView.addObject("genders", genderService.getAll());
		modelAndView.addObject("civilstatuss",civilStatusService.getAll());
		modelAndView.addObject("employees", employeeService.getAll());
		
		 
		return modelAndView;

	}
	
	@RequestMapping(value = "/updateEmployee", method=RequestMethod.POST)
	public ModelAndView updateEmployee(Model model, @Valid @ModelAttribute("employee") Employee employee, BindingResult results, final RedirectAttributes redirectAttributes) {

//		logger.debug("showUser() id: {}", id);
		System.out.println(employee);
	
		ModelAndView modelAndView = new ModelAndView();
		if(!results.hasErrors()){
			
			employeeService.updateEmployee(employee);
			System.out.println("Update "+employee.getFname());
			modelAndView.setViewName("jsp.Employee");
			modelAndView.addObject("css", "success");
			modelAndView.addObject("msg", "Employee updated successfully.");
			model.addAttribute("employee",new Employee());
		}else{
			modelAndView.setViewName("jsp.EmployeeUpdate");
			model.addAttribute("employee",employee);
			modelAndView.addObject("css", "danger");
			modelAndView.addObject("msg", "Employee not found.");
			
		}
		modelAndView.addObject("genders", genderService.getAll());
		modelAndView.addObject("civilstatuss",civilStatusService.getAll());
		modelAndView.addObject("employees", employeeService.getAll());
		return modelAndView;

	}
	

	@Autowired
	@Qualifier("employeeService")
	private EmployeeService employeeService;
	
	@RequestMapping( value="/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(Model model, @Valid @ModelAttribute("employee")Employee employee, BindingResult results){
		System.out.println(employee.getDob());
		ModelAndView modelAndView = new ModelAndView("jsp.Employee");
		
		
		if(!results.hasErrors()){
			employeeService.saveEmployee(employee);
			model.addAttribute("employee",new Employee());
			modelAndView.addObject("css", "success");
			modelAndView.addObject("msg", "Employee saved successfully.");
		}else{
			//view.addObject("employee",employee);
//			model.addAttribute("g", employee.getGenderId().getId());
//			model.addAttribute("c", employee.getCivilStatusId().getId());
			model.addAttribute("employee",employee);
			modelAndView.addObject("css", "danger");
			modelAndView.addObject("msg", "Form has incorrect data.");
			
		}
//		view.setViewName("redirect:./");
		modelAndView.addObject("genders", genderService.getAll());
		modelAndView.addObject("civilstatuss",civilStatusService.getAll());
		modelAndView.addObject("employees", employeeService.getAll());
		return modelAndView;
	}
	
	@RequestMapping("/Emp")
	public ModelAndView loadEmp(Model model) {
		ModelAndView modelAndView = new ModelAndView("init.Emp"); 
		return modelAndView;
	}

	@RequestMapping("/Emp1")
	public ModelAndView loadEmp1(Model model) {
		ModelAndView modelAndView = new ModelAndView("init.Emp1"); 
		return modelAndView;
	}
	
}
