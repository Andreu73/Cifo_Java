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
		
	public static void addAirplaneToDb(Scanner input) {

		int numberOfPassengers =0;
		double airplaneLoad = 0.00d;
		
		AirCompanyDb.listOfAirCompanies();
		
		System.out.println("Select a number:");
		int optionSelected = input.nextInt();
		
		String companySelected = AirCompanyDb.aircompanies.get(optionSelected).getAirCompanyName();
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

}
