package com.test.helloworld.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface GetHelloDao {
	
	public String getHello(int id);

}
