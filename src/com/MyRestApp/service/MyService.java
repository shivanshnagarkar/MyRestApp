package com.MyRestApp.service;

import java.util.List;

import com.MyRestApp.model.User;



public interface MyService {

	List<User> findAllUsers();
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	

}
