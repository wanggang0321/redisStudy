package com.ppdtbb.boots.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello3")
public class HelloDemoController {
	
	@RequestMapping("")
	public String testHello() {
		
		return "Hello world3.";
	}
	
}
