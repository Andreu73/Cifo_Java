package controller;

import java.util.Scanner;

import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);

	}
	
	public static void updateScreen(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);
	}

}
