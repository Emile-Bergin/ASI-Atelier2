package com.sp.service;
import com.sp.model.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
//import com.sp.repository.UserRepository;
import com.sp.dto.*;

  

@Service
public class AuthService {
	private UserService userService;
	public AuthService(UserService userService) {
		this.userService = userService;
	}

	int id;
	public UserEntity signup(UserEntity user) {
		return userService.SaveUser(user);
	}
      

// 	public boolean login(LoginDTO user) {
// 		if((UserRepository.findByUsername(user.getUsername()) == true && (UserRepository.findByUsername(user.getUsername()).getPassword() == user.getPassword()))
// 		return true;
// 		else
// 		new UsernameNotFoundException("user not found");
// 		return false;
// 	}
  
//   public boolean logout(loginDTO user) {
// 	  if((UserRepository.findByUsername(user.getUsername()).deleteToken(user))== true){
// 	  	return true;
// 	  }
// 	  else {
// 	  	return false;
// 	  }
//   }

}
