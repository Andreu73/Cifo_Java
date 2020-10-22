package service;

import java.util.ArrayList;

import model.Airplane;
import model.Airport;

public class AirportDb {
	
	public String name;
	public static ArrayList<Airport> airports;
	
	public AirportDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addAirportToDb(Airport airport) {
		
		airports.add(airport);
	}

	public static void setAirports(ArrayList<Airport> airports) {
		AirportDb.airports = airports;
	}
	
	public static void listOfAirports() {
		String list = "";
		int count =1;
		for(Airport airportList : airports) {
			
			list = list + count +". "+ airportList;
			count++;
		}
		System.out.println(list);
	} 
	
	public static Airport selectAirport(int airportId) {

		for(Airport airportList : airports) {
			
			if(airportList.getAirportId()==airportId)
					return airportList;
		}
		return null;
	} 

}
