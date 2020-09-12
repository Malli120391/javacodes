package org.malleswarara.spring.springcoreadvanced.steretype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswarara/spring/springcoreadvanced/steretype/annotation/steretypeannoconfig.xml");
		Instructor instructor = (Instructor) context.getBean("init");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) context.getBean("init");
		System.out.println(instructor2);
	}

}
