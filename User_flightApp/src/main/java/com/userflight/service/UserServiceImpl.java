package com.userflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userflight.entity.BookingTicket;
import com.userflight.repository.IUserFlightRepository;
@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private IUserFlightRepository userRepo;

	@Override
	public Long bookFlight(BookingTicket ticket) {
		// TODO Auto-generated method stub
		BookingTicket book_id= userRepo.save(ticket);
		return book_id.getTicketNo();
	}

	@Override
	public List<BookingTicket> getBookingByPnrNo(Long pnrNumber) {
		
		List<BookingTicket> booking_ticket=userRepo.findByPnrNumber(pnrNumber);
		return booking_ticket;		
		
	}

	@Override
	public List<BookingTicket> getBookingHistory(String email) {
		
	return userRepo.findByEmail(email);
		
	
	}

	public void cancelBooking(Long ticketNo) {
		
	
		userRepo.deleteById(ticketNo);
	       

	
}
	
	
}
