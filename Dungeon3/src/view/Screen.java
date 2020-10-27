package view;

import java.io.IOException;
import java.util.Scanner;

import app.Main;
import controller.ScreenObjectController;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;

public class Screen {

	public static String[][] screen = new String[Main.LENGTH][Main.HEIGHT];

    
    public static void updateScreenObjects() {
    	
     	boolean isVampireCreated = false;
		boolean isStakeCreated = false;
		Vampire vampire = null;
		Stake stake1 = null;

		for(Vampire vamp : VampireDb.vampires) {
			screen[vamp.position.getX()][vamp.position.getY()]=vamp.getSymbol();
			for(Stake stakes : StakeDb.stakes) {
				screen[stakes.position.getX()][stakes.position.getY()]=stakes.getSymbol();
				for(Hunter hunters : HunterDb.hunters) {
					screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
					
					//Hunter gets Stake
					if((Main.isHunterTurn==false) &&
							(stakes.position.getX()==hunters.position.getX() && stakes.position.getY()==hunters.position.getY())){
						screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
						Main.isHunterTurn = true;
						stake1 = stakes;
					}

					//Vampire hunts Hunter
					if((Main.isHunterTurn=false) &&
							(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY())) {
						screen[vamp.position.getX()][vamp.position.getY()]=vamp.getSymbol();
						Main.isFinished = true;
						System.out.println("GAME OVER");
					}

					//Hunter hunts Vampire
					if((Main.isHunterTurn==true) &&
							(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY())) {
						screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
						vampire = vamp;
						Hunter.pointsHunter+=vamp.pointsObject;
						isVampireCreated = true;
						Main.isHunterTurn=false;
						
					}				
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
