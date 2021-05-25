package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.service.AuthService;
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

	@RequestMapping("/api/auth/signup")
	/*public String signup() {
		
		return "hello signup";
	}*/
	 public UserEntity signup(@RequestBody UserEntity userEntity) {
		return this.authService.signup(userEntity);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/auth/login")
	public String login(@RequestBody LoginDTO loginDTO) {
		/*return loginDTO.getUsername();*/
		return "test";
	}
	/*public String login(@RequestBody LoginDTO loginDTO) {
		private AuthService service = new AuthService();
		token = service.login(loginDTO);
		return token;
	}*/
	
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
