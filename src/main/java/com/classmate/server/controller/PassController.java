package com.classmate.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.classmate.server.service.PassService;

@RestController
@ResponseBody
@RequestMapping("/pass")
public class PassController {
	
	@Autowired
	private PassService passService;
	
	@RequestMapping("/list")
	public Object passList(Integer userId) {
		return passService.passList(userId);
	}
	
	
}
