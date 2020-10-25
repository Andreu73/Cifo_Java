package view;

import java.io.IOException;
import java.util.Scanner;

import app.Main;
import model.Hunter;
import model.Vampire;
import service.HunterDb;
import service.VampireDb;

public class Screen {

	public static String[][] screen = new String[Main.LENGTH][Main.HEIGHT];
	
    public static void countdownClock(){
    	int i = Main.TIME_PER_GAME;
    	while (i > 0){
    		try {
        	   
    			for (int j = 0; j < 5; j++) {
        		i--;
	            Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
	            }
	            System.out.println("Remaining: "+ i +" seconds");
           }
           catch (InterruptedException e) 
           {
        	   System.out.println(e);
           }
         }

    }
    
    public static void updateScreenObjects() {
    	
    	boolean isCreated = false;
		Vampire vampire = null;

		for(Vampire vamp : VampireDb.vampires) {
    	
			screen[vamp.getX()][vamp.getY()]=vamp.getSymbol();
		
			for(Hunter hunters : HunterDb.hunters) {
				
				screen[hunters.getX()][hunters.getY()]=hunters.getSymbol();
				if(vamp.getX()==hunters.getX() && vamp.getY()==hunters.getY()) {
					vampire = vamp;
					Hunter.pointsHunter+=vamp.pointsObject;
					isCreated = true;
				}
			}
		}
	
		VampireDb.removeVampire(vampire);

		
		if(isCreated==true) {
			VampireDb.createNewVampire();
		}
    }

	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb){
		
		fillScreen(screen);
		
		updateScreenObjects();
	
		printScreen(screen);

		Hunter.moveHunter(input, hunterDb);
	}
	
	public static void printInitialScreen(Scanner input) {
			
		System.out.print("\n   VAMPIRE CHASE\npress enter to start\n\n"
				+ "a -> move left\n"
				+ "d -> move right\n"
				+ "w -> move up\n"
				+ "s -> move down\n\n"
				+ "V -> 5 points\n"
				+ "W -> 3 poimts\n");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	
	public static void printScreen(String[][] screen) {
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGHT; j++) {
				
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {

	
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGHT; j++) {
				
				screen[i][j]=Main.FILL_SCREEN_SYMBOL;
			}
		}
	}
}
