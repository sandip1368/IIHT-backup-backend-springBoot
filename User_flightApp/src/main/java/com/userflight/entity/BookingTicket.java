package com.userflight.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Booking_Ticket")
public class BookingTicket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ticketNo;
	private Long pnrNumber;
	private Long flightNo;
	private String email;
	private Integer noOfSeats;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingData;
	
	private String optMeal;

//	@OneToMany(cascade= CascadeType.ALL)
//	@JoinColumn(name="ticket_no",referencedColumnName="ticketNo")
//	private  Set<Passenger> passenger;
	
	private Integer status;
	
	//passenger
	private String passenger_name;
	private Integer passenger_age;
	private Integer passenger_seatNo;
	private String gender;

	public BookingTicket() {
		super();
	}

	public BookingTicket(Long ticketNo, Long pnrNumber, Long flightNo, String email, Integer noOfSeats,
			Date bookingData, String optMeal, Integer status, String passenger_name, Integer passenger_age,
			Integer passenger_seatNo, String gender) {
		super();
		this.ticketNo = ticketNo;
		this.pnrNumber = pnrNumber;
		this.flightNo = flightNo;
		this.email = email;
		this.noOfSeats = noOfSeats;
		this.bookingData = bookingData;
		this.optMeal = optMeal;
		this.status = status;
		this.passenger_name = passenger_name;
		this.passenger_age = passenger_age;
		this.passenger_seatNo = passenger_seatNo;
		this.gender = gender;
	}

	public Long getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public Long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Date getBookingData() {
		return bookingData;
	}

	public void setBookingData(Date bookingData) {
		this.bookingData = bookingData;
	}

	public String getOptMeal() {
		return optMeal;
	}

	public void setOptMeal(String optMeal) {
		this.optMeal = optMeal;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
