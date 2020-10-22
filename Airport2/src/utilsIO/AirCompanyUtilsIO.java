package utilsIO;

import java.util.Scanner;

public class AirCompanyUtilsIO {

	public static String askForAirCompanyCode(Scanner input) {
		
		System.out.println("Name of the air company:");
		String nameOfTheAirCompany = input.next();
		return nameOfTheAirCompany;
	}
}
