package org.malleswara.spring.springcore.constructorinject.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/constructorinject/ambiguity/ambiguityconfig.xml");
		Addtion add = (Addtion) context.getBean("addtion");
		System.out.println(add);
	}

}
