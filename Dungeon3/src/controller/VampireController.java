package controller;

import app.Main;
import model.Vampire;
import service.VampireDb;

public class VampireController {
	
	public static void moveVampire(VampireDb vampireDb, String keyPressed) {
		
		if(Main.isHunterTurn==true)
			Vampire.moveVampireAwayFromHunter(vampireDb, keyPressed);	
		else

		Vampire.moveVampireToHunter(vampireDb, keyPressed);
	}
}
