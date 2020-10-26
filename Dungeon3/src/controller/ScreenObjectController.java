package controller;

import java.util.Scanner;

import service.HunterDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(Scanner input, HunterDb hunterDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb);

	}
	
	public static void updateScreen(Scanner input, HunterDb hunterDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb);
	}

}
