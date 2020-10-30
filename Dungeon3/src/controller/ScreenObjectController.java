package controller;

import app.Main;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;

public class ScreenObjectController {
	
   public static void updateScreenObjects(String[][] screen) {
    	
     	boolean isVampireCreated = false;
		boolean isStakeCreated = false;
		Vampire vampire = null;
		Stake stake1 = null;

		for(Vampire vamp : VampireDb.vampires) {
			screen[vamp.position.getY()][vamp.position.getX()]=vamp.getSymbol();
			for(Stake stakes : StakeDb.stakes) {
				screen[stakes.position.getY()][stakes.position.getX()]=stakes.getSymbol();
				for(Hunter hunters : HunterDb.hunters) {
					screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
			
					//Hunter gets Stake
					if((stakes.position.getX()==hunters.position.getX()) && (stakes.position.getY()==hunters.position.getY())){
						screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
						Main.isHunterTurn = true;
						stake1 = stakes;
//						StakeDb.removeStake(stake1);
//						StakeDb.createNewStake();
//						isStakeCreated=true;

					}
					
					//Hunter hunts Vampire
					else {
						
						//Vampire hunts Hunter
						if((Main.isHunterTurn==false) &&(vamp.position.getX()==hunters.position.getX()) 
								&& (vamp.position.getY()==hunters.position.getY())) {
							screen[vamp.position.getY()][vamp.position.getX()]=vamp.getSymbol();
							Main.isFinished = true;
							System.out.println("GAME OVER");
						}
						else {
						screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
						Main.isHunterTurn=false;
						vampire = vamp;
//						VampireDb.removeVampire(vampire);
						Hunter.pointsHunter+=vamp.pointsObject;
//						VampireDb.createNewVampire();
//						isVampireCreated = true;
						}
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
		

	
}
