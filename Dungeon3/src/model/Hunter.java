package model;

import java.util.Scanner;

import app.Main;
import controller.HunterController;
import controller.ScreenController;
import controller.ScreenObjectController;
import controller.VampireController;
import interfaces.IScreenObject;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;
import view.Screen;

public class Hunter extends ScreenObject implements IScreenObject{

	public static int pointsHunter;

	public Hunter(String name, String symbol) {
		super(name, symbol);
	}

	@Override
	public void initialNumberInLength() {
		
		position.setX(0);
//		this.setX(0);
	}
	
	@Override
	public void initialNumberInHeight() {
		
		position.setY(0);
	}
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb, StakeDb stakeDb) {
		
	while(Main.isFinished == false) {
		
		Hunter hunter = HunterDb.hunters.get(0);
		
		String key = input.next();
		
		if(key.equals("a") && hunter.position.getX()==0) {
			hunter.position.setX(0);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if(key.equals("a")) {
			hunter.position.setX(hunter.position.getX()-1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if(key.equals("s") && hunter.position.getY()==Main.HEIGHT-1) {
			hunter.position.setY(Main.HEIGHT-1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if(key.equals("s")) {
			hunter.position.setY(hunter.position.getY()+1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);

			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if(key.equals("d") && hunter.position.getX()==Main.LENGTH-1) {
			hunter.position.setX(Main.LENGTH-1);
			hunter.position.setY(hunter.position.getY()+1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if (key.equals("d")) {
			hunter.position.setX(hunter.position.getX()+1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		else if(key.equals("w") && hunter.position.getY()==0) {
			hunter.position.setY(0);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			hunter.position.setY(0);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
			}
		else if(key.equals("w")) {
			hunter.position.setY(hunter.position.getY()-1);
//			HunterController.moveHunter(input, hunterDb, vampireDb, stakeDb);
			VampireController.moveVampire(vampireDb, key);
			hunter.position.setY(hunter.position.getY()-1);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);
		}
		}
	}

}
