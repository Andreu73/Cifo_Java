package utilsIO;

import java.util.Scanner;

public class AirplaneUtilsIO {
	
	public static void askForKindOfPlane(Scanner input) {
		
		int option = 0;
		while(option!=1 || option!=2) {
		try {
			System.out.println("Passenger Airplane(1) or Cargo Plane(2):");
			option = Integer.parseInt(input.next());
		}catch(Exception e) {
			System.out.println("Type 1 or 2, please!");
		}
		if(option==1) {
//			askForAirCompany(input);
			askForNumberOfPassengers(input);}
		else
//			askForAirCompany(input);
			askForAirplaneLoad(input);
		}
	}
//
//	public static String askForAirCompany(Scanner input) {
//		
//		System.out.println("Company of the airplane:");
//		String airCompany = input.next();
//		return airCompany;
//	}
	
	public static String askForNumberOfPassengers(Scanner input) {
		
		System.out.println("Number of passengers:");
		String numberOfPassengers = input.next();
		return numberOfPassengers;
	}
	
	public static String askForAirplaneLoad(Scanner input) {
		
		System.out.println("Load of the airplane:");
		String loadOfTheAirplane = input.next();
		return loadOfTheAirplane;
	}
}
