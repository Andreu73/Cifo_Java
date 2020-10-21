package service;

import java.util.ArrayList;

import model.Pet;
import model.Vaccine;

public class PetDb {
	
	public String name;
	public static ArrayList<Pet> pets;

	public PetDb(String name) {
		super();
		this.name = name;
	}

	public static void addPetToDb(Pet pet) {
		
		pets.add(pet);
	}
	
	public static void setPets(ArrayList<Pet> pets) {
		PetDb.pets = pets;
	}
	

}
