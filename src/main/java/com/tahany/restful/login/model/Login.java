package com.tahany.restful.login.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Login {

	private String brugernavn;
	private String adgangskode;
	private Boolean loggedIn;
	
	public Login() {
		
	}

	
	public Login(String brugernavn, String adgangskode, Boolean loggedIn) {
		this.brugernavn = brugernavn;
		this.adgangskode = adgangskode;
		this.loggedIn = loggedIn;
	}
	  

	public String getBrugernavn() {
		return brugernavn;
	}

	public void setBrugernavn(String brugernavn) {
		this.brugernavn = brugernavn;
	}

	public String getAdgangskode() {
		return adgangskode;
	}

	public void setAdgangskode(String adgangskode) {
		this.adgangskode = adgangskode;
	}

	public Boolean getLoggedIn() { 
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}
