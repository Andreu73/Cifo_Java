package Utils;

import java.util.Scanner;

import Model.Bird;
import Model.Person;

public class UtilsIO {
	
	public static Bird askForBirdAttributes(Scanner scanner) {
		
		System.out.print("Add bird to Database->\nName: ");
		String birdname = scanner.next();
		System.out.print("Latin name: ");
		String latinname = scanner.next();

		Bird newBird = new Bird(birdname, latinname, UtilsIO.askForPersonAttributes(scanner));
		
		return newBird;
	}
	
	public static Person askForPersonAttributes(Scanner scanner) {
		
		System.out.print("Who discovered it?");
		String nameOfThePerson = scanner.next();
		System.out.print("Where was he/she from?");
		String countryOfOrigin = scanner.next();
		System.out.print("Which university was he/she from?");
		String universityOfThePerson = scanner.next();

		Person watcher = new Person(nameOfThePerson, countryOfOrigin, universityOfThePerson);
		
		return watcher;
		
	}

}
