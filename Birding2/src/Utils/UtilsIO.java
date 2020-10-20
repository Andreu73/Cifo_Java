package Utils;

import java.util.Scanner;

import Database.BirdDatabase;
import Database.PersonDatabase;
import Model.Bird;
import Model.Person;

public class UtilsIO {
	
	public static String askForBirdName(Scanner scanner) {
		
		System.out.println("Add bird to Database->\nName: ");
		String birdname = scanner.next();
		return birdname;
	}
		
	public static String askForBirdLatinName(Scanner scanner) {
		
		System.out.println("Latin name: ");
		String latinname = scanner.next();
		return latinname;
		
	}
	
	public static String askForPersonWhoWatchedIt(Scanner scanner, PersonDatabase people) {
		
		System.out.println("Name of the watcher?");
		String nameOfThePerson = scanner.next();
		if(people.showPerson(nameOfThePerson)==null)
			System.out.println("Not found in DataBase!");
		return nameOfThePerson;
		
	}
	
	public static String askForPersonCountry(Scanner scanner) {
		
		System.out.println("Where was he/she from?");
		String countryOfOrigin = scanner.next();
		return countryOfOrigin;
		
	}

	public static String askForPersonUniversity(Scanner scanner) {
		
		System.out.println("Which university was he/she from?");
		String universityOfThePerson = scanner.next();
		return universityOfThePerson;
		
	}
	
	public static String askForBirdWatched(Scanner scanner, BirdDatabase birds) {
		
		System.out.println("What was observed?");
		String birdObserved = scanner.next();
		if(birds.showBird(birdObserved)==null)
			System.out.println("Is not a bird!");
		return birdObserved;		
	}
	
	public static String whatToShow(Scanner scanner) {
		
		System.out.println("What to show?");
		String birdToShow = scanner.next();
		return birdToShow;
	}
	
	public static Person createNewPerson(Scanner scanner, PersonDatabase people) {

		Person newPerson = new Person(askForPersonWhoWatchedIt(scanner, people), askForPersonCountry(scanner), askForPersonUniversity(scanner));
		return newPerson;
		
	}
	
	public static Bird createNewBird(Scanner scanner) {
		
		Bird newBird = new Bird(askForBirdName(scanner), askForBirdLatinName(scanner));
		return newBird;
		
	}
	
}
