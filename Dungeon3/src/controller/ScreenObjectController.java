package controller;

import java.util.Scanner;

import app.Main;
import model.Vampire;
import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		if(Main.isHunterTurn==false)
			Vampire.moveVampireToHunter(vampireDb); 
		else
			Vampire.moveVampireAwayFromHunter(vampireDb);
			Screen.updateScreen(screen, input, hunterDb, vampireDb);

	}
	
//	public static void moveVampireAway(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
//		
//		
//		Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);
//
//	}
	
//	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
//		
//		Screen.updateScreen(screen, input, hunterDb, vampireDb);
//	}
	

	
}
