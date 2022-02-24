package com.trainee.model.service.user;

import java.util.Optional;

import com.trainee.model.persistence.user.User;


public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);	
}
