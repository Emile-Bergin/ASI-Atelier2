package com.sp.rest;


import com.sp.service.AuthService;
import com.sp.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.sp.model.UserEntity;

import java.util.Optional;

@RestController
public class UserController {
    private UserService authService;

    public UserController(UserService authService) {
        this.authService = authService;
    }

    @GetMapping("/api/user/{id}")
	UserEntity findUserById(@PathVariable(value = "id") int id) {
        return this.authService.getUser(id);
	}


}
