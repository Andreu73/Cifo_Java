package utilsdb;

import java.util.ArrayList;

import model.Airport;
import model.Flight;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class FlightPreFillingDb {
	
	public static void preFillingFlightsToDb() {
		
		ArrayList<Flight> flights = new ArrayList<>();
		
		flights.add(new Flight(AirplaneDb.airplanes.get(0), AirportDb.airports.get(0), AirportDb.airports.get(7)));
		flights.add(new Flight(AirplaneDb.airplanes.get(1), AirportDb.airports.get(1), AirportDb.airports.get(6)));
		flights.add(new Flight(AirplaneDb.airplanes.get(1), AirportDb.airports.get(2), AirportDb.airports.get(5)));
		flights.add(new Flight(AirplaneDb.airplanes.get(2), AirportDb.airports.get(7), AirportDb.airports.get(4)));
		flights.add(new Flight(AirplaneDb.airplanes.get(2), AirportDb.airports.get(7), AirportDb.airports.get(3)));
		flights.add(new Flight(AirplaneDb.airplanes.get(3), AirportDb.airports.get(4), AirportDb.airports.get(2)));
		flights.add(new Flight(AirplaneDb.airplanes.get(4), AirportDb.airports.get(5), AirportDb.airports.get(1)));
		flights.add(new Flight(AirplaneDb.airplanes.get(5), AirportDb.airports.get(6), AirportDb.airports.get(0)));
		
		FlightDb.setFlights(flights);
	}

}
