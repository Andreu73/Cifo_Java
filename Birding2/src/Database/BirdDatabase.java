package Database;

import java.util.ArrayList;

import Model.Bird;

public class BirdDatabase {
	
	private String name;
	private static ArrayList<Bird> birds;
	
	public BirdDatabase(String name) {
		
		this.name = name;
		birds = new ArrayList<Bird>();
	}

	public void addBirdToDB(Bird bird) {
		
		birds.add(bird);
	}
		
	public static void setBirds(ArrayList<Bird> birds) {
		
		BirdDatabase.birds = birds;
	}

	public Bird showBird(String birdname) {
		
		for(Bird birdToShow : birds) {
			
			if(birdToShow.getName().equals(birdname))
				return birdToShow;
		}
		return null;
		
	}
	
	public void getStatistics() {
		System.out.println("Birds:");
		for(Bird allbirds : birds) {
			
			System.out.println(allbirds);
		}

	}

}
