package com.junit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private Integer personId;
	
	private String personName;
	private String city;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer personId, String personName, String city) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.city = city;
	}
	public Integer getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public String getCity() {
		return city;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
