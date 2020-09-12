package org.malleswara.spring.springcore.dependenceycheck;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlc {

	public static void main(String[] args) {

         ApplicationContext contxet = 
            		new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/dependenceycheck/dependencycheckconfig.xml");
            Prescription pre = (Prescription) contxet.getBean("prescription");
            System.out.println(pre);
            
	}

}
