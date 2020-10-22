package controller;

import java.util.Scanner;

import model.AirCompany;
import model.Airplane;
import service.AirCompanyDb;
import service.AirplaneDb;
import utilsIO.AirCompanyUtilsIO;
import utilsIO.AirplaneUtilsIO;

public class AirplaneController {
		
	public static void addAirplaneToDb(Scanner input) {
		
		String airplaneCode = AirplaneUtilsIO.askForNumberOfPassengers(input);
		Airplane newAirplane = new Airplane(airplaneCode);
		AirplaneDb.addAirplaneToDb(newAirplane);
		
	}

}
