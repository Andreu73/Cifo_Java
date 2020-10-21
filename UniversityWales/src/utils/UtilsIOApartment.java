package utils;

import java.util.Scanner;

public class UtilsIOApartment {
	
	public static String askForBlockName(Scanner input) {
	
		System.out.println("Name of the Block:");
		String nameOfTheBlock = input.next();
		return nameOfTheBlock;
		
	}

    public static int askForApartmentNumber(Scanner input) {
    	
    	int apartmentNumber = 0;
    	try {
    	System.out.println("Course year:");
    	    apartmentNumber = Integer.parseInt(input.next());
    	}catch(Exception e) {
    		System.out.println("Type a number, please!");
    	}
        return apartmentNumber;
    	
    }
	
    public static int askForRoomNumber(Scanner input) {
    	
    	int roomNumber = 0;
    	try {
    	System.out.println("Number of rooms:");
    	    roomNumber = Integer.parseInt(input.next());
    	}catch(Exception e) {
    		System.out.println("Type a number, please!");
    	}
        return roomNumber;
    	
    }
    
    public static int askForRoomPlaces(Scanner input) {
    	
    	int roomPlaces = 0;
    	try {
    	System.out.println("Places in the room:");
    	    roomPlaces = Integer.parseInt(input.next());
    	}catch(Exception e) {
    		System.out.println("Type a number, please!");
    	}
        return roomPlaces;
    	
    }
}
