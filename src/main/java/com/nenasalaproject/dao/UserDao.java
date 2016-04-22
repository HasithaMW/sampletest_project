package com.nenasalaproject.dao;

import com.nenasalaproject.entity.User;

public interface UserDao {
	
	void saveUser(User user);
	
	User getUserByUsername(String username);

}
