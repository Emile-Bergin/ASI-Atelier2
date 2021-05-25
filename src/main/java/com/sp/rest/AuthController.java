package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.service.AuthService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController {
	private AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@RequestMapping(method = RequestMethod.POST, value ="/api/auth/signup",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	 public UserEntity signup( UserEntity userEntity) {
		return this.authService.signup(userEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/auth/login",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<?> login(LoginDTO loginDTO, HttpServletResponse response) {
		try {
			 UserEntity result = authService.login(loginDTO);
			Long username = result.getId();
			Cookie cookie = new Cookie("session", username.toString());
			cookie.setMaxAge(7*24*360);
			cookie.setSecure(true);
			cookie.setHttpOnly(true);
			cookie.setPath("/");
			response.addCookie(cookie);
		}catch (Exception e){
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/api/auth/logout")
	public String logout(@CookieValue("session") String cookie) {
		
		return "bye" + cookie;
	}

}
