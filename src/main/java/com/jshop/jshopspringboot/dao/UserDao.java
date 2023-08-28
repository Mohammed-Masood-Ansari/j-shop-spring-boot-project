package com.jshop.jshopspringboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jshop.jshopspringboot.dto.User;
import com.jshop.jshopspringboot.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repository;
	/*
	 * saveUserDao
	 */
	public User saveUserDao(User user) {
		return repository.save(user);
	}
	/*
	 * loginUser
	 */
	public User loginUserDao(String email)
	{
		User user = repository.findByUserEmail(email);
		if(user!=null) {
			
			return user;
		}
		return null;
	}
}
