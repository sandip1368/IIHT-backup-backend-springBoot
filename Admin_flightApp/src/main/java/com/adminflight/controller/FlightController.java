package com.adminflight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminflight.entity.Flight;

import com.adminflight.exception.RecordAlreadyPresentException;
import com.adminflight.exception.RecordNotFoundException;
import com.adminflight.service.InterFlight;

@RestController
@RequestMapping("/api/V1.0/flight")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightController {

	@Autowired
	private InterFlight interFlight;

//	@Autowired
//	private FlightEntity flightEntity;

	@PostMapping("/register")
	//@ExceptionHandler(RecordAlreadyPresentException.class) 
	public ResponseEntity<?> add(@RequestBody Flight flight) {
		Long result = interFlight.addFlight(flight);

		if (result > 0) {
			return new ResponseEntity<>("Successfully added" + result + "", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Unable to add" + result + "", HttpStatus.BAD_REQUEST);
		}
	}
	
	
//	@PostMapping("/search")
//	public ResponseEntity<?> find(@RequestBody SearchFlight searchFlight ){
//		
//		List<Flight> resultSearch=interFlight.search(searchFlight);
//		if(resultSearch != null && resultSearch.isEmpty())
//		{
//			return new ResponseEntity<>( resultSearch + "", HttpStatus.OK);
//		} 
//		else {
//		return new ResponseEntity<>("No data Available",HttpStatus.BAD_REQUEST);
//		}
//	
//		
//	}
	
	
//	@GetMapping("/admin/{username}/{password}")
//	public ResponseEntity<?> login(@PathVariable String username,@PathVariable String password)
//	{
//		
//		String result=interFlight.validDataLogin(username,password);
//		if(result.equalsIgnoreCase("Success"))
//		{
//			return new ResponseEntity<>("Successfully logged In", HttpStatus.OK);
//		}
//		else {
//			
//			return new ResponseEntity<>("Try with Valid credentials", HttpStatus.BAD_GATEWAY);
//		}
//		
//	}
//
//	@GetMapping("allFlight")
//	public ResponseEntity<?> viewAllFlight()
//	{
//		List<Flight> resultList=interFlight.viewAllFlight();
//		if(resultList != null && resultList.isEmpty())
//		{
//			return new ResponseEntity<>( resultList + "", HttpStatus.OK);
//		} 
//		else {
//		return new ResponseEntity<>("No flight Available",HttpStatus.BAD_REQUEST);
//		}
//	
//
//    }
//	
//	@DeleteMapping("/removeFlight/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
//	public ResponseEntity<?> remove(@PathVariable("id") int id)
//	{
//		
//		interFlight.delete(id);	
//			
//			return ResponseEntity.ok().body("fligh successfully Deleted");
//	
//		}
//	
//	
//	
//	@PutMapping("/editFlight?{id}")
//	public Flight editFlight(@PathVariable ("id") int id , @RequestBody Flight flight )
//	{
//			Flight editflightResult=interFlight.editFlight(id,flight);
//					return editflightResult;
//	}
}