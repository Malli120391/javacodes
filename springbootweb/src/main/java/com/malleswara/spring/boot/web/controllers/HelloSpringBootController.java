package com.malleswara.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBootController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi(@RequestParam String name) {
		return "bye" + name;
		
	}

}
