package org.malleswara.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springjdbc/sjdbcconfig.xml");
		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result =jdbctemplate.update(sql, new Integer(3), "malleswara", "chennu");
		System.out.println("No of records inserted:"+result);
	}

}
