package org.test.java.service;

import org.test.java.model.User;

public class LoginService {
	
	public boolean verifyLogin(User user) {
		if(user.getUserId().equals("userId")&& user.getPassword().equals("password")){
			return true;
		}
		return false;		
		}
	}


