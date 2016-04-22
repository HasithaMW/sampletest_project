package com.nenasalaproject.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nenasalaproject.entity.CivilStatus;

@Repository
public class CivilStatusDaoImpl implements CivilStatusDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<CivilStatus> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM CivilStatus").list(); 
	}

}
