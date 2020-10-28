package model;

import java.util.Scanner;

import app.Main;
import controller.ScreenController;
import controller.ScreenObjectController;
import interfaces.IScreenObject;
import service.HunterDb;
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
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
	while(Main.isFinished == false) {
		
		Hunter hunter = HunterDb.hunters.get(0);
		Vampire vampire = VampireDb.vampires.get(0);
		
		String key = input.next();
		if(key.equals("a") && hunter.position.getY()==0) {
			hunter.position.setY(hunter.position.getY());
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("a")) {
			hunter.position.setY(hunter.position.getY()-1);
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("s") && hunter.position.getX()==Main.LENGTH-1) {
			hunter.position.setX(hunter.position.getX());
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("s")) {
			hunter.position.setX(hunter.position.getX()+1);
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("d") && hunter.position.getY()==Main.HEIGHT-1) {
			hunter.position.setY(hunter.position.getY());
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if (key.equals("d")) {
			hunter.position.setY(hunter.position.getY()+1);
			
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("w") && hunter.position.getX()==0) {
			hunter.position.setX(hunter.position.getX());
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
			}
		else if(key.equals("w")) {
			hunter.position.setX(hunter.position.getX()-1);
			
//			ScreenObjectController.moveVampire(Screen.screen, input, hunterDb, vampireDb);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		}
	}

}
