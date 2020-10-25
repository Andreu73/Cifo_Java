package view;

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

	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb){
		

		fillScreen(screen);

		for(Vampire vamps : VampireDb.vampires) {
			
			screen[vamps.getX()][vamps.getY()]=vamps.getSymbol();
			
			for(Hunter hunters : HunterDb.hunters) {
				
				screen[hunters.getX()][hunters.getY()]=hunters.getSymbol();
				if(vamps.getX()==hunters.getX() && vamps.getY()==hunters.getY()) {
					
					vamps.setSymbol(Main.FILL_SCREEN_SYMBOL);
					VampireDb.createVampire();
				}
			}
		}
		


		printScreen(screen);

		Hunter.moveHunter(input, hunterDb, vampireDb);
		
//		System.out.println(Hunter.pointsHunter);

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
