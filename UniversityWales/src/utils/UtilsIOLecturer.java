package utils;

import java.util.Scanner;

public class UtilsIOLecturer {
	
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
	
	public static int askForOfficeNumber(Scanner input) {
	
		System.out.println("Number of the Office:");
	  	int officeNumber = executeTryCatch(input);
		return officeNumber;
		
	}

    public static int askForParkingLotNumber(Scanner input) {
    	
   	    System.out.println("Parking lot number:");
    	int parkingLotNumber = executeTryCatch(input);
   	    return parkingLotNumber;
    	
    }

}
