package com.scp.beans;

public class UserBean {

	private int userId;
	private String fname;
	private String lname;
	private String uAddress;
	private int userPhone;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", fname=" + fname + ", lname="
				+ lname + ", uAddress=" + uAddress + ", userPhone=" + userPhone
				+ "]";
	}
	public UserBean(int userId, String fname, String lname, String uAddress,
			int userPhone) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.uAddress = uAddress;
		this.userPhone = userPhone;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
