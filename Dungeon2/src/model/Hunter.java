package model;

import java.util.Scanner;

import app.Main;
import controller.ScreenObjectController;
import service.HunterDb;
import service.VampireDb;

public class Hunter extends ScreenObject{

	public static int pointsHunter;

	public Hunter(String name, String symbol) {
		super(name, symbol);
	}

	@Override
	public void initialNumberInLength() {
		
		this.setX(0);
	}
	
	@Override
	public void initialNumberInHeight() {
		
		this.setY(0);
	}
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
	while(Main.isFinished == false) {
		
		Hunter hunter = HunterDb.hunters.get(0);
		
		String key = input.next();
		if(key.equals("a") && hunter.getY()==0) {
			hunter.setY(hunter.getY());
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("a")) {
			hunter.setY(HunterDb.hunters.get(0).getY()-1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("s") && hunter.getX()==Main.LENGTH-1) {
			hunter.setX(hunter.getX());
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("s")) {
			hunter.setX(hunter.getX()+1);
		ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("d") && hunter.getY()==Main.HEIGHT-1) {
			hunter.setY(hunter.getY());
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if (key.equals("d")) {
			hunter.setY(hunter.getY()+1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("w") && hunter.getX()==0) {
			hunter.setX(hunter.getX());
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);}
		else if(key.equals("w")) {
			hunter.setX(hunter.getX()-1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		}
	}

}
