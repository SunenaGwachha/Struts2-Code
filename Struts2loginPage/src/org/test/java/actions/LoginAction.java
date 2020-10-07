package org.test.java.actions;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends  ActionSupport {	
//public class LoginAction implements Action {	
	public String userId;
	public String password;	
	//public static String SUCCESS="sucess"; Action class already have SUCESS
	
public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	//Before execute method it call for validate method, if any field error struts2,
	// by default do not execute the execute method,but it redirects to input result.
	//<result name="input">/login.jsp</result> in login.xml, i,e. automatically redirect to login.jsp 
	//overrriding validate method of ActionSupport for checking userID and password not null
	public void validate() {	
		if(StringUtils.isEmpty(getUserId())) {
			//User ID blank			
			//addFieldError automatically redirect the page where data was submitted 
			addFieldError("userId","User ID cannot be blank");			
		}
		if(StringUtils.isEmpty(getPassword())) {
			//User ID password
			addFieldError("password","Password cannot be blank");			
		}
	}	
   public String execute() {		
	if(getUserId().equals("userId")&& getPassword().equals("password")){
		return SUCCESS;
	}
	return LOGIN;		
	}
}
