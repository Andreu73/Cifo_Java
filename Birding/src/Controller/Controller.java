package Controller;

import Model.Bird;
import birding.BirdDatabase;

public class Controller {
	
	public static void addBirdToDB(Bird bird, BirdDatabase birds) {    

		birds.addBirdAndDiscovererToDB(bird);
			
	}
	
	public static void checkBirds(String birdobserved, BirdDatabase birds) {  
	
		Bird birdFound = birds.showBird(birdobserved);
		if(birdFound!=null)
			birdFound.addObservation();
	
	}
	
	public static void showBird(String birdToShow, BirdDatabase birds) {  
		
		Bird bird = birds.showBird(birdToShow);
	}
	
	public static void statistics(BirdDatabase birds) {  
	
		birds.getStatistics();
	}

}
