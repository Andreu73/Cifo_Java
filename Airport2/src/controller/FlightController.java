package controller;

import java.util.Scanner;

import model.Airplane;
import model.Airport;
import model.Flight;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class FlightController {
	
	public static void addFlightToDb(Scanner input) {
		
		AirplaneDb.listOfAirplanes();
		
		System.out.println("Select a number:");
		int optionSelected1 = input.nextInt();
		
		int airplaneSelected = AirplaneDb.airplanes.get(optionSelected1).getIdNumber();
		Airplane airplane = AirplaneDb.selectAirplane(airplaneSelected);
		
		AirportDb.listOfAirports();
		
		System.out.println("Select a number for Origin:");
		int optionSelected2 = input.nextInt();
		
		int airportSelected = AirportDb.airports.get(optionSelected2).getAirportId();
		Airport airportOrigin = AirportDb.selectAirport(airportSelected);		

		AirportDb.listOfAirports();
		
		System.out.println("Select a number for Destination:");
		int optionSelected3 = input.nextInt();
		
		int airportSelected2 = AirportDb.airports.get(optionSelected3).getAirportId();
		Airport airportDestination = AirportDb.selectAirport(airportSelected2);
		
		Flight newFlight = new Flight(airplane, airportOrigin, airportDestination);
		FlightDb.addFlightToDb(newFlight);
		
		System.out.println("Flight added!");
		
	}

}
