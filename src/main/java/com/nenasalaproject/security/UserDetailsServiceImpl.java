package com.nenasalaproject.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nenasalaproject.dao.UserDao;
import com.nenasalaproject.entity.User;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
//	@Override
//	@Transactional(readOnly=true)
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		User user = userDao.getUserByUsername(username);
//		return buildUser(user);
//	}
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.getUserByUsername(username);
		System.out.println(user);
		return buildUser(user);
	}
	
	private org.springframework.security.core.userdetails.User buildUser(User user){
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		org.springframework.security.core.userdetails.User springUser 
		= new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
		
		return springUser;
		
	}
	
	
	

}
