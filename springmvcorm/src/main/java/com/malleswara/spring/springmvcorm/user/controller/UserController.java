package com.malleswara.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.malleswara.spring.springmvcorm.user.dao.UserDao;
import com.malleswara.spring.springmvcorm.user.entity.User;
import com.malleswara.spring.springmvcorm.user.services.UserServices;
//import com.malleswara.springmvc.dto.User;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userservices;
	
	
	@RequestMapping("userRegistration")
	public String showRegistrationPage() {
		return "userReg";
	
	}
	@RequestMapping(value ="registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = userservices.save(user);
		model.addAttribute("result", "User Created id:"+result);
		return "userReg";
	}
	
	@RequestMapping("getUser")
	public String getUser(ModelMap model) {
		List<User> users = userservices.getUser();
		model.addAttribute("users", users);
		return "displayUsers";
	
	}
	
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		
		User user = userservices.getUser(id);
		String msg="";
		if(user!=null) {
			msg = id+" already existing this mail";
		}
		return msg;
		
	}

	public UserServices getUserservices() {
		return userservices;
	}

	public void setUserservices(UserServices userservices) {
		this.userservices = userservices;
	}
	
	

}
