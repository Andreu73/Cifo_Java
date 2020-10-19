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
	
	public static String askForPersonWhoWatchedIt(Scanner scanner) {
		
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
	
	public static String askForBirdWatched(Scanner scanner) {
		
		System.out.println("What was observed?");
		String birdObserved = scanner.next();
		return birdObserved;
	}
	
	public static String whatToShow(Scanner scanner) {
		
		System.out.println("What to show?");
		String birdToShow = scanner.nextLine();
		return birdToShow;
	}
	
	public static Person createNewPerson(Scanner scanner) {
		
		Person newPerson = new Person(askForPersonWhoWatchedIt(scanner), askForPersonCountry(scanner), askForPersonUniversity(scanner));
		return newPerson;
		
	}
	
	public static Bird createNewBird(Scanner scanner) {
		
		Bird newBird = new Bird(askForBirdName(scanner), askForBirdLatinName(scanner));
		return newBird;
		
	}
	
}
