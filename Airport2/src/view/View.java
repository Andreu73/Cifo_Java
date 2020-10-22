package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.AirCompanyController;
import controller.AirplaneController;
import controller.AirportController;
import controller.DataController;
import controller.FlightController;
import model.AirCompany;
import service.AirplaneDb;
import service.AirportDb;
import service.FlightDb;

public class View {
	
	public void start(Scanner input) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add airplane");
		options.put(2, "Add air company");
		options.put(3, "Add airport");
		options.put(4, "Add flight");		
		options.put(5, "Show data");
		options.put(6, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				addAirplane(input);
			}else if(option==2) {
				addAirCompany(input);
			}else if(option==3) {
				addAirport(input);
			}else if(option==4) {
				addFlight(input);
			}else if(option==5) {
				selectData(input);
			}else if(option==6) {
				System.out.println("Menu off!");
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
		
	public static void selectData(Scanner input) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Select airplane");
		options.put(2, "Select airport");
		options.put(3, "Select flight");
		options.put(4, "Show all data");
		options.put(5, "Back");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				selectAirplane(input);
			}else if(option==2) {
				selectAirport(input);
			}else if(option==3) {
				selectFlight(input);
			}else if(option==4) {
				showData(input);
			}else if(option==5) {
				break;
			}
		}
	}
	
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
	public static void showData(Scanner input) {
		
		DataController.showAllData();
	}
	public static void selectAirplane(Scanner input) {
		
		AirplaneController.selectAirplane(input);
	}
	public static void selectAirport(Scanner input) {
		
		AirportController.selectAirport(input);
	}	
	public static void selectFlight(Scanner input) {
		
		FlightController.selectFlight(input);
	}	
}
