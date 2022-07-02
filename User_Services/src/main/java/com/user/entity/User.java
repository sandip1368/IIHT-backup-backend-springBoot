package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contacts= new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public Long getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	

}
