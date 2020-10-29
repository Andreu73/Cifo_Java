package model;

import java.util.Scanner;

import app.Main;
import controller.ScreenController;
import controller.ScreenObjectController;
import controller.VampireController;
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
		
		String key = input.next();
		
		if(key.equals("a") && hunter.position.getX()==0) {
			String keyPressed = "a";
			hunter.position.setX(0);
			VampireController.moveVampire(vampireDb, keyPressed);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("a")) {
			String keyPressed = "a";
			hunter.position.setX(hunter.position.getX()-1);
			VampireController.moveVampire(vampireDb, keyPressed);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("s") && hunter.position.getY()==Main.HEIGHT-1) {
			hunter.position.setY(Main.HEIGHT-1);
			String keyPressed = "s";
			VampireController.moveVampire(vampireDb, keyPressed);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("s")) {
			String keyPressed = "s";
			VampireController.moveVampire(vampireDb, keyPressed);
			hunter.position.setY(hunter.position.getY()+1);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("d") && hunter.position.getX()==Main.LENGTH-1) {
			hunter.position.setX(Main.LENGTH-1);
			String keyPressed = "d";
			VampireController.moveVampire(vampireDb, keyPressed);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if (key.equals("d")) {
			hunter.position.setX(hunter.position.getX()+1);
			String keyPressed = "d";
			VampireController.moveVampire(vampireDb, keyPressed);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("w") && hunter.position.getY()==0) {
			String keyPressed = "w";
			VampireController.moveVampire(vampireDb, keyPressed);
			hunter.position.setY(0);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
			}
		else if(key.equals("w")) {
			String keyPressed = "w";
			VampireController.moveVampire(vampireDb, keyPressed);
			hunter.position.setY(hunter.position.getY()-1);
			ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		}
	}

}
