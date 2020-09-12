package com.malleswara.spring.datajpa;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.malleswara.spring.data.repo.ProductRepository;
import com.malleswara.spring.datajpa.entities.Product;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setId(10L);
		product.setName("Malleswara rao");
		product.setDescription("This is spring boot setup");
		product.setPrice(500d);
		repository.save(product);
		
		Optional<Product> result = repository.findById(10L);
		System.out.println(result);
		
		repository.save(result);
	
		
		
		
		
	}

}
