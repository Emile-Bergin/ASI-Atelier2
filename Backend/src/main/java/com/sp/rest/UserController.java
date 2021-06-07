package com.sp.rest;

import com.sp.model.UserEntity;
import com.sp.service.UserService;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user")
    UserEntity findUserById(@CookieValue("session") long cookie) {
        return this.userService.getUser(cookie);
    }
}
