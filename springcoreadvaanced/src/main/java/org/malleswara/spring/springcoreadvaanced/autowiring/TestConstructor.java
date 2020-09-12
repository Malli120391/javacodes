package org.malleswara.spring.springcoreadvaanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcoreadvaanced/autowiring/constructorinjconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
