package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.UserEntity;

@Service
public class UserService {
    
    public void SaveUser(UserEntity u) {
        System.out.println(u);
        //TODO creation user
    }
    
    public UserEntity getUser(int id) {
        UserEntity u = new UserEntity(1, "Nom", "Surnom",  "password");
        return u;
    }

}

