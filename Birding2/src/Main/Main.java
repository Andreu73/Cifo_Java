package Main;

import Database.BirdDatabase;
import Database.BirdDatabasePreFilling;
import Database.PersonDatabase;
import View.View;

public class Main {

	public static void main(String[] args) {
		
		BirdDatabase birds = new BirdDatabase("Birds DB");
		PersonDatabase people = new PersonDatabase("People DB");
		
		BirdDatabasePreFilling.preAddBirdToDatabase();
		View.start(birds, people);

	}
}
