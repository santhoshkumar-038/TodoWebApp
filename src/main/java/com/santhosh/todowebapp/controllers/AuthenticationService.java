package com.santhosh.todowebapp.controllers;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("Santhosh");
		boolean isValidPassword = password.equalsIgnoreCase("Dummy");
		
		return isValidUsername && isValidPassword;
	}
}
