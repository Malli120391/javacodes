package org.malleswara.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypeTest {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/reftypes/reftypeconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
