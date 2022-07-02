package com.adminflight.serviceImpl;

import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.adminflight.entity.Flight;

import com.adminflight.exception.RecordNotFoundException;
import com.adminflight.repository.FlightEntity;
import com.adminflight.service.InterFlight;

@Service
@Component
public class FlightServiceImpl implements InterFlight {

	@Autowired
	private FlightEntity flightEntity;
	
	
	@Override
	public Long addFlight(Flight flight) {

		Flight fght= flightEntity.save(flight);
		return fght.getFlightNo();
	}


//	public List<Flight> search(SearchFlight searchFlight) {
//		
//	return flightEntity.searchFlight(searchFlight.getFromPlace(),searchFlight.getToPlace(),searchFlight.getStratDateTime()
//.toInstant().atZone(ZoneId.systemDefault())
//.toLocalDate(),searchFlight.getEndDateTime().toInstant()
//.atZone(ZoneId.systemDefault())
//.toLocalDate(),searchFlight.getTripType());
//	}


	
	
	
	
//	@Override
//	public void delete(int id) {
//	
//		flightEntity.deleteById(id);
//	}
//
//
//	@Override
//	public String validDataLogin(String username, String password) {
//		String msg="";
//		if(username.equals("Admin") && password.equals("admin1234"))
//		{
//		return	msg="Success";
//		}
//		else {
//			return msg;
//		}
//
//	}
//
//
//	@Override
//	public List<Flight> viewAllFlight() {
//		
//		return null;
//	}
//
//
//	@Override
//	public Flight editFlight(int id, Flight flight) {
//		   
//	Flight rst=flightEntity.findById(id).orElseThrow(() -> new RecordNotFoundException("Record Not Found"+id));
//		
//			rst.setAirLinename(flight.getAirLinename());
//			rst.setBusinessSeat(flight.getBusinessSeat());
//			rst.setEndDateTime(flight.getEndDateTime());
//			rst.setFlightNo(flight.getFlightNo());
//			rst.setFromPlace(flight.getFromPlace());
//			rst.setInstrument(flight.getInstrument());
//			rst.setMeal(flight.getMeal());
//			rst.setNonBusinessSeat(flight.getNonBusinessSeat());
//			rst.setStartDateTime(flight.getStartDateTime());
//			rst.setTicket(flight.getTicket());
//			rst.setToPlace(flight.getToPlace());
//			rst.setWays(flight.getWays());
//			
//		return 	flightEntity.save(rst);
//			
//	
//	}

}
