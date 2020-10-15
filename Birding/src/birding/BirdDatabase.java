package birding;

import java.util.ArrayList;

public class BirdDatabase {
	
	private ArrayList<Bird> birds ;
	
	public BirdDatabase() {
		
		this.birds = new ArrayList<Bird>();
	}
	
	public void addBirdToDatabase(String birdname, String latinname) {
			
		birds.add(new Bird(birdname, latinname));
	}
	
	
	public Bird showBirds(String birdname) {
		
		for(Bird birdToShow : birds) {
			
			if(birdToShow.getName().equals(birdname))
				return birdToShow;
		}
		System.out.println("Is not a bird!");
		return null;
		
	}
	
	public void getStatistics() {
		
		for(Bird allbirds : birds) {
			
			System.out.println(allbirds);
		}

	}

}
