package com.malleswara.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamContoller {
	
	@RequestMapping("/showdata")
	public ModelAndView showdata(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("sal") double salary) {
		//ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		
		return new ModelAndView("userReg");
		
	}

}
