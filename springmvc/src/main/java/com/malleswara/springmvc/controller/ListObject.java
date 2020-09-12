package com.malleswara.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.malleswara.springmvc.dto.Employee;

@Controller
public class ListObject {
	
	@RequestMapping("/readList")
	public ModelAndView sendoject() {
	
	ModelAndView modelAndView = new ModelAndView();

	modelAndView.setViewName("dispalyList");
	
	Employee employee = new Employee();
	employee.setId(10);
	employee.setName("Malleswara");
	employee.setSalary(10000);
	
	Employee employee1 = new Employee();
	employee1.setId(11);
	employee1.setName("Venkat");
	employee1.setSalary(20000);
	
	Employee employee2 = new Employee();
	employee2.setId(12);
	employee2.setName("Naresh");
	employee2.setSalary(30000);
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	employees.add(employee);
	employees.add(employee1);
	employees.add(employee2);
	
	modelAndView.addObject("employees",employees);
	
	
	  return modelAndView;
}
	

}
