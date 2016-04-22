package com.nenasalaproject.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.nenasalaproject.dao.CivilStatusDao;
import com.nenasalaproject.dao.CivilStatusDaoImpl;
import com.nenasalaproject.dao.EmployeeDao;
import com.nenasalaproject.dao.EmployeeDaoImpl;
import com.nenasalaproject.dao.GenderDao;
import com.nenasalaproject.dao.GenderDaoImpl;
import com.nenasalaproject.dao.UserDao;
import com.nenasalaproject.dao.UserDaoImpl;
import com.nenasalaproject.security.UserDetailsServiceImpl;
import com.nenasalaproject.service.CivilStatusService;
import com.nenasalaproject.service.CivilStatusServiceImpl;
import com.nenasalaproject.service.EmployeeService;
import com.nenasalaproject.service.EmployeeServiceImpl;
import com.nenasalaproject.service.GenderService;
import com.nenasalaproject.service.GenderServiceImpl;
import com.nenasalaproject.service.UserService;
import com.nenasalaproject.service.UserServiceImpl;

@Configuration			// This is a configuration class.
@ComponentScan("com.nenasalaproject.controller")			// Scan components from this folder(Usages are in this folder)
public class DIConfiguration {

	@Bean(name="userDao")		// This bean has autowired in UserServiceImpl.java class
	public UserDao getUserDao(){
		return new UserDaoImpl();
	}
	
	@Bean(name="userService")
	public UserService getUserService(){
		return new UserServiceImpl();
	}
	
	@Bean(name="genderDao")
	public GenderDao getGenderDao(){
		return new GenderDaoImpl();
	}
	
	@Bean(name="genderService")
	public GenderService getGenderService(){
		return new GenderServiceImpl();
	}
	
	@Bean(name="civilStatusDao")
	public CivilStatusDao getCivilStatusDao(){
		return new CivilStatusDaoImpl();
	}
	
	@Bean(name="civilstatusService")
	public CivilStatusService getCivilstatusService(){
		return new CivilStatusServiceImpl();
	}
	
	@Bean(name="employeeDao")
	public EmployeeDao getEmployeeDao(){
		return new EmployeeDaoImpl();
	}
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeService(){
		return new EmployeeServiceImpl();
	}
	
	@Bean(name="userDetailsService")
	public UserDetailsService getUserDetailsService(){
		return new UserDetailsServiceImpl();
	}
	
}
