package com.tahany.restful.login.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tahany.restful.login.database.DatabaseClass;
import com.tahany.restful.login.model.Login;



public class LoginService{
	
	private static final String String = null;
	private Map<String, Login> logins = DatabaseClass.getLogin();
	
	public LoginService() {
		logins.put(String, new Login("s144260", "139855", true));
	}
	
	
	public List<Login> getAllLogins(){
		return new ArrayList<Login>(logins.values());
	}


	public Login addLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


	public Login updateLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


	public void removeLogin(Login login) {
		// TODO Auto-generated method stub
		
	}
	

}
