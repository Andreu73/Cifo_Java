package utilsIO;

import java.util.Scanner;

public class BookUtilsIO {
	
	public static String askForBookName(Scanner input) {
		
		System.out.println("Name of the book:");
		String nameOfTheBook = input.next();
		return nameOfTheBook;
	}
	
	public static String askForBookAuthor(Scanner input) {
		
		System.out.println("Name of the author:");
		String nameOfTheAuthor = input.next();
		return nameOfTheAuthor;
	}
	
	public static int askForBookYear(Scanner input) {
		
		int yearOfTheBook =0;
		while(true) {
			try {
			System.out.println("Year of the book:");
			yearOfTheBook = Integer.parseInt(input.next());
			return yearOfTheBook;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}
		}

	}

	public static String askForBookPublisher(Scanner input) {
		
		System.out.println("Name of the publisher:");
		String nameOfThePublisher = input.next();
		return nameOfThePublisher;
	}
	
	public static double askForBookCost(Scanner input) {
		
		double costOfTheBook =0.0d;
		while(true) {
			try {
			System.out.println("Cost of the book:");
			costOfTheBook = Double.parseDouble(input.next());
			return costOfTheBook;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}
		}

	}
}
