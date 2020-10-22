package utilsIO;

import java.util.Scanner;

public class AirplaneUtilsIO {
	
	public static int askForKindOfPlane(Scanner input) {
		
		int option =0;
		while(option!=1 && option!=2) {
			try {
				System.out.println("---------------------");
				System.out.println("1. Passenger airplane");
				System.out.println("2. Cargo airplnae");
				System.out.println("---------------------");
				System.out.println("Select an option:");
				option = Integer.parseInt(input.next());
	
			}catch(Exception e) {
				System.out.println("Type 1 or 2, please!");
			}
		}
		return option;

	}
	
	public static int askForNumberOfPassengers(Scanner input) {
		
		int numberOfPassengers =0;
		while(true) {
			try {
			System.out.println("Number of passengers:");
			numberOfPassengers = Integer.parseInt(input.next());
			return numberOfPassengers;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}
		}

	}
	
	public static double askForAirplaneLoad(Scanner input) {
		
		double loadOfTheAirplane =0;
		while(true) {
			try {
			System.out.println("Load of the airplane:");
			loadOfTheAirplane = Double.parseDouble(input.next());
			return loadOfTheAirplane;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}
		}
	}
}
