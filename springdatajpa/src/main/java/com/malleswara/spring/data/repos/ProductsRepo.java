package com.malleswara.spring.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.malleswara.spring.data.entities.Products;

public interface ProductsRepo extends CrudRepository<Products, Long> {
	
	List<Products> findByName(String name);
	List<Products> findByPrice(Double price);

	List<Products> findByNameAndPrice(String name, Double price);
}
