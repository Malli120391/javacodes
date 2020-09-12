package org.malleswara.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlc {

	public static void main(String[] args) {

            AbstractApplicationContext contxet = 
            		new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/lc/xmlconfig/lcconfig.xml");
            Patient p = (Patient) contxet.getBean("patient");
            System.out.println(p);
            contxet.registerShutdownHook();
	}

}
