package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.service.AuthService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth/signup",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public UserEntity signup(UserEntity userEntity) {
        return this.authService.signup(userEntity);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth/login",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public UserEntity login(LoginDTO loginDTO) {
        return authService.login(loginDTO);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth/logout")
    public String logout() {

        return "hello logout";
    }

}
