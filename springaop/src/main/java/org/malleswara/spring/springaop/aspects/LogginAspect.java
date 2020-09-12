package org.malleswara.spring.springaop.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	
	@Before("execution(* com.org.malleswara.spring.springaop.ProductServiceimpl.multiply(..))")
	public void logBefore(Joinpoint joinPoint) {
		System.out.println("Before calling the method");
		
	}
	
	@After("execution(* com.org.malleswara.spring.springaop.ProductServiceimpl.multiply(..))")
	public void logAfter(Joinpoint joinPoint) {
		System.out.println("After the method execution");
		
	}

}
