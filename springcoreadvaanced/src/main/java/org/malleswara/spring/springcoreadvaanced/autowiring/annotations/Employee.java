package org.malleswara.spring.springcoreadvaanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	
	public Employee(Address address) {
		
		this.address = address;
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
