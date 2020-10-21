package app;

import java.util.Scanner;

import model.AirCompany;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;
import utilsdb.AirCompanyPreFillingDb;
import utilsdb.AirplanePreFillingDb;
import utilsdb.AirportPreFillingDb;
import utilsdb.FlightPreFillingDb;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AirportDb airportDb = new AirportDb("Airport Database");
		AirplaneDb airplaneDb = new AirplaneDb("Airplane Database");
		AirCompany airCompanyDb = new AirCompany("AirCompany Database");
		FlightDb flightDb = new FlightDb("Flight Database");
		
		AirportPreFillingDb.preFillingAirportsToDb();
		AirplanePreFillingDb.preFillingAirplanesToDb();
		AirCompanyPreFillingDb.preFillingAirCompaniesToDb();
		FlightPreFillingDb.preFillingFlightsToDb();
		
		View view = new View();
		view.start(input, airportDb, airplaneDb, airCompanyDb, flightDb);

	}

}
