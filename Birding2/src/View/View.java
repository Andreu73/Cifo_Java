package View;

import java.util.HashMap;
import java.util.Scanner;

import Controller.Controller;
import Database.BirdDatabase;
import Model.Bird;
import Utils.UtilsIO;

public class View {
	
	public static int ask(Scanner input) {    

		int optionSelected = 0;
        
		while(true) {
			try {	
					
				optionSelected = Integer.parseInt(input.nextLine());
				return optionSelected;
				
			}catch(Exception e){
				System.out.println("\nType a number please:");
			}
		}

	}
	
	public void start(BirdDatabase birds) {

		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> numberOfOptions = new HashMap<Integer, String>();
		numberOfOptions.put(1, "Add");
		numberOfOptions.put(2, "Observation");
		numberOfOptions.put(3, "Show");
		numberOfOptions.put(4, "Statistics");
		numberOfOptions.put(5, "Quit");

		while (true) {
			
				View.optionsValues(numberOfOptions);
			
				int command = ask(scanner);
			
		        if (command==1) {
		        	add(scanner, birds);
		        } else if (command==2) {
		        	observation(scanner, birds);
		        } else if (command==3) {
		        	show(scanner, birds);
		        } else if (command==4) {
		        	statistics(birds);
		        } else if (command==5) {
		        	break;
		        } else {
		            System.out.println("Unknown command!");
		        }

	    }		
		
	}
	
	public static void optionsValues(HashMap<Integer, String> numberOfOptions) {

		System.out.println("------------------");
		for (int i = 1; i < numberOfOptions.size(); i++) {
			
	        System.out.println((i) + ". " + numberOfOptions.get(i));
			
		}
		System.out.println("--------------------");
        System.out.println("Select an option: ");
	}

	public static void statistics(BirdDatabase birds) {
		
		Controller.statistics(birds);
	}
	
	public static void show(Scanner scanner, BirdDatabase birds) {
		
		System.out.println("What to show?");
		String birdToShow = scanner.nextLine();
		
		Controller.showBird(birdToShow, birds);
		
	}
	
	public static void observation(Scanner scanner, BirdDatabase birds) {
		
		System.out.println("What was observed?");
		String birdObserved = scanner.next();
		
		Controller.checkBirds(birdObserved, birds);
		
	}
	
	public static void add(Scanner scanner, BirdDatabase birds) {	

		Bird newBird = UtilsIO.createANewBird(scanner);
		
		Controller.addBirdToDB(newBird, birds);
		
	}

}
