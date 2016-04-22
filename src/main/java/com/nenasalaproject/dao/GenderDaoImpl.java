package com.nenasalaproject.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nenasalaproject.entity.Gender;

@Repository
public class GenderDaoImpl implements GenderDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Gender> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("SELECT g FROM Gender As g").list();
	}

}
