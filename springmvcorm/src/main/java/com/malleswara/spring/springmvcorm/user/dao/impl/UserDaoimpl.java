package com.malleswara.spring.springmvcorm.user.dao.impl;

//import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.malleswara.spring.springmvcorm.user.dao.UserDao;
import com.malleswara.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoimpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int crate(User user) {
        
		Integer result = (Integer) hibernateTemplate.save(user);
		
		return result;
	}

	@Override
	public List<User> findUsers() {

		return hibernateTemplate.loadAll(User.class);
		
		
		
	}

	@Override
	public User findUser(Integer id) {
		
		return hibernateTemplate.get(User.class, id);
	}
	
	
}
