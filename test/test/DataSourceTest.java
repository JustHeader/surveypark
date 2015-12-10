package test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {
	@Test
	public void getConnection() throws SQLException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		System.out.println(ds);
		System.out.println("dddddddddd");
	}
}
