package controller;

import java.util.Scanner;

import app.Main;
import model.Hunter;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;

public class HunterController {

	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb, StakeDb stakeDb) {
//		moveVampire(Screen.screen, input, hunterDb, vampireDb);	
		Hunter.moveHunter(input, hunterDb, vampireDb, stakeDb);


	}
	
}
