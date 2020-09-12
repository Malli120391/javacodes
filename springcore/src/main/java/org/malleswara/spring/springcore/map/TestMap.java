package org.malleswara.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/map/mapconfig.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		//System.out.println(cust.getProducts().getClass().getName());
		
	}

}
