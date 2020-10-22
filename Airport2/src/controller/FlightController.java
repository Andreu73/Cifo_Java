package controller;

import java.util.Scanner;

import model.Airplane;
import model.Airport;
import model.Flight;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class FlightController {
	
	public static int selectANumberTryCatch(Scanner input) {
		
		int optionSelected = 0;	
		while(true) {
			try {
				System.out.println("Select a number:");
				optionSelected = Integer.parseInt(input.next());
				return optionSelected;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}

		}

	}
	
	public static void addFlightToDb(Scanner input) {
		
		AirplaneDb.listOfAirplanes();
		
		int airplaneSelected = AirplaneDb.airplanes.get(selectANumberTryCatch(input)-1).getIdNumber();
		Airplane airplane = AirplaneDb.selectAirplane(airplaneSelected);
		
		AirportDb.listOfAirports();
		
		System.out.println("Origin airport:");
		int airportSelected = AirportDb.airports.get(selectANumberTryCatch(input)-1).getAirportId();
		Airport airportOrigin = AirportDb.selectAirport(airportSelected);		

		AirportDb.listOfAirports();
		
		System.out.println("Destination airport:");		
		int airportSelected2 = AirportDb.airports.get(selectANumberTryCatch(input)-1).getAirportId();
		Airport airportDestination = AirportDb.selectAirport(airportSelected2);
		
		Flight newFlight = new Flight(airplane, airportOrigin, airportDestination);
		FlightDb.addFlightToDb(newFlight);
		
		System.out.println("Flight added!");
		
	}
	
	public static void selectFlight(Scanner input) {
		
		FlightDb.listOfFlights();
		System.out.println("Select a number:");
		int optionSelected1 = input.nextInt();
		
		int flightSelected = FlightDb.flights.get(optionSelected1-1).flightCodeNumber;
		Flight flight = FlightDb.selectFlight(flightSelected);
		System.out.println(flight);
	}

}
