package Utils;

import java.util.Scanner;

import Model.Bird;
import Model.Person;

public class UtilsIO {
	
	public static String askForBirdName(Scanner scanner) {
		
		System.out.print("Add bird to Database->\nName: ");
		String birdname = scanner.next();
		return birdname;
	}
		
	public static String askForBirdLatinName(Scanner scanner) {
		
		System.out.print("Latin name: ");
		String latinname = scanner.next();
		return latinname;
		
	}
	
	public static String askForPersonName(Scanner scanner) {
		
		System.out.print("Who watched it?");
		String nameOfThePerson = scanner.next();
		return nameOfThePerson;
		
	}
	
	public static String askForPersonCountry(Scanner scanner) {
		
		System.out.print("Where was he/she from?");
		String countryOfOrigin = scanner.next();
		return countryOfOrigin;
		
	}

	public static String askForPersonUniversity(Scanner scanner) {
		
		System.out.print("Which university was he/she from?");
		String universityOfThePerson = scanner.next();
		return universityOfThePerson;
		
	}
	
	public static Person createANewPerson(Scanner scanner) {
		
		Person newPerson = new Person(askForPersonName(scanner), askForPersonCountry(scanner), askForPersonUniversity(scanner));
		return newPerson;
		
	}
	
	public static Bird createANewBird(Scanner scanner) {
		
		Bird newBird = new Bird(askForBirdName(scanner), askForBirdLatinName(scanner), createANewPerson(scanner));
		return newBird;
		
	}
	
}
