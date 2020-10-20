package View;

import java.util.HashMap;
import java.util.Scanner;

import Controller.Controller;
import Database.BirdDatabase;
import Database.PersonDatabase;
import Utils.UtilsIO;

public class View {
	
	public static int ask(Scanner input) {    

		int optionSelected = 0;
        
		while(true) {
			try {	
					
				optionSelected = Integer.parseInt(input.next());
				return optionSelected;
				
			}catch(Exception e){
				System.out.println("\nType a number please:");
			}
		}

	}
	
	public void start(BirdDatabase birds, PersonDatabase people) {

		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> numberOfOptions = new HashMap<Integer, String>();
		numberOfOptions.put(1, "Add Bird");
		numberOfOptions.put(2, "Add Watcher");
		numberOfOptions.put(3, "Observation");
		numberOfOptions.put(4, "Show");
		numberOfOptions.put(5, "Statistics");
		numberOfOptions.put(6, "Quit");

		while (true) {
			
				View.optionsValues(numberOfOptions);
			
				int command = ask(scanner);

		        if (command==1) {
		        	add(scanner, birds);
		        } else if (command==2) {
		        	addWatcher(scanner, people);
		        } else if (command==3) {
		        	observation(scanner, birds, people);
		        } else if (command==4) {
		        	show(scanner, birds);
		        } else if (command==5) {
		        	statistics(birds);
		        } else if (command==6) {
		        	break;
		        } else {
		            System.out.println("Unknown command!");
		        }

	    }		
		
	}
	
	public static void optionsValues(HashMap<Integer, String> numberOfOptions) {

		System.out.println("------------------");
		for(Integer numbers : numberOfOptions.keySet()) {
			
			System.out.println((numbers) + ". " + numberOfOptions.get(numbers));
			
		}
		System.out.println("--------------------");
        System.out.println("Select an option: ");
		
	}

	public static void statistics(BirdDatabase birds) {
		
		Controller.statistics(birds);
	}
	
	public static void show(Scanner scanner, BirdDatabase birds) {
		
		Controller.showBird(UtilsIO.whatToShow(scanner), birds);
		
	}
	
	public static void observation(Scanner scanner, BirdDatabase birds, PersonDatabase people) {
		
		Controller.checkBirds(UtilsIO.askForBirdWatched(scanner), UtilsIO.askForPersonWhoWatchedIt(scanner), birds, people);
		
	}
	
	public static void add(Scanner scanner, BirdDatabase birds) {	
		
		Controller.addBirdToDB(UtilsIO.createNewBird(scanner), birds);
		
	}

	public static void addWatcher(Scanner scanner, PersonDatabase people) {	
		
		Controller.addWatcherToDB(UtilsIO.createNewPerson(scanner), people);
		
	}
	
}
