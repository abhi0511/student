package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Login {

	public Login() {
		super();
	}


	public Login(int loginId,  String username,
		 String password) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
	
	}


	public int getLoginId() {
		return loginId;
	}


	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int loginId;
	
	
	@Column
	private String username;

	
	@Column
	private String password;



	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
