package controller;

import java.util.Scanner;

import model.Hunter;
import service.HunterDb;
import service.VampireDb;

public class HunterController {

	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
//		moveVampire(Screen.screen, input, hunterDb, vampireDb);	
		Hunter.moveHunter(input, hunterDb, vampireDb);

//		ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
	}
	
}
