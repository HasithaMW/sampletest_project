package com.nenasalaproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nenasalaproject.dao.EmployeeDao;
import com.nenasalaproject.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	@Qualifier("employeeDao")
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {}
	
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	public Employee getById(Integer id) {
		return employeeDao.getById(id);
	}

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
		
	}

	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
		
	}

}
