package com.adminflight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adminflight.utils.DateDeserializer;
import com.adminflight.utils.DateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightNo;
	
	private String airLinename;
	private String fromPlace;
	private String toPlace;

	@JsonDeserialize(using = DateDeserializer.class)
	@JsonSerialize(using = DateTimeSerializer.class)
	private Date startDateTime;

	@JsonDeserialize(using = DateDeserializer.class)
	@JsonSerialize(using = DateTimeSerializer.class)
	private Date endDateTime;

	private String instrument;
	private int businessSeat;
	private int nonBusinessSeat;
	private double ticket;
	private String meal;
	private String ways;

	public Flight() {
		super();

	}

	public Flight(Long flightNo, String airLinename, String fromPlace, String toPlace, Date startDateTime,
			Date endDateTime, String instrument, int businessSeat, int nonBusinessSeat, double ticket, String meal,
			String ways 
			//SearchFlight searchflight
			) {
		super();
		this.flightNo = flightNo;
		this.airLinename = airLinename;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.instrument = instrument;
		this.businessSeat = businessSeat;
		this.nonBusinessSeat = nonBusinessSeat;
		this.ticket = ticket;
		this.meal = meal;
		this.ways = ways;
		//this.searchflight=searchflight;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Long i) {
		this.flightNo = i;
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

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
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

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airLinename=" + airLinename + ", fromPlace=" + fromPlace
				+ ", toPlace=" + toPlace + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
				+ ", instrument=" + instrument + ", businessSeat=" + businessSeat + ", nonBusinessSeat="
				+ nonBusinessSeat + ", ticket=" + ticket + ", meal=" + meal + ", ways=" + ways + "]";
	}

//	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinColumn(name="flightNo",referencedColumnName ="flightNo")
//	private SearchFlight searchflight;
//
//	public SearchFlight getSearchflight() {
//		return searchflight;
//	}
//
//	public void setSearchflight(SearchFlight searchflight) {
//		this.searchflight = searchflight;
//	}
	
}

