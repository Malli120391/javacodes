package org.malleswarara.spring.springcoreadvanced.inject.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
			new ClassPathXmlApplicationContext
			("org/malleswarara/spring/springcoreadvanced/inject/interfaces/injectinterfaceconfig.xml");
		OrderBO orderBO = (OrderBO) context.getBean("bo");
		orderBO.placeOrder();
		
		
	}

}
