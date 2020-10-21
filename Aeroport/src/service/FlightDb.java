package service;

import java.util.ArrayList;

import model.Flight;

public class FlightDb {

	public String name;
	public static ArrayList<Flight> flights;
	
	public FlightDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addFlightToDb(Flight flight) {
		
		flights.add(flight);
	}

	public static void setFlights(ArrayList<Flight> flights) {
		FlightDb.flights = flights;
	}

}
