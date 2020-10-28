package controller;

import java.util.Scanner;

import app.Main;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveVampire(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		if(Main.isHunterTurn==false) {
			Vampire.moveVampireToHunter(vampireDb);
//			ScreenController.updateScreen(screen, input, hunterDb, vampireDb);
		}
		else
			Vampire.moveVampireAwayFromHunter(vampireDb);{
//			ScreenController.updateScreen(screen, input, hunterDb, vampireDb);
			}
	}
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		moveVampire(Screen.screen, input, hunterDb, vampireDb);	
		Hunter.moveHunter(input, hunterDb, vampireDb);

//		ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
	}
	
	   public static void updateScreenObjects(String[][] screen) {
	    	
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
//						if(stakes.position.getX()==hunters.position.getX() && stakes.position.getY()==hunters.position.getY()){
//							screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
//							Main.isHunterTurn = true;
//							stake1 = stakes;
//
//						}

						//Vampire hunts Hunter
//						if(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY()) {
//							screen[vamp.position.getX()][vamp.position.getY()]=vamp.getSymbol();
//							Main.isFinished = true;
//							System.out.println("GAME OVER");
//						}

						//Hunter hunts Vampire
//						if(vamp.position.getX()==hunters.position.getX() && vamp.position.getY()==hunters.position.getY()) {
//							screen[hunters.position.getX()][hunters.position.getY()]=hunters.getSymbol();
//							vampire = vamp;
//							Main.isHunterTurn=false;
//							Hunter.pointsHunter+=vamp.pointsObject;
//							isVampireCreated = true;
//
//							
//						}				
					}
				}
			}
		
//			VampireDb.removeVampire(vampire);
//			if(isVampireCreated==true) {
//				VampireDb.createNewVampire();
//			}
//			StakeDb.removeStake(stake1);
//			if(isStakeCreated==true) {
//				StakeDb.createNewStake();
//			}
	    }
		

	
}
