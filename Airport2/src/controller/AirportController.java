package controller;

import java.util.Scanner;

import model.Airport;
import service.AirportDb;
import utilsIO.AirportUtilsIO;

public class AirportController {

	public static void addAirportToDb(Scanner input) {
		
		String airportCity = AirportUtilsIO.askForAirportCity(input);
		String airportCode = AirportUtilsIO.askForAirportCode(input);
		Airport newAirport = new Airport(airportCity, airportCode);
		AirportDb.addAirportToDb(newAirport);
		
		System.out.println("Airport added!");
		
	}
	
	public static void selectAirport(Scanner input) {
		
		AirportDb.listOfAirports();
		System.out.println("Select a number:");
		int optionSelected1 = input.nextInt();
		
		int airportSelected = AirportDb.airports.get(optionSelected1-1).getAirportId();
		Airport airport = AirportDb.selectAirport(airportSelected);
		System.out.println(airport);
	}
}
