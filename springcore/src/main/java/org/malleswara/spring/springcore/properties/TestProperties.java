package org.malleswara.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages cal = (CountriesAndLanguages) context.getBean("contryandlang");
		System.out.println(cal);
	}

}
