package com.nenasalaproject.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nenasalaproject.entity.User;

@Repository			// Teams implementing traditional J2EE patterns such as "Data Access Object" may also apply this stereotype to DAO classes
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessioFactory;

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessioFactory.getCurrentSession();
		session.save(user);
	}
	
	@Transactional
	public User getUserByUsername(String username){
		try{
		Session session = sessioFactory.getCurrentSession();
		Query query = session.createQuery("FROM User u WHERE u.username=:name");
		query.setString("name", username);
		return query.list().size()>0 ? (User)query.list().get(0) : null;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}

}
