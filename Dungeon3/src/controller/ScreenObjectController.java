package controller;

import java.util.Scanner;

import model.Vampire;
import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Vampire.moveVampire(vampireDb);
		Screen.updateScreen(screen, input, hunterDb);

	}
	
//	public static void moveVampire(HunterDb hunterDb) {
//		
//		Screen.updateScreen(Screen.screen, hunterDb);
//
//	}
	
	public static void updateScreen(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);
	}
	

	
}
