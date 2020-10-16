package birding;

import View.View;

public class Main {

	public static void main(String[] args) {
		
		BirdDatabase birds = new BirdDatabase("Birds DB");
		BirdDatabasePreFilling.preAddBirdToDatabase();
		
		View menu = new View();
		menu.start(birds);

	}
}
