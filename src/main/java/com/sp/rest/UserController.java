package com.sp.rest;


import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.sp.model.UserEntity;

import java.util.Optional;

@RestController
public class UserController {


	// @GetMapping("/api/user/{id}")
	// ResponseEntity<UserEntity> findUserById(@PathVariable(value = "id") long id) {


	// }

	// @PostMapping("/api/user/save")
	// public User saveUser(@Validated @RequestBody UserEntity user) {
	// 	return userRepository.save(user);
	// }

}
