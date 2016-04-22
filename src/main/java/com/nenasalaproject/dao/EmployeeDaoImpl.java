package com.nenasalaproject.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nenasalaproject.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
	}
	
	@Transactional
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
	}

	@Transactional
	public List<Employee> getAll() {
		return sessionFactory.getCurrentSession().createQuery("SELECT e FROM Employee AS e").list();
	}

	@Transactional
	public Employee getById(Integer id) {
		Query query = sessionFactory.getCurrentSession().createQuery("SELECT e FROM Employee e WHERE e.id=:id");
		query.setInteger("id", id);
		return query.list().size()>0 ? (Employee)query.list().get(0) : null;
	}
	
	

}
