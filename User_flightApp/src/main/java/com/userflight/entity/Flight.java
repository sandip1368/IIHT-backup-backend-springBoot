package com.userflight.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Flight {
	
	private Integer flightNo;
	
	private String airLinename;
	private String fromPlace;
	private String toPlace;

	
	private Date startDate;

	
	private Date endDate;

	private String instrument;
	private int businessSeat;
	private int nonBusinessSeat;
	private double ticket;
	private String meal;
	private String ways;
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(Integer flightNo, String airLinename, String fromPlace, String toPlace, Date startDateTime,
			Date endDateTime, String instrument, int businessSeat, int nonBusinessSeat, double ticket, String meal,
			String ways) {
		super();
		this.flightNo = flightNo;
		this.airLinename = airLinename;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDateTime;
		this.endDate = endDateTime;
		this.instrument = instrument;
		this.businessSeat = businessSeat;
		this.nonBusinessSeat = nonBusinessSeat;
		this.ticket = ticket;
		this.meal = meal;
		this.ways = ways;
	}
	public Integer getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(Integer flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirLinename() {
		return airLinename;
	}
	public void setAirLinename(String airLinename) {
		this.airLinename = airLinename;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDateTime) {
		this.startDate = startDateTime;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDateTime) {
		this.endDate = endDateTime;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public int getBusinessSeat() {
		return businessSeat;
	}
	public void setBusinessSeat(int businessSeat) {
		this.businessSeat = businessSeat;
	}
	public int getNonBusinessSeat() {
		return nonBusinessSeat;
	}
	public void setNonBusinessSeat(int nonBusinessSeat) {
		this.nonBusinessSeat = nonBusinessSeat;
	}
	public double getTicket() {
		return ticket;
	}
	public void setTicket(double ticket) {
		this.ticket = ticket;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getWays() {
		return ways;
	}
	public void setWays(String ways) {
		this.ways = ways;
	}

	
	
	
	
	
}
