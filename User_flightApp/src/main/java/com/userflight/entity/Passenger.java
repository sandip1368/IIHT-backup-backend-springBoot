package com.userflight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer passenger_id;
	private String passenger_name;
	private Integer passenger_age;
	private Integer passenger_seatNo;
	private String gender;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(Integer passenger_id, String passenger_name, Integer passenger_age, Integer passenger_seatNo,
			String gender) {
		super();
		this.passenger_id = passenger_id;
		this.passenger_name = passenger_name;
		this.passenger_age = passenger_age;
		this.passenger_seatNo = passenger_seatNo;
		this.gender = gender;
	}
	public Integer getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Integer passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public Integer getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(Integer passenger_age) {
		this.passenger_age = passenger_age;
	}
	public Integer getPassenger_seatNo() {
		return passenger_seatNo;
	}
	public void setPassenger_seatNo(Integer passenger_seatNo) {
		this.passenger_seatNo = passenger_seatNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
