package birding;

import java.util.Scanner;

public class Controller {
	
	public static void add(Scanner input, BirdDatabase birds) {    
		
		System.out.print("Add bird to Database->\nName: ");
		String birdname = input.next();
		System.out.print("Latin name: ");
		String latinname = input.next();
		System.out.println("Who discovered it?");
		String nameOfThePerson = input.next();
		
		Bird newBird = new Bird(birdname, latinname);
		birds.addBirdAndDiscovererToDB(newBird);
		
		Person newDiscoverer = new Person(nameOfThePerson);
		newBird.addDiscovererToTheObservation(newDiscoverer);
		
	
	}
	
	public static void observation(Scanner input, BirdDatabase birds) {  
	
		System.out.println("What was observed?");
		String birdObserved = input.next();
		
		Bird bird = birds.showBirds(birdObserved);
		if(bird!=null)
			bird.addObservations();
	
	}
	
	public static void show(Scanner input, BirdDatabase birds) {  
		
		System.out.println("What?");
		String birdToShow = input.next();
		
		System.out.println(db.showBirds(birdToShow));
	}
	
	public static void statistics(Scanner input, BirdDatabase birds) {  
	
		db.getStatistics();
	}

}
