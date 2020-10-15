package birding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
 
        while (true) {
            
            System.out.println("1. Quit\n2. Add\n3. Observation\n4. Show\n5. Statistics");
            System.out.println("------------------\nSelect an option:");
            
            int command = ask(scanner);
 
            if (command==1) {
                break;
            } else if (command==2) {
                add(scanner,db);
            } else if (command==3) {
                observation(scanner,db);
            } else if (command==4) {
                show(scanner,db);
            } else if (command==5) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }

        }
    }
    public static int ask(Scanner input) {    
    	
    	int optionSelected = input.nextInt();
    	return optionSelected;

    }
 
    public static void add(Scanner input, BirdDatabase db) {    
    	
    	System.out.print("Add bird to Database->\nName: ");
    	String birdname = input.next();
    	System.out.print("Latin name: ");
    	String latinname = input.next();
    	db.addBirdToDatabase(birdname, latinname);
    	
 
    }
 
    public static void observation(Scanner input, BirdDatabase db) {  
    	
    	System.out.println("What was observed?");
    	String birdObserved = input.next();
    	
   		Bird bird = db.showBirds(birdObserved);
   		if(bird!=null)
   			bird.addObservations();
   		
    }
 
    public static void show(Scanner input, BirdDatabase db) {  
    	
    	System.out.println("What?");
    	String birdToShow = input.next();
    	
    	System.out.println(db.showBirds(birdToShow));
    }
 
    public static void statistics(Scanner input, BirdDatabase db) {  
    
    	db.getStatistics();
    }


}
