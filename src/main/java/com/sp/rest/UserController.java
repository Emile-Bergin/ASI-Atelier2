package com.sp.rest;


import com.sp.model.UserEntity;
import com.sp.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
