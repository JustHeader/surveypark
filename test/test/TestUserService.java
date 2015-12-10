package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.surveypark.model.User;
import com.atguigu.surveypark.service.UserService;


public class TestUserService {
	
	private static UserService us;
	@BeforeClass
	public static void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		us = (UserService) ctx.getBean("userService");
	}
	@Test
	public void insert(){
		User u = new User();
		u.setEmail("xupccc@hotmail.com");
		u.setPassword("123456");
		u.setNickName("stone");
		us.saveEntity(u);
	}
}
