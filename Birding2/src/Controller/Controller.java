package Controller;

import Database.BirdDatabase;
import Database.PersonDatabase;
import Model.Bird;
import Model.Person;

public class Controller {
	
	public static void addBirdToDB(Bird bird, BirdDatabase birds) {    

		birds.addBirdToDB(bird);
	}

	public static void addWatcherToDB(Person person, PersonDatabase people) {    

		people.addWatcherToDB(person);
	}
	
	public static Bird checkBirds(String birdobserved, BirdDatabase birds) {  
	
		Bird birdFound = birds.showBird(birdobserved);
		if(birdFound==null)
			System.out.println("not a bird");
		return birdFound;
	}
	
	public static Person checkPeople(String personwhowatchedit, PersonDatabase people) {  
		
		Person personFound = people.showPerson(personwhowatchedit);
		if(personFound==null)
			System.out.println("not a person");
		return personFound;
}
	
	public static void showBird(String birdToShow, BirdDatabase birds) {  
		
		System.out.println(birds.showBird(birdToShow));
		
	}
	
	public static void statistics(BirdDatabase birds) {  
	
		birds.getStatistics();
		System.out.println();
		System.out.println(PersonDatabase.listOfPeople());
	}

}
