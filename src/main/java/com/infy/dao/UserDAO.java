package com.infy.dao;

import java.util.List;

import com.infy.model.User;

public interface UserDAO {
	

	public String addUser(User user);

	public List<User> getUser() ;

}
