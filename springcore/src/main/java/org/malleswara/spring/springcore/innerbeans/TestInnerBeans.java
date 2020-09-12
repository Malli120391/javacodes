package org.malleswara.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/innerbeans/innerbeansconfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) context.getBean("employee");
		System.out.println(emp2.hashCode());
	}

}
