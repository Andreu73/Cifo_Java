package birding;

import java.util.ArrayList;

public class BirdDatabase {
	
	private String name;
	private ArrayList<Bird> birds ;
	
	public BirdDatabase(String name) {
		
		this.name = name;
		this.birds = new ArrayList<Bird>();
	}
	
	public void addBirdAndDiscovererToDB(String nameofthebird, String latinnameofthebird, Person discoverer) {
			
		birds.add(new Bird(nameofthebird, latinnameofthebird, discoverer));
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
