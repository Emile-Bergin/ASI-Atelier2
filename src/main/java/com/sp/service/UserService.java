package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.UserEntity;
import com.sp.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity SaveUser(UserEntity u) {
        return userRepository.saveAndFlush(u);

    }
    
    public UserEntity getUser(int id) {
        // ptional<UserEntity> user = userRepository.findById(id);

        // if(user.isPresent()) {
        //     return ResponseEntity.ok().body(user.get());
        // } else {
        //     return ResponseEntity.notFound().build();
        // }

        return null;
    }

}

