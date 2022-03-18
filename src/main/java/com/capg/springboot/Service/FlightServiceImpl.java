package com.capg.springboot.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Flight;
import com.capg.springboot.exceptions.FlightNotFoundException;
import com.capg.springboot.repository.FlightRepository;



@Service
@Transactional

public abstract class FlightServiceImpl implements FlightService{

	@Autowired 
	
	private FlightRepository flightrepository;
	
	@override

	public Flight addFlight(Flight add) {
		
	   return  flightrepository.save(add);
		
		
	}
	
	@override
	

	public Flight modifyFlight(Flight add) {
		
		flightrepository.save(add);
	    return add;
	}
	

	
	
	@Override
	
	public  Flight viewFlightBy(String id)throws FlightNotFoundException{
		
		Flight add=FlightRepository.findFlightById(id);
		if(add==null)
			throw new FlightNotFoundException("Flight not found");
		return add;
	}
	
	@override
	public Flight save(Flight add)
	{
		return null;
	}
}

	



