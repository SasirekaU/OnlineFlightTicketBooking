package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Flight;


public abstract class FlightRepository implements JpaRepository<Flight, String>{

	
	
	abstract Flight addFlight(Flight add);

	
	abstract Flight modifyFlight(Flight add);
	

	abstract Flight removeFlight(Flight add);
	
	}
