package org.malleswara.spring.springorm.producttest.dao;

import java.util.List;

import org.malleswara.spring.springorm.entity.ProductTest;

public interface ProductDAO {
	
	int create(ProductTest producttest);
	
	void update(ProductTest producttest);
	
	void delete(ProductTest producttest);
	
	ProductTest find(int id);
	
	List<ProductTest> findAll();

}
