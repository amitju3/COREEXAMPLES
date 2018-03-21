package com.scp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_mvc_user_info")
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_firstname")
	private String firstName;
	
	@Column(name = "user_surname")
	private String lastName;
	
	@Column(name = "user_address")
	private String address;
	
	@Column(name = "user_phone")
	private int phoneNo;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address
				+ ", phoneNo=" + phoneNo + "]";
	}

	public UserEntity(int userId, String firstName, String lastName, String address,
			int phoneNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
