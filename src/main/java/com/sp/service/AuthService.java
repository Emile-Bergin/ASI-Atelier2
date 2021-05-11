package com.sp.service;
  import org.springframework.stereotype.Service;
  import com.sp.service.UserService;

  @Service
  public class AuthService {
  	private String jtoken;
  	int i;
  	
      public String signup(String json) {
    	 String u = com.sp.service.UserService.getHero();
        
    	 return this.jtoken;
      }
      
      public String login(String json) {
          
         return this.jtoken;
      }
      
      public void logout(String json) {
    	 ;
      }

  }