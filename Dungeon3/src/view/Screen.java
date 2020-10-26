package view;

import java.io.IOException;
import java.util.Scanner;

import app.Main;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
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
           { }
         }

    }
    
    public static void updateScreenObjects() {
    	
    	boolean isVampireCreated = false;
		Vampire vampire = null;
		boolean isStakeCreated = false;
		Stake stake1 = null;

		for(Vampire vamp : VampireDb.vampires) {
			screen[vamp.position.getX()][vamp.position.getY()]=vamp.getSymbol();
			for(Stake stakes : StakeDb.stakes) {
				screen[stakes.position.getX()][stakes.position.getY()]=stakes.getSymbol();
				for(Hunter hunters : HunterDb.hunters) {
					screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
					
					//Vampire hunts Hunter
					if(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY()) {
						Main.isFinished = true;
						System.out.println("GAME OVER");
					}

					
					//Hunter gets Stake
					if(stakes.position.getX()==hunters.position.getX() && stakes.position.getY()==hunters.position.getY()) {
						stake1 = stakes;
						isStakeCreated = true;
					}
					
//					Hunter hunts Vampire
//					if(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY()) {
//						vampire = vamp;
//						Hunter.pointsHunter+=vamp.pointsObject;
//						isVampireCreated = true;
//					}				
					
					
					
				}
			}
		}
	
		VampireDb.removeVampire(vampire);
		if(isVampireCreated==true) {
			VampireDb.createNewVampire();
		}
		StakeDb.removeStake(stake1);
		if(isStakeCreated==true) {
			StakeDb.createNewStake();
		}
    }

	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb){
		
		fillScreen(screen);
		updateScreenObjects();
		printScreen(screen);
		Hunter.moveHunter(input, hunterDb, vampireDb);
		
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
