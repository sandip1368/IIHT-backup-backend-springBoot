package com.userflight.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userflight.entity.BookingTicket;
import com.userflight.entity.Flight;

@Repository
public interface IUserFlightRepository extends JpaRepository<BookingTicket,Long> {

	List<BookingTicket> findByEmail(String email);

	List<BookingTicket> findByPnrNumber(Long pnrNumber);

	
	
	

}
