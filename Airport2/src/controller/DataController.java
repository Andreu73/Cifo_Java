package controller;

import service.AirCompanyDb;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class DataController {
	
	public static void showAllData() {
		
		AirportDb.listOfAirports();
		AirCompanyDb.listOfAirCompanies();
		AirplaneDb.listOfAirplanes();
		FlightDb.listOfFlights();
		
	}

}
