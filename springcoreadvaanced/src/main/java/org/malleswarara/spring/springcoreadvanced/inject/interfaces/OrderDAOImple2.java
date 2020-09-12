package org.malleswarara.spring.springcoreadvanced.inject.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImple2 implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside OrderDAOImple2 createOrder");
	}

}
