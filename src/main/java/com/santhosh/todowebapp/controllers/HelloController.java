package com.santhosh.todowebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("say-hello")
	@ResponseBody
	public String sayHelloController() {
		return "Hello, what are you learning today!";
	}
	
	@GetMapping("say-hello-jsp")
	public String sayHelloJspController() {
		return "sayHello";
	}
}
