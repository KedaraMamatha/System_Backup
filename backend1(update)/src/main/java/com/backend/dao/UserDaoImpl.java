package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
<<<<<<< HEAD
=======
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
>>>>>>> initial commit for Backend using DAO's
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.backend.model.Users;
=======
import com.backend.model.UsersModel;
>>>>>>> initial commit for Backend using DAO's

@Repository("userDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
<<<<<<< HEAD
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(Users user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
=======
	private static final Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(UsersModel user) 
	{
		
		logger.info("Registered User Model is Implements");
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
		logger.info("User Table Created and saved");
		
	System.out.println("---------");
>>>>>>> initial commit for Backend using DAO's
		
	}

}
