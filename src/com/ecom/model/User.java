package com.ecom.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String pass;
	private int mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", mobile=" + mobile + "]";
	}
	public User( String name, String email, String pass, int mobile) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
	}
	public User() {
		super();
	}

}
