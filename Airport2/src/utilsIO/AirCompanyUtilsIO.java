package utilsIO;

import java.util.Scanner;

public class AirCompanyUtilsIO {

	public static String askForAirCompanyCode(Scanner input) {
		
		System.out.println("Code of the air company:");
		String codeOfTheAirCompany = input.next();
		return codeOfTheAirCompany;
	}
}
