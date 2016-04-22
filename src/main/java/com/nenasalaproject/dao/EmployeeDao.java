package com.nenasalaproject.dao;

import java.util.List;

import com.nenasalaproject.entity.Employee;

public interface EmployeeDao {
	
	void saveEmployee(Employee employee);
	
	List<Employee> getAll();
	
	Employee getById(Integer id);
	
	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);
}
