package org.malleswara.spring.springcore.propertyplaeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
	new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/propertyplaeholder/propertiesconfig.xml");
		MyDAO dao = (MyDAO) context.getBean("mydao");
		System.out.println(dao);
	}
}
