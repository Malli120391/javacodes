package org.malleswara.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
    	Employee bean = (Employee) ctx.getBean("emp");
    	
        System.out.println( "Employee Details: " +bean.getId()+" "+bean.getName());
    }
}
