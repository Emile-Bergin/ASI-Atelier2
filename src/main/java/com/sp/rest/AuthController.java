package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.service.AuthService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class AuthController {
	private AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

<<<<<<< HEAD
	@RequestMapping(value="/api/auth/signup", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String signup(LoginDTO loginDTO) {
=======
	@RequestMapping("/api/auth/signup")
	/*public String signup() {
>>>>>>> 3177b19c89b25fb6cb50adbb51ee4c49fdf510d3
		
		return "hello signup";
	}*/
	 public UserEntity signup(@RequestBody UserEntity userEntity) {
		return this.authService.signup(userEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/auth/login")
	public UserEntity login(@RequestBody LoginDTO loginDTO) {
		return authService.login(loginDTO);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/auth/logout")
	public String logout() {
		
		return "hello logout";
	}
	/* public String logout(@RequestBody LoginDTO loginDTO) {
		private AuthService service = new AuthService();
		logoutIsOk = service.logout(loginDTO);
		return logoutIsOk;
	}*/

}
