package com.test.helloworld.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.helloworld.dao.GetHelloDao;
import com.test.helloworld.services.GetHelloService;

import redis.clients.jedis.Jedis;

@Service("gethelloservice")
public class GetHelloServiceImpl implements GetHelloService {

	@Resource
	private GetHelloDao getHelloDao;

	public String getHelloByService() {
		System.out.println("run to getHelloByServiceImpl!");
		String str = "Hello World!";
		return str;
	}

	public String getHelloByMySql(int id) {
		
		return this.getHelloDao.getHello(id);

	}

	public String getHelloByRedis() {
		// 连接本地Redis服务
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connect to Redis sucessfully!");

		// 设置redis字符串数据
		jedis.set("hello", "Hello World!");
		return jedis.get("hello");
	}

}
