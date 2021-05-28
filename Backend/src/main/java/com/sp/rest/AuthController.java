package com.sp.rest;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController {
    private AuthService authService;
    private jsonFormat = MediaType.APPLICATION_JSON_VALUE;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth/signup", consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserEntity signup(@RequestBody UserEntity userEntity) {
        return this.authService.signup(userEntity);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/auth/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO, HttpServletResponse response) {
        try {
            UserEntity result = authService.login(loginDTO);
            System.out.println(result);
            Long username = result.getId();
            Cookie cookie = new Cookie("session", username.toString());
            cookie.setMaxAge(7 * 24 * 360);
            cookie.setSecure(true);
            cookie.setHttpOnly(true);
            cookie.setPath("/");
            response.addCookie(cookie);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/auth/logout")
    public ResponseEntity<?> logout(HttpServletResponse response) {
        try {
            Cookie cookie = new Cookie("session", null);
            cookie.setMaxAge(0);
            cookie.setSecure(true);
            cookie.setHttpOnly(true);
            cookie.setPath("/");
            response.addCookie(cookie);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }
}
