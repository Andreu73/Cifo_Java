package Controller;

import Model.Bird;
import birding.BirdDatabase;

public class Controller {
	
	public static void addBirdToDB(Bird bird, BirdDatabase birds) {    

		birds.addBirdAndDiscovererToDB(bird);
			
	}
	
	public static void checkBirds(String birdobserved, BirdDatabase birds) {  
	
		Bird birdFound = birds.showBird(birdobserved);
		birdFound.addObservation(birdFound);

	}
	
	public static void showBird(String birdToShow, BirdDatabase birds) {  
		
		birds.showBird(birdToShow);
		
	}
	
	public static void statistics(BirdDatabase birds) {  
	
		birds.getStatistics();
	}

}
