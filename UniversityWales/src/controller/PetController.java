package controller;

import java.util.Scanner;

import service.PetDb;
import utils.UtilsIOPet;

public class PetController {
	
	public static void addPetToDb(Scanner input, PetDb petDb) {
		
		String petName = UtilsIOPet.askForPetName(input);
		String petKinfOfAnimal = UtilsIOPet.askForPetKindOfAnimal(input);
		int petAge = UtilsIOPet.askForPetAge(input);
		
	}
	
	public static void listThePets() { 
		
	PetDb.listThePets();
	
	}

}
