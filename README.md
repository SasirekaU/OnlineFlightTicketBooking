# OnlineFlightTicketBooking

// Flight MODULE

Add User:
POST :       Body  , raw   ,JSON

http://localhost:9090/FlightController/addFlight
{
        "FlightId": "812",
       "departureLocation"="Chennai",
        "arrivalLocation"="Mumbai",
        "departureTime"="1.30PM",
        "arrivalTime"="3.30PM"
    }


http://localhost:9090/FlightController/addFlight
{
         "FlightId": "456",
       "departureLocation"="Kolkata",
        "arrivalLocation"="Delhi",
        "departureTime"="12.30PM",
        "arrivalTime"="4.30PM"
        
    }



GET METHOD
----------
http://localhost:9090/FlightController/viewAllFlight
---------------------------------------------------------------------------
OUTPUT
-----

 {
        "FlightId": "812",
       "departureLocation"="Chennai",
        "arrivalLocation"="Mumbai",
        "departureTime"="1.30PM",
        "arrivalTime"="3.30PM"
    }
 
 {
         "FlightId": "456",
       "departureLocation"="Kolkata",
        "arrivalLocation"="Delhi",
        "departureTime"="12.30PM",
        "arrivalTime"="4.30PM"
        
    }

 
   
 ---------------------------------------------------------------------------
 
 
 
 
 
 DELETE METHOD 
 -------------
 http://localhost:9090/FlightController/deleteFlight
 ----------------------------------------------------------------------------
 OUTPUT
 -------
 
 
 {
         "FlightId": "456",
       "departureLocation"="Kolkata",
        "arrivalLocation"="Delhi",
        "departureTime"="12.30PM",
        "arrivalTime"="4.30PM"
        
    }

 MODIFY METHOD
 
 http://localhost:9090/FlightController/modifyFlight
 ----------------------------------------------------------------------------
 OUTPUT
 -------
 
 
 {
         "FlightId": "234",
       "departureLocation"="Banglore",
        "arrivalLocation"="Hyderabad",
        "departureTime"="1.30PM",
        "arrivalTime"="5.30PM"
        
    }
