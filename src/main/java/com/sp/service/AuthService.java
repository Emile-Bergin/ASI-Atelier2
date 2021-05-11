package com.sp.service;
  import org.springframework.stereotype.Service;
  import com.sp.service.UserService;
  
  /*Test*/

  @Service
  public class AuthService {
  	private String jtoken;
  	int id;
  	
      public string signup(String json) {
     	 String u = com.sp.service.UserService.SaveUser();
        
    	 return this.jtoken;
      }
      
      public boolean login(int id) {
    	 if(UserRepository.findById(id) == true)
    		return true;
    	 else
    		new UsernameNotFoundException("user not found by id:" + id));
    		return false;
      }
      
      public void logout(int id) {
    	  UserRepository.findById(id).getToken(user);
      }

  }