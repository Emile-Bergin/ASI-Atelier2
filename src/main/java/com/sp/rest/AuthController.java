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
		return "<h1>hello login</h1>";
	}
	
	@RequestMapping("/api/auth/logout")
	public String sayHello2() {
		return "hello login";
	}

}
