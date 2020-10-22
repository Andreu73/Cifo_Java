package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.AirCompanyController;
import controller.AirplaneController;
import controller.AirportController;
import controller.FlightController;
import model.AirCompany;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class View {
	
	public void start(Scanner input, AirportDb airportDb, AirplaneDb airplaneDb, 
			AirCompany airCompanyDb, FlightDb flightDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add airplane");
		options.put(2, "Add air company");
		options.put(3, "Add airport");
		options.put(4, "Add flight");		
		options.put(5, "Show data");
		options.put(6, "Select flight");
		options.put(7, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				addAirplane(input);
				break;
			}else if(option==2) {
				addAirCompany(input);
				break;
			}else if(option==3) {
				addAirport(input);
				break;
			}else if(option==4) {
				addFlight(input);
				break;
//			}else if(option==5) {
//				showData(input, flightDb);
//				break;
//			}else if(option==6) {
//				selectFlight(input, flightDb, airportDb);
//				break;
			}else if(option==7) {
				break;
			}
		}
	}
	
	public static int askOption(Scanner input) {
		
		int option = 0;		
		try {
			System.out.println("Select an option:");
			option = Integer.parseInt(input.next());
		}catch(Exception e) {
			System.out.println("Type a number!");
		}
		return option;
	}
	
	public static void showOptionsMenu(HashMap<Integer,String> options) {
		
		System.out.println("---------------------");
		for(Integer option : options.keySet()) {
			
			System.out.println(option + " " + options.get(option));
		}
		System.out.println("---------------------");
	}
		
//	public static void selectFlight(Scanner input, FlightDb flightDb, AirportDb airportDb, AirplaneDb airplaneDb) {
//		
//		HashMap<Integer,String> options = new HashMap<>();
//		options.put(1, "Select airplane");
//		options.put(2, "Select origin airport");
//		options.put(3, "Select destination airport");
//		options.put(4, "Show flights");
//		options.put(5, "Back");
//		
//		while(true) {
//			
//			showOptionsMenu(options);
//			
//			int option = askOption(input);
//			
//			if(option==1) {
//				selectAirplane(input, airplaneDb);
//				break;
//			}else if(option==2) {
//				selectOriginAirport(input, airportDb);
//				break;
//			}else if(option==3) {
//				selectDestinationAirport(input, airportDb);
//				break;
//			}else if(option==4) {
//				showFlights(input, flightDb);
//				break;
//			}else if(option==5) {
//				break;
//			}
//		}
//	}
	
	public static void addAirport(Scanner input) {
		
		AirportController.addAirportToDb(input);
	}
	public static void addAirplane(Scanner input) {
		
		AirplaneController.addAirplaneToDb(input);
	}
	public static void addAirCompany(Scanner input) {
		
		AirCompanyController.addAirCompanyToDb(input);
	}
	public static void addFlight(Scanner input) {
		
		FlightController.addFlightToDb(input);
	}
}
