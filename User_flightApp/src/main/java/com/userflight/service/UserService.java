package com.userflight.service;

import java.util.List;
import java.util.Optional;

import com.userflight.entity.BookingTicket;
import com.userflight.entity.Flight;

public interface UserService {

	Long bookFlight(BookingTicket ticket);

	List<BookingTicket> getBookingByPnrNo(Long pnrNumber);

	List<BookingTicket> getBookingHistory(String email);

	void cancelBooking(Long ticketNo);

	

	//Long bookFlight(BookingTicket ticket);

	//Flight searchForFlight(Flight flightDetails);

}
