package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Database.BirdDatabase;
import Model.Bird;
import Model.Person;
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
		ArrayList<String> numberOfOptions = new ArrayList<String>();
		numberOfOptions.add("1. Add");
		numberOfOptions.add("2. Observation");
		numberOfOptions.add("3. Show");
		numberOfOptions.add("4. Statistics");
		numberOfOptions.add("5. Add");
		numberOfOptions.add("6. Quit");

		while (true) {
			
				View.optionsValues(numberOfOptions);
			
				int command = ask(scanner);
			
		        if (command==numberOfOptions.indexOf(numberOfOptions.get(0))){
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
	
	public static void optionsValues(ArrayList<String> numberOfOptions) {
		
		System.out.println("------------------");
		
		for (int i = 0; i < numberOfOptions.size(); i++) {
			
	        System.out.println(numberOfOptions.get(i));
			
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

		Bird newBird = UtilsIO.askForBirdAttributes(scanner);
		
		Controller.addBirdToDB(newBird, birds);
		
	}

}
