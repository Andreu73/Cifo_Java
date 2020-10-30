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
		int pointsVampire = 0;

		for(Vampire vamp : VampireDb.vampires) {
			screen[vamp.position.getY()][vamp.position.getX()]=vamp.getSymbol();
			for(Stake stakes : StakeDb.stakes) {
				screen[stakes.position.getY()][stakes.position.getX()]=stakes.getSymbol();
				for(Hunter hunters : HunterDb.hunters) {
					screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
			
					//Hunter gets Stake
					if((Main.isHunterTurn==false) && (stakes.position.getX()==hunters.position.getX()) && (stakes.position.getY()==hunters.position.getY()))	{
						screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
						Main.isHunterTurn = true;
						stake1 = stakes;
						isStakeCreated=true;

						}
					
					//Vampire hunts Hunter
					if((Main.isHunterTurn==false) &&(vamp.position.getX()==hunters.position.getX()) 
								&& (vamp.position.getY()==hunters.position.getY())) 
						{
						screen[hunters.position.getY()][hunters.position.getX()]="+";
						Main.isFinished = true;
						}
					
					//Hunter hunts Vampire
					if((Main.isHunterTurn==true) &&(vamp.position.getX()==hunters.position.getX()) 
							&& (vamp.position.getY()==hunters.position.getY())) {
						screen[hunters.position.getY()][hunters.position.getX()]=hunters.getSymbol();
						
						vampire = vamp;
						pointsVampire = VampireDb.pointsVampire(vamp);						

						isVampireCreated = true;
						}

				}
			
			}
		}

		Hunter.pointsHunter=Hunter.pointsHunter+pointsVampire;
		
		if(Main.isHunterTurn==true)
			System.out.println("Your turn");
		else
			System.out.println("Vampires'turn");
			
		if(Main.isFinished == true)
			System.out.println("GAME OVER");
		
		VampireDb.removeVampire(vampire);
		if(isVampireCreated==true) {
			VampireDb.createNewVampire();
			Main.isHunterTurn=false;
		}
	
		StakeDb.removeStake(stake1);
		if(isStakeCreated==true) {
			StakeDb.createNewStake();

		}
		
	}
}

