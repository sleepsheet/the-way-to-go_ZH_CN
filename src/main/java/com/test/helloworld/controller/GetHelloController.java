package com.test.helloworld.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.helloworld.entity.User;
import com.test.helloworld.services.GetHelloService;
import com.test.helloworld.services.UserService;

@Controller
@RequestMapping("gethello")
public class GetHelloController {

	@Resource
	private GetHelloService getHelloService;
	@Resource
	private UserService userService;

	/**
	 * 通过Service方法获得helloworld
	 * 
	 * @param request
	 * @return String
	 * @author Administrator
	 */

	@RequestMapping(value = "/gethellobyservice")
	public String getHelloworldByService(HttpServletRequest request) {
		// HelloWorld hello = new HelloWorld();

		String str = this.getHelloService.getHelloByService();

		// hello.setValue(str);
		request.getSession().setAttribute("hello", str);

		// 设置Session失效时间为两个小时
		request.getSession().setMaxInactiveInterval(2 * 60 * 60);
		return "gethellobyservice";
	}

	/**
	 * 通过MySQL方式获得helloworld
	 * 
	 * @return String
	 * @author Administrator
	 */
	@RequestMapping(value = "/gethellobymysql")
	public String getHelloworldByMySQL(HttpServletRequest request) {
		// String hello = null;
		// hello = this.getHelloService.getHelloByMySql(1);

		User user1 = new User();
		user1 = this.userService.getUserById(2);

		request.getSession().setAttribute("user", user1);

		// 设置Session失效时间为两个小时
		request.getSession().setMaxInactiveInterval(2 * 60 * 60);

		return "gethellobymysql";

	}

	/**
	 * 通过redis方式获得helloworld
	 * 
	 * @return String
	 * @author Administrator
	 */
	@RequestMapping(value = "/gethellobyredis")
	public String getHelloByRedis(HttpServletRequest request) {

		String hello = this.getHelloService.getHelloByRedis();

		request.getSession().setAttribute("rehello", hello);
		request.getSession().setMaxInactiveInterval(2 * 60 * 60);

		return "gethellobyredis";
	}
}
