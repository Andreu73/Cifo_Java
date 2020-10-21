package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.AirplaneController;
import controller.AirportController;
import model.AirCompany;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class View {
	
	public void start(Scanner input, AirportDb airportDb, AirplaneDb airplaneDb, 
			AirCompany airCompanyDb, FlightDb flightDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add flight");
		options.put(2, "Add airplane");
		options.put(3, "Add air company");
		options.put(4, "Add airport");
		options.put(5, "Show data");
		options.put(6, "Select flight");
		options.put(7, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				addFlight(input, flightDb);
				break;
			}else if(option==2) {
				addAirplane(input, airplaneDb);
				break;
			}else if(option==3) {
				addAirCompany(input, airCompanyDb);
				break;
			}else if(option==4) {
				addAirport(input, airportDb);
				break;
			}else if(option==5) {
				showData(input, flightDb);
				break;
			}else if(option==6) {
				selectFlight(input, flightDb);
				break;
			}else if(option==7) {
				break;
			}
		}
	}
	
	public int askOption(Scanner input) {
		
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
		
	public static void selectFlight(Scanner input, FlightDb flightDb) {
		
		
	}
	
	public static void addAirport(Scanner input) {
		
		AirportController.addAirportToDb(input);
	}
	public static void addAirplane(Scanner input) {
		
		AirplaneController.addAirplaneToDb(input);
	}
}
