package utils;

import java.util.Scanner;

public class UtilsIOPet {
	
	public static String askForPetName(Scanner input) {
		
		System.out.println("Pet's name:");
		String name = input.next();
		return name;
		
	}
	
	public static String askForPetKindOfAnimal(Scanner input) {
		
		System.out.println("Pet kind of animal:");
		String kind = input.next();
		return kind;
		
	}
	
	public static int askForPetAge(Scanner input) {
		
		int age=0;
		try {
		System.out.println("Pet's age:");
		    age = Integer.parseInt(input.next());
		}catch(Exception e) {
		    System.out.println("Type a number, please");
		}
		return age;
		
	}

}
