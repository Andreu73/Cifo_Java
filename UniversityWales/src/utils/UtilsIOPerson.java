package utils;

import java.util.Scanner;

import model.Date;

public class UtilsIOPerson {

	public static String askForPersonName(Scanner input) {
		
		System.out.println("Person's name:");
		String name = input.next();
		return name;
		
	}
	
	public static int askForPersonAge(Scanner input) {
		
		int age=0;
		try {
		System.out.println("Person's age:");
		    age = Integer.parseInt(input.next());
		}catch(Exception e) {
		    System.out.println("Type a number, please");
		}
		return age;
		
	}

	public static String askForPersonCountryOfOrigin(Scanner input) {
		
		System.out.println("Person's country of origin:");
		String name = input.next();
		return name;
		
	}
	
	public static String askForPersonBirthday(Scanner input) {
		
		System.out.println("Person's birthday (ddmmyyyy):");
		Date birthdayGiven = new Date(input.next());
		String birthday = birthdayGiven.formatDate();
		return birthday;
		
	}
	
}
