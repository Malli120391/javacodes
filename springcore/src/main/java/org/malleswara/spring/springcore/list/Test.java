package org.malleswara.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/list/listconfig.xml");
		Hospital hspt = (Hospital) context.getBean("hospital");
		System.out.println(hspt.getName());
		System.out.println(hspt.getDepartments().getClass());
		
	}

}
