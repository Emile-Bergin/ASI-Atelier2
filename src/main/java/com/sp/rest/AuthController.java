package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.service.AuthService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class AuthController {

	@RequestMapping("/api/auth/signup")
	public String signup() {
		
		return "hello signup";
	}
	/* public String signup(@RequestBody LoginDTO loginDTO) {
		private AuthService service = new AuthService();
		token = service.signup(loginDTO);
		return token;
	}*/
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/auth/login")
	public String login(@RequestBody LoginDTO loginDTO) {
		return loginDTO.getUsername();
	}
	/* public String login(@RequestBody LoginDTO loginDTO) {
		private AuthService service = new AuthService();
		token = service.login(loginDTO);
		return token;
	}*/
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/auth/logout")
	public String logout() {
		
		return "hello login";
	}
	/* public String logout(@RequestBody LoginDTO loginDTO) {
		private AuthService service = new AuthService();
		logoutIsOk = service.logout(loginDTO);
		return logoutIsOk;
	}*/

}
