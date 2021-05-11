package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.User;

@Service
public class UserService {
    
    public void addHero(User u) {
        System.out.println(u);
    }
    
    public User getHero(int id) {
        User u =new User(1, "Nom", "Surnom", "Motdepasse");
        return u;
    }

}

