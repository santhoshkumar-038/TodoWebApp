package com.santhosh.todowebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private AuthenticationService authenticationService;

	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@GetMapping("/login")
	//RequestParam is used to capture query parameters from url and form data, we add as a parameters in our controller method
	//Model is used to send the data to jsp or html pages
	public String loginController() {
		return "login";
	}
	
	@PostMapping("/login")
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again");
		return "login";
	}
}
