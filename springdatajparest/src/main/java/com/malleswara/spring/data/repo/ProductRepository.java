package com.malleswara.spring.data.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.malleswara.spring.datajpa.entities.Product;
import java.lang.String;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

	void save(Optional<Product> result);
	
	List<Product> findByName(String name);
	
	
	
	

}
