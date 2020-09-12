package org.malleswarara.spring.springcoreadvanced.inject.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImple implements OrderBO {

	@Autowired
	@Qualifier("dao2")
	private OrderDAO dao;
	
	
	public OrderDAO getDao() {
		return dao;
	}


	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}


	@Override
	public void placeOrder() {
		
		System.out.println("Inside Order BO");
		dao.createOrder();

	}

}
