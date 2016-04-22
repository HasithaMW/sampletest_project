package com.nenasalaproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nenasalaproject.dao.GenderDao;
import com.nenasalaproject.entity.Gender;

@Service
public class GenderServiceImpl implements GenderService {

	@Autowired
	@Qualifier("genderDao")
	private GenderDao genderDao;
	
	public List<Gender> getAll() {
		// TODO Auto-generated method stub
		return genderDao.getAll();
	}

}
