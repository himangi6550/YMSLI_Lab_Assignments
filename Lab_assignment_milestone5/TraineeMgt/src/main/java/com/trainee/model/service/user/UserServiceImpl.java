package com.trainee.model.service.user;

import java.util.Optional;

import com.trainee.model.persistence.user.User;
import com.trainee.model.persistence.user.UserDao;
import com.trainee.model.persistence.user.UserDaoImpl;
public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	public void addUser(User user) {
		userDao.addUser(user);	
	}

	public Optional<User> getUser(String username, String password) {
		return userDao.getUser(username, password);
	}


}
