package controller;

import app.Main;
import model.Vampire;
import service.VampireDb;

public class VampireController {
	
	public static void moveVampire(VampireDb vampireDb, String keyPressed) {
		
		if(Main.isHunterTurn==false) {
			Vampire.moveVampireToHunter(vampireDb, keyPressed);
		}
		else
			Vampire.moveVampireAwayFromHunter(vampireDb, keyPressed);{
			}
	}
}
