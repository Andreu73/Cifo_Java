package Database;

import java.util.ArrayList;

import Model.Bird;
import Model.Person;

public class BirdDatabasePreFilling {
	
	public static ArrayList<Bird> birds = new ArrayList<Bird>();
	public static ArrayList<Person> people = new ArrayList<Person>();
	
	public static void preAddBirdToDatabase() {
		
		people.add(new Person("Peter", "USA", "NY University"));
		people.add(new Person("Paul", "Ireland", "University of Dublin"));
		people.add(new Person("Mary", "USA", "UCLA"));
		people.add(new Person("Anne", "NZ", "University of Auckland"));
		
		PersonDatabase.setPeople(people);
	
		birds.add(new Bird("Raven", "Corvus", people.get(0)));
		birds.add(new Bird("Eagle", "Aquila", people.get(1)));
		birds.add(new Bird("Pelican", "Pelicanus", people.get(2)));
		
		BirdDatabase.setBirds(birds);
		
		
	}

}
