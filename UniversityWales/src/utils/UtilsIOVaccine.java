package utils;

import java.util.Scanner;

import model.Date;

public class UtilsIOVaccine {
	
	public static String askForVaccineDay(Scanner input) {
		
		System.out.println("Vaccine day:");
		Date vaccineDayGiven = new Date(input.next());
		String vaccineDay = vaccineDayGiven.formatDate();
		return vaccineDay;
		
	}
	
	public static String askForKindOfVaccine(Scanner input) {
		
		System.out.println("Kind of vaccine:");
		String kindOfVaccine= input.next();
		return kindOfVaccine;
		
	}
	
	public static String askForVaccineResult(Scanner input) {
		
		System.out.println("Vaccine result:");
		String vaccineResult= input.next();
		return vaccineResult;
		
	}
}
