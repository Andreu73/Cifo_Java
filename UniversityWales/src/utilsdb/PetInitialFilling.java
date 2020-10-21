package utilsdb;

import java.util.ArrayList;

import model.Pet;
import service.PetDb;

public class PetInitialFilling {

	public static void petDbPreFilling() {
		
		ArrayList<Pet> pets = new ArrayList<>();
		pets.add(new Pet("Bobby", "Dog", 3));
		pets.add(new Pet("Misha", "Cat", 3));
		pets.add(new Pet("Birdie", "Canary", 3));
		PetDb.setPets(pets);
		
	}
	
}
