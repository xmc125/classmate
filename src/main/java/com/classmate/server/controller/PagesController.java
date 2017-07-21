package com.classmate.server.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classmate.server.model.User;

@Controller
public class PagesController {
	@Autowired
	private UserController userController;
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("name", "zhangsan");
		return "index";
	}
	
	@RequestMapping("/getUser")
	public String getUser(ModelMap map, int id){
		
		User user = userController.getUser(id);
		List<User> list = new ArrayList<>();
		list.add(user);
		map.addAttribute("userList",list);
		return "user/user";
	}

}
