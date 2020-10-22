package controller;

import java.util.Scanner;

import model.AirCompany;
import service.AirCompanyDb;
import utilsIO.AirCompanyUtilsIO;

public class AirCompanyController {
	
	public static void addAirCompanyToDb(Scanner input) {
		
		String airCompanyCode = AirCompanyUtilsIO.askForAirCompanyCode(input);
		AirCompany newAirCompany = new AirCompany(airCompanyCode);
		AirCompanyDb.addAirCompanyToDb(newAirCompany);
		
	}

}
