package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.User;

@Service
public class UserService {
    
    public void SaveUser(User u) {
        System.out.println(u);
        //TODO creation user
    }
    
    public User getUser(int id) {
        User u =new User(1, "Nom", "Surnom");
        return u;
    }

}

