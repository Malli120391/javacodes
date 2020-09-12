package com.malleswara.spring.springmvcorm.user.services;

import java.util.List;

import com.malleswara.spring.springmvcorm.user.entity.User;

public interface UserServices {
	
	int save(User user);
	
	List<User> getUser();
	
	User getUser(Integer id);
	

}
