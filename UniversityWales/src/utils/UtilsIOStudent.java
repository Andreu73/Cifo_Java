package utils;

import java.util.Scanner;

import model.Apartment;

public class UtilsIOStudent {
	
    public static int askForCourseYear(Scanner input) {
    	
    	int courseYear = 0;
    	try {
    	System.out.println("Course year:");
    	    courseYear = Integer.parseInt(input.next());
    	}catch(Exception e) {
    		System.out.println("Type a number, please!");
    	}
        return courseYear;
    	
    }
    
//    public static Apartment askForApartment() {
//    	
//
//    }
//
//    public static Apartment askForPet() {
//    	
//
//    }
}
