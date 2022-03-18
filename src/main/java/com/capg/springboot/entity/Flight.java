package com.capg.springboot.entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Flight")

public class Flight {
	
	@Id
	
	private int id;
	private String departureLocation;
	private String arrivalLocation;
	Fleet fleet;
	FlightStatus status;
	private Date departureTime=new Date();
	private Date arrivalTime =new Date();
	
	
	@OneToOne(mappedBy = "booking",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Booking booking;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fare_id")
	private Fare fare;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="location_id")
	private Location location;
	
	
	
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
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String departureLocation, String arrivalLocation, Date departureTime,Date arrivalTime, FlightStatus status, Fleet  fleet) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime=arrivalTime;
		this.fleet= fleet;
		this.status=status;
		
	}
	
	
	

}
