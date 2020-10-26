package controller;

import java.util.Scanner;

import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class ScreenObjectController {
	
	public static void moveHunter(Scanner input, HunterDb hunterDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb);

	}
	
	public static void updateScreen(Scanner input, HunterDb hunterDb) {
		
		Screen.updateScreen(Screen.screen, input, hunterDb);
	}

	public static void comparePositionsHunterVsVampire() {
		
		int hunterX = HunterDb.hunters.get(0).position.getX();
		int vampireX = VampireDb.vampires.get(0).position.getX();
		
		int hunterY = HunterDb.hunters.get(0).position.getY();
		int vampireY = VampireDb.vampires.get(0).position.getY();
		
		int compareX = vampireX - hunterX;
		int compareY = vampireY - hunterY;
		
		int sumVampire = vampireX + vampireY;
		int sumHunter = hunterX + hunterY;
		
		if(sumVampire < sumHunter && compareX > compareY)
			moveVampire_w();
		else if (sumVampire < sumHunter && compareX < compareY)
			moveVampire_d();
		else if (sumVampire > sumHunter && compareX < compareY)
			moveVampire_s();
		else if (sumVampire > sumHunter && compareX > compareY)
			moveVampire_a();
	}
	
	
	
}
