ackage com.capg.springboot.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.dto.*;
import com.capg.springboot.entity.*;
import com.capg.springboot.repository.*;




@Service
@Transactional
public class FlightServiceImpl implements FlightService {

	@Autowired 
	private FlightRepository flightrepository;
	
	@Override
	public Flight addFlight(Flight flight) {
		
		flightrepository.save(flight);
	return flight;
	}
	
	@Override
	public Flight modifyFlight(Flight flight) {
		
		flightrepository.save(flight);
	return flight;
	}
	
	@Override
	public Flight deleteFlight(Flight flight) {
		
		flightrepository.save(flight);
	return flight;
	}
	
}






