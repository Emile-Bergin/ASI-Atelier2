package com.sp.rest;

import com.sp.model.UserEntity;
import com.sp.service.UserService;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService authService;

    public UserController(UserService authService) {
        this.authService = authService;
    }

    @GetMapping("/api/user")
    UserEntity findUserById(@CookieValue("session") long cookie) {
        return this.authService.getUser(cookie);
    }
}
