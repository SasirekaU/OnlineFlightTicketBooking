package com.capg.springboot.dto;

import java.util.Date;

import com.capg.springboot.entity.Fleet;
import com.capg.springboot.entity.FlightStatus;

public class FlightDto {

	
	private int id;
	private String departureLocation;
	private String arrivalLocation;
	Fleet fleet;
	FlightStatus status;
	private Date departureTime=new Date();
	private Date arrivalTime =new Date();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation)
	{
		this.departureLocation=departureLocation;
	}
	
	public String getArrivalLocation()
	{
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation)
	{
		this.arrivalLocation=arrivalLocation;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime)
	{
		this.departureTime=departureTime;
	}
	
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime=arrivalTime;
	}
	public Fleet getFleet() {
		return fleet;
	}
	public void setFleet( Fleet fleet) {
		this.fleet= fleet;
	}
	public FlightStatus getStatus() {
		return status;
	}
	public void Flightstatus(FlightStatus status) {
		this.status = status;
	}
}
