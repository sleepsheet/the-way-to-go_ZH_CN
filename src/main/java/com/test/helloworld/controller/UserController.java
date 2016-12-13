package com.test.helloworld.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.helloworld.entity.User;
import com.test.helloworld.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/show")
	public String toIndex(HttpServletRequest request, Model model){
		//int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(1);
		System.out.println(user.getUserName());
		model.addAttribute("user",user);
		return "show";
		
	}
}
