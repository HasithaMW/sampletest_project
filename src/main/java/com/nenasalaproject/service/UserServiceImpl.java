package com.nenasalaproject.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nenasalaproject.dao.UserDao;
import com.nenasalaproject.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired			// This means following object should be filled by the bean has name as the qualifier value
	@Qualifier("userDao")			// Bean name of the DIConfigur class
	private UserDao userDao;
	
	public UserServiceImpl() {}
	
	@Transactional
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}

}
