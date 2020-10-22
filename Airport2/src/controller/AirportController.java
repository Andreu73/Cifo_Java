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
}
