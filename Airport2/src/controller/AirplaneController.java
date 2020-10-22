package controller;

import java.util.Scanner;

import model.AirCompany;
import model.Airplane;
import model.AirplanePassengers;
import model.AirplaneTransport;
import service.AirCompanyDb;
import service.AirplaneDb;
import utilsIO.AirCompanyUtilsIO;
import utilsIO.AirplaneUtilsIO;

public class AirplaneController {
	
	public static int selectANumberTryCatch(Scanner input) {
		
		int optionSelected = 0;	
		while(true) {
			try {
				System.out.println("Select a number:");
				optionSelected = Integer.parseInt(input.next());
				return optionSelected;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}

		}

	}
		
	public static void addAirplaneToDb(Scanner input) {

		int numberOfPassengers =0;
		double airplaneLoad = 0.00d;
		
		AirCompanyDb.listOfAirCompanies();
		
		String companySelected = AirCompanyDb.aircompanies.get(selectANumberTryCatch(input)-1).getAirCompanyName();
		AirCompany airCompany = AirCompanyDb.selectAirCompany(companySelected);

		if(AirplaneUtilsIO.askForKindOfPlane(input)==1) {
			numberOfPassengers = AirplaneUtilsIO.askForNumberOfPassengers(input);
			Airplane newAirplanePassengers = new AirplanePassengers(airCompany, numberOfPassengers);
			AirplaneDb.addAirplaneToDb(newAirplanePassengers);
			System.out.println("Passengers airplane added!");
		}
		else {
			airplaneLoad = AirplaneUtilsIO.askForAirplaneLoad(input);
			Airplane newAirplaneTransport = new AirplaneTransport(airCompany, airplaneLoad);
			AirplaneDb.addAirplaneToDb(newAirplaneTransport);
			System.out.println("Cargo airplane added!");
		}
	}

	public static void selectAirplane(Scanner input) {
		
		AirplaneDb.listOfAirplanes();
		
		System.out.println("Select a number:");
		
		int airplaneSelected = AirplaneDb.airplanes.get(selectANumberTryCatch(input)-1).getIdNumber();
		Airplane airplane = AirplaneDb.selectAirplane(airplaneSelected);
		System.out.println(airplane);
	}


}
