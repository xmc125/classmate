package com.classmate.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.classmate.server.model.User;
import com.classmate.server.service.UserService;

@RestController
@ResponseBody
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser")
	public User getUser(Integer id){
		return userService.getUser(id);
	}
	
}
