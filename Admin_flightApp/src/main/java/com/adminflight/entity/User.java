package com.adminflight.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	 private String name;
	 private String email;
	 private String address;
	 private int noOfSeat;
	 private String OptForMeal;
	 private String gender;
	 private int age;
	 private int seatNos;
	 private int pnr;
	 
	 @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name="flight_id", referencedColumnName ="flightNo")
	 private Flight flight;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String email, String address, int noOfSeat, String optForMeal, String gender,
			int age, int seatNos, int pnr, Flight flight) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.noOfSeat = noOfSeat;
		OptForMeal = optForMeal;
		this.gender = gender;
		this.age = age;
		this.seatNos = seatNos;
		this.pnr = pnr;
		this.flight = flight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public String getOptForMeal() {
		return OptForMeal;
	}

	public void setOptForMeal(String optForMeal) {
		OptForMeal = optForMeal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSeatNos() {
		return seatNos;
	}

	public void setSeatNos(int seatNos) {
		this.seatNos = seatNos;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	 
	 
	 
}