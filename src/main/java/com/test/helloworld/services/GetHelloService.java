package com.test.helloworld.services;

public interface GetHelloService {
	
	public String getHelloByService();
	
	public String getHelloByMySql(int id);
	
	public String getHelloByRedis();
	
}
