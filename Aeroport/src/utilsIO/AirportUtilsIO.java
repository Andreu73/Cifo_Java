package utilsIO;

import java.util.Scanner;

public class AirportUtilsIO {
	
	public static String askForAirportCity(Scanner input) {
		
		System.out.println("City of the airport:");
		String cityOfTheAirport = input.next();
		return cityOfTheAirport;
	}
	
	public static String askForAirportCode(Scanner input) {
		
		System.out.println("Code of the airport:");
		String airportCode = input.next();
		return airportCode;
	}

}
