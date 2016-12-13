package com.test.helloworld.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.helloworld.dao.UserDao;
import com.test.helloworld.entity.User;
import com.test.helloworld.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;
	
	public User getUserById(int id) {

		return this.userDao.getUserById(id);
	}

}
