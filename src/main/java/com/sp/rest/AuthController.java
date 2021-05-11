package com.sp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@RequestMapping("/api/auth/signup")
	public String sayHello() {
		return "hello signup";
	}
	
	@RequestMapping("/api/auth/login")
	public String sayHello1() {
		return "hello login";
	}
	
	@RequestMapping("/api/auth/logout")
	public String sayHello2() {
		return "hello login";
	}

}
