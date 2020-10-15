package birding;

import java.util.Scanner;

public class View {
	
	public static int ask(Scanner input) {    
		
		int optionSelected = input.nextInt();
		return optionSelected;
	
	}
	
	public void start() {
		
		Scanner scanner = new Scanner(System.in);
		BirdDatabase birdsdb = new BirdDatabase("BirdsDB");
		
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
	
	        if (command==5) {
	            break;
	        } else if (command==1) {
	        	Controller.add(scanner, birdsdb);
	        } else if (command==2) {
	        	Controller.observation(scanner, birdsdb);
	        } else if (command==3) {
	        	Controller.show(scanner, birdsdb);
	        } else if (command==4) {
	        	Controller.statistics(scanner, birdsdb);
	        } else {
	            System.out.println("Unknown command!");
	        }
	
	    }
	}

}
