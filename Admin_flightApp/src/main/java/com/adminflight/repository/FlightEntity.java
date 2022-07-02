package com.adminflight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminflight.entity.Flight;


public interface FlightEntity extends JpaRepository<Flight,Integer>{

//	List<Flight> searchFlight(String fromPlace, String toPlace, LocalDate localDate, LocalDate localDate2,
//			String tripType);
	
	
	

}
