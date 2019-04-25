package com.tahany.restful.login;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tahany.restful.login.model.Login;
import com.tahany.restful.login.service.LoginService;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

	

	LoginService loginService = new LoginService();

	@GET
	public List<Login> getLogin() {
		return loginService.getAllLogins();
	}


	@POST
	public Login addLogin(Login login) {
		return loginService.addLogin(login);
	}


	@PUT
	@Path("/{loginId}")
	public Login updateLogin(Login login) { 
		return loginService.updateLogin(login);
	}

	@DELETE
	@Path("/{loginId}")
	public void deleteLogin(Login login) {
		loginService.removeLogin(login);
	}
}
