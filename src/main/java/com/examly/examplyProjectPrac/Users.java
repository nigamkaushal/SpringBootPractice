package com.examly.examplyProjectPrac;

public class Users {
	private String uname;
	private String pass;
	public Users() {}
	public Users(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", pass=" + pass + "]";
	}
	

}
