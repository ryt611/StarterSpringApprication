package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterSpringAppricationWeb {

	@RequestMapping("/web")
	public String hello(){
		return "Hello World!!";
	}
}
