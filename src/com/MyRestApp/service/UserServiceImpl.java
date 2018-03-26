package com.MyRestApp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.MyRestApp.model.User;


@Service
public class UserServiceImpl implements MyService{


	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users;

	static{
		users= populate();
	}

	public List<User> findAllUsers() {
		return users;
	}

	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}

	public User findByName(String name) {
		for(User user : users){
			if(user.getName().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}

	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {

		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
			}
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName())!=null;
	}

	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populate(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"Kumar","ram","MS",30, 70000));
		users.add(new User(2,"Kumar","shyam","Alti",25, 50000));
		users.add(new User(3,"Kumar","man","Paypal",50, 170000));
		users.add(new User(4,"Kumar","raj","Yodlee",20, 660000));
		users.add(new User(5,"Kumar","rahul","CapG",32, 350000));

		return users;
	}

}
