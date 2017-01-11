package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.backend.model.Users;
=======
import com.backend.model.UsersModel;
>>>>>>> initial commit for Backend using DAO's

@ComponentScan("com")
@Repository
public interface UsersDao {
	
<<<<<<< HEAD
public void registerUser(Users user);
=======
public void registerUser(UsersModel user);
>>>>>>> initial commit for Backend using DAO's
}
