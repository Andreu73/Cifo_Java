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
	
	public static void checkBirds(String birdobserved, String personwhowatchedit, BirdDatabase birds, PersonDatabase people) {  
	
		Person personFound = people.showPerson(personwhowatchedit);
		Bird birdFound = birds.showBird(birdobserved);
		
		if(birdFound!= null && personFound!= null)
			birdFound.addObservation(birdFound, personFound);

	}
	
	public static void showBird(String birdToShow, BirdDatabase birds) {  
		
		System.out.println(birds.showBird(birdToShow));
		
	}
	
	public static void statistics(BirdDatabase birds) {  
	
		birds.getStatistics();
	}

}
