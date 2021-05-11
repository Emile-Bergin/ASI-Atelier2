package com.sp.rest;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class UserController {
	


	@RequestMapping(method=RequestMethod.GET,value="/api/user/id")
		int getUser(@PathVariable int id) {
		
		return id;
	}
	
	void saveUser (User u) {
		int ret = getUser(u.getId());
		if  (ret == 0) {
			//TODO
		}
		else {
			//TODO
		}
	}

}
