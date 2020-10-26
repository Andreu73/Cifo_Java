package controller;

import java.util.Scanner;

import model.Vampire;
import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Vampire.moveVampire(vampireDb);
		Screen.updateScreen(screen, input, hunterDb, vampireDb);

	}
	
//	public static void moveVampire(HunterDb hunterDb) {
//		
//		Screen.updateScreen(Screen.screen, hunterDb);
//
//	}
	
	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Screen.updateScreen(screen, input, hunterDb, vampireDb);
	}
	

	
}
