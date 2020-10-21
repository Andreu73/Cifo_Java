package utils;

import java.util.Scanner;

public class UtilsIOApartment {
	
	public static int executeTryCatch(Scanner input) {
		
		int numberGiven = 0;
		while(true) {
			try {
				
				numberGiven = Integer.parseInt(input.next());
				return numberGiven;
				
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}

		}

	}
	
	public static String askForBlockName(Scanner input) {
	
		System.out.println("Name of the Block:");
		String nameOfTheBlock = input.next();
		return nameOfTheBlock;
		
	}

    public static int askForApartmentNumber(Scanner input) {
    	
   	    System.out.println("Course year:");
    	int apartmentNumber = executeTryCatch(input);
   	    return apartmentNumber;
    	
    }
	
    public static int askForRoomNumber(Scanner input) {
    	
    	System.out.println("Number of rooms:");
    	int roomNumber = executeTryCatch(input);
        return roomNumber;
    	
    }
    
    public static int askForRoomPlaces(Scanner input) {
    	
    	System.out.println("Places in the room:");
    	int roomPlaces = executeTryCatch(input);
        return roomPlaces;
    	
    }
}
