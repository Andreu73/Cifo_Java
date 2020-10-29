package controller;

import java.util.Scanner;

import app.Main;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;
import view.Screen;

public class ScreenController {
	
	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb, StakeDb stakeDb){

		while(true) {
		Screen.fillScreen(screen);
		ScreenObjectController.updateScreenObjects(screen);
		Screen.printScreen(screen);
		Hunter.moveHunter(input, hunterDb, vampireDb, stakeDb);
		}
	}

 
	
}
