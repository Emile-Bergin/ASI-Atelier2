package com.sp.service;
import org.springframework.stereotype.Service;
import com.sp.service.UserService;
//import com.sp.repository.UserRepository;
import com.sp.dto.LoginDTO;  
  

@Service
public class AuthService {
int id;

  	
   public boolean signup(LoginDTO user) {
     if(com.sp.service.UserService.SaveUser(user)==true){
     	return true;
     }
     else{
    	 return false;
     }	 
   }
      
       /*
  public boolean login(LoginDTO user) {
	 if((UserRepository.findByUsername(user.getUsername()) == true && (UserRepository.findByUsername(user.getUsername()).getPassword() == user.getPassword()))
		return true;
	 else
		new UsernameNotFoundException("user not found");
		return false;
  }
  
  public boolean logout(loginDTO user) {
	  if((UserRepository.findByUsername(user.getUsername()).deleteToken(user))== true){
	  	return true;
	  }
	  else {
	  	return false;
	  }
  }*/

}
