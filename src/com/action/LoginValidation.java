package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginValidation extends ActionSupport {
	private String Username;
	private String Password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
