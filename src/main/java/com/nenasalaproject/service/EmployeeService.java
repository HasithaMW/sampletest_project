package com.nenasalaproject.service;

import java.util.List;

import com.nenasalaproject.entity.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	
	List<Employee> getAll();
	
	Employee getById(Integer id);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(Employee employee);

}
