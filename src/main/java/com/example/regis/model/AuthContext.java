package com.example.regis.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthContext {
	String user ;
	String pass;
	boolean authenticated ;
	
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public AuthContext(){
		
	}
	public AuthContext(String user, String pass, boolean authenticated) {
		super();
		this.user = user;
		this.pass = pass;
		this.authenticated = authenticated;
	}
	
}
