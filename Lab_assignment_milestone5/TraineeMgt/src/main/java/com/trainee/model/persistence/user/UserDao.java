package com.trainee.model.persistence.user;

import java.util.Optional;

import com.trainee.model.exceptions.UserNotFoundException;

public interface UserDao {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password) throws UserNotFoundException;
}
	

