package com.sp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class AuthController {
	
	@RequestMapping("/api/auth/signup")
	public String signup() {
		
		return "hello signup";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/auth/login")
	public String login() {
		return "<h1>hello login</h1>";
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/auth/logout")
	public String logout() {
		
		return "hello login";
	}

}
