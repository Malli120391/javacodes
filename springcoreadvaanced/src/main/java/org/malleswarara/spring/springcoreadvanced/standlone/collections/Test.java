package org.malleswarara.spring.springcoreadvanced.standlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context =
		new ClassPathXmlApplicationContext
		("org/malleswarara/spring/springcoreadvanced/standlone/collections/standlonecollconfig.xml");
		ProductList plist = (ProductList) context.getBean("productlist");
		System.out.println(plist);
	}

}
