package service;

import java.util.ArrayList;

import model.Airplane;
import model.Airport;
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
	
	public static void listOfFlights() {
		String list = "";
		int count =1;
		for(Flight flightList : flights) {
			
			list = list + count +". "+ flightList;
			count++;
		}
		System.out.println(list);
	} 

	public static Flight selectFlight(int flightNumber) {

		for(Flight flightsList : flights) {
			
			if(flightsList.getFlightCodeNumber()==flightNumber)
					return flightsList;
		}
		return null;
	} 
	
}
