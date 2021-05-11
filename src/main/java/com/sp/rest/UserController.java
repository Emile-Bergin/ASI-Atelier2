package com.sp.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method=RequestMethod.GET,value="/api/user/id")
public class UserController {
	
		@PostMapping("/id")
		int getUser() {
			
		}
	

}
