package org.malleswara.spring.springorm.producttest.dao.impl;

import java.util.List;

//import java.io.Serializable;

import org.malleswara.spring.springorm.entity.ProductTest;
import org.malleswara.spring.springorm.producttest.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("productDao")
public class ProducttestDAOImpl implements ProductDAO {

	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Override
	@Transactional
	public int create(ProductTest producttest) {
		Integer result = (Integer) hibernatetemplate.save(producttest);
		return result;
	}

	@Override
	@Transactional
	public void update(ProductTest producttest) {
		hibernatetemplate.update(producttest);
		
	}

	@Override
	@Transactional
	public void delete(ProductTest producttest) {
		hibernatetemplate.delete(producttest);
	}

	@Override
	public ProductTest find(int id) {
		ProductTest productTest = hibernatetemplate.get(ProductTest.class, id);
		return productTest;
	}

	@Override
	public List<ProductTest> findAll() {
		List<ProductTest> listofproducts = hibernatetemplate.loadAll(ProductTest.class);
		return listofproducts;
	}

}
