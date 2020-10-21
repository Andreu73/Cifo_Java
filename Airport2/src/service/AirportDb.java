package service;

import java.util.ArrayList;

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
	
	

}
