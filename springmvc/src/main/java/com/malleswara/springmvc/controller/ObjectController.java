package com.malleswara.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.malleswara.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendoject() {
	
	ModelAndView modelAndView = new ModelAndView();

	modelAndView.setViewName("dispalyObject");
	
	Employee employee = new Employee();
	employee.setId(10);
	employee.setName("Malleswara");
	employee.setSalary(10000);
	modelAndView.addObject("employee",employee);
	
	
	  return modelAndView;
}
	
}