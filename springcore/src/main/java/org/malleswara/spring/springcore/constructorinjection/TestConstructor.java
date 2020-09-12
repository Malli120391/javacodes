package org.malleswara.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/constructorinjection/constructorinjconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
