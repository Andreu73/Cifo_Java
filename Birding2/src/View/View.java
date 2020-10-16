package View;

import java.util.Scanner;

import Controller.Controller;
import Model.Bird;
import Model.Person;
import birding.BirdDatabase;

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

		while (true) {
			
	        System.out.println("------------------");
	        System.out.println("1. Add            ");
	        System.out.println("2. Observation    ");
	        System.out.println("3. Show           ");
	        System.out.println("4. Statistics     ");
	    	System.out.println("5. Quit           ");
	        System.out.println("------------------");
	        System.out.println("Select an option: ");
        
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

	public static void statistics(BirdDatabase birds) {
		
		Controller.statistics(birds);
	}
	
	public static void show(Scanner scanner, BirdDatabase birds) {
		
		System.out.println("What to show?");
		String birdToShow = scanner.next();
		
		Controller.showBird(birdToShow, birds);
		
	}
	
	public static void observation(Scanner scanner, BirdDatabase birds) {
		
		System.out.println("What was observed?");
		String birdObserved = scanner.next();
		
		Controller.checkBirds(birdObserved, birds);
		
	}
	
	public static void add(Scanner scanner, BirdDatabase birds) {	
		System.out.print("Add bird to Database->\nName: ");
		String birdname = scanner.next();
		System.out.print("Latin name: ");
		String latinname = scanner.next();
		System.out.print("Who discovered it?");
		String nameOfThePerson = scanner.next();
		System.out.print("Where was he/she from?");
		String countryOfOrigin = scanner.next();
		System.out.print("Which university was he/she from?");
		String universityOfThePerson = scanner.next();
		
		Person discoverer = new Person(nameOfThePerson, countryOfOrigin, universityOfThePerson);
		Bird newBird = new Bird(birdname, latinname, discoverer);
		
		Controller.addBirdToDB(newBird, birds);
		
	}

}
