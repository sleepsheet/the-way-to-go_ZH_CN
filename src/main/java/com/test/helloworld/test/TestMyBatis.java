package com.test.helloworld.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.test.helloworld.entity.HelloWorld;
import com.test.helloworld.entity.User;
import com.test.helloworld.services.GetHelloService;
import com.test.helloworld.services.UserService;  

  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
 //   private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private UserService userService;  
    private GetHelloService getHelloService;
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
       // String hello = getHelloService.getHelloByMySql(1);
       // System.out.println(hello);
        //System.out.println(user.getUserName());  
      //  System.out.println(user);
        System.out.println(JSON.toJSONString(user));
    	//System.out.println(JSON.toJSONString(hello));
       // logger.info("值："+user.getUserName());  
        //logger.info(JSON.toJSONString(user));  
    }  
}  