package com.userflight.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userflight.entity.BookingTicket;
import com.userflight.entity.Flight;
import com.userflight.service.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserFlightController {

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	@GetMapping("/search")
	public List<Flight> searchForAllFlights(){
		ResponseEntity<Flight[]> flightDetails =  this.restTemplate.getForEntity("http://AdminService/api/V1.0/flight/allFlight",Flight[].class);
		Flight[] flight=flightDetails.getBody();
		List<Flight> list=Arrays.asList(flight);
		return list;
	}
	
	
	@GetMapping("/FindFlight/{fromPlace}/{toPlace}/{startDate}/{endDate}")
	public List<Flight> searchFlightByData(@PathVariable("fromPlace") String fromPlace, @PathVariable("toPlace") String toPlace,@PathVariable("startDate") Long startDate,@PathVariable("endDate") Long endDate){
		List<Flight> flightData =  this.restTemplate.getForObject("http://AdminService/api/V1.0/flight/search/"+fromPlace+"/"+toPlace+"/"+startDate+"/"+endDate,List.class);
		return flightData;
	}
	
	@PostMapping("/bookFlight")
	public Long bookFlight(@RequestBody BookingTicket ticket) {
		Long pnrNumber = generatePNRNumber();
		ticket.setPnrNumber(pnrNumber);
		ticket.setBookingData(new Date());
		
		return userService.bookFlight(ticket);
	}
	
	
	
	
	static Long generatePNRNumber() {
		int lenght=10;
		String number = "0123456789";
		
		StringBuilder sb = new StringBuilder(lenght);
		for(int i=0;i<lenght;i++) {
			int index = (int)(number.length() * Math.random());
			
			sb.append(number.charAt(index));
		}
		return Long.valueOf(sb.toString());
	}
	
	
	
	
	@GetMapping("/flight/ticket/{pnrNumber}")
	public List<BookingTicket> getBookingByPnrNo(@PathVariable("pnrNumber") Long pnrNumber) {
		return userService.getBookingByPnrNo(pnrNumber);
	}
	
	
	

	
	@GetMapping("/booking/history/{email}")
	public List<BookingTicket> getBookingHistory(@PathVariable("email") String email) {
		List<BookingTicket> list= userService.getBookingHistory(email);
		
		return list;
	}
	
	
	
	@DeleteMapping("/booking/cancel/{id}")
	public String cancelBooking(@PathVariable ("id") Long ticketNo) {
		userService.cancelBooking(ticketNo);
		return "Your flight booking has been cancelled";
	}
	
	
}

