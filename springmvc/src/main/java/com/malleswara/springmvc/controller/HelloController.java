package com.malleswara.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("hello");
		
		modelandview.addObject("id", 123);
		modelandview.addObject("name", "APJ");
		modelandview.addObject("salary", 10000);
		return modelandview;
	}

}
