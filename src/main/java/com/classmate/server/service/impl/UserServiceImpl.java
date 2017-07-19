package com.classmate.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classmate.server.dao.mapper.UserMapper;
import com.classmate.server.model.User;
import com.classmate.server.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(Integer id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

}
