package org.malleswara.spring.springaop;

public class ProductServiceimpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

}
