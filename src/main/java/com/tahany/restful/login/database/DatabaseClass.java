package com.tahany.restful.login.database;

import java.util.HashMap;
import java.util.Map;

import com.tahany.restful.login.model.Login;

public class DatabaseClass {
	
	private static Map<String, Login> logins = new HashMap<>();

    public static Map<String, Login> getLogin() {
        return logins;
    }

}