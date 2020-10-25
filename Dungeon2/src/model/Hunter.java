package model;

import java.util.Scanner;

import service.HunterDb;
import service.VampireDb;

public class Hunter extends ScreenObject{

	public static int pointsHunter;

	public Hunter(String name, String symbol) {
		super(name, symbol);
	}

	@Override
	public void initialNumberInLenght() {
		
		this.setX(0);
	}
	
	@Override
	public void initialNumberInHeight() {
		
		this.setY(0);
	}
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
	while(true) {
		
		String key = input.next();
		if(key.equals("a")) {
//			Hunter.moveUp();
			HunterDb.hunters.get(0).setY(HunterDb.hunters.get(0).getY()-1);
			Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("s")) {
//			hunter.moveRight();
			HunterDb.hunters.get(0).setX(HunterDb.hunters.get(0).getX()+1);
			Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);
		}
		else if(key.equals("d")) {
//			hunter.moveDown();		
			HunterDb.hunters.get(0).setY(HunterDb.hunters.get(0).getY()+1);
			Screen.updateScreen(Screen.screen, input, hunterDb,vampireDb);
		}
		else if(key.equals("w")) {
//			hunter.moveLeft();
			HunterDb.hunters.get(0).setX(HunterDb.hunters.get(0).getX()-1);
			Screen.updateScreen(Screen.screen, input, hunterDb,vampireDb);
		}
	}
}
}
