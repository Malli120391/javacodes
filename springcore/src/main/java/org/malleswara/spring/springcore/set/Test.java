package org.malleswara.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("org/malleswara/spring/springcore/set/setconfig.xml");
	CarDealer car = (CarDealer) context.getBean("cardealer");
	System.out.println(car.getName());
	System.out.println(car.getModel().getClass());

}
}