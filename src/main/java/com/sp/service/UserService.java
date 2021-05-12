package com.sp.service;
import org.springframework.stereotype.Service;

import com.sp.model.UserEntity;
import com.sp.repository.UserRepository;

@Service
public class UserService {
    
    public void SaveUser(UserEntity u) {

        // return UserRepository.save(user);
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

