package utilsdb;

import java.util.ArrayList;

import model.Airport;
import service.AirportDb;

public class AirportPreFillingDb {

	public static void preFillingAirportsToDb() {
		
		ArrayList<Airport> airports = new ArrayList<>();
		
		airports.add(new Airport("Barcelona", "BCN"));
		airports.add(new Airport("Griona", "GIR"));
		airports.add(new Airport("Paris", "PAR"));
		airports.add(new Airport("NY", "JFK"));
		airports.add(new Airport("Chicago", "CHI"));
		airports.add(new Airport("Roma", "ROM"));
		airports.add(new Airport("Amsterdam", "AMS"));
		airports.add(new Airport("Dublin", "DUB"));
		
		AirportDb.setAirports(airports);
		
	}
	
}
