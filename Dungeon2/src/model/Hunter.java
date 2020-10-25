package model;

import java.util.Scanner;

import controller.ScreenObjectController;
import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class Hunter extends ScreenObject{

	public static int pointsHunter;

	public Hunter(String name, String symbol) {
		super(name, symbol);
	}

//	@Override
//	public void initialNumberInLength() {
//		
//		this.setX(0);
//	}
//	
//	@Override
//	public void initialNumberInHeight() {
//		
//		this.setY(0);
//	}
	
	public static void moveHunter(Scanner input, HunterDb hunterDb, VampireDb vampireDb) {
		
	while(true) {
		
		String key = input.next();
		if(key.equals("a")) {
			HunterDb.hunters.get(0).setY(HunterDb.hunters.get(0).getY()-1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("s")) {
			HunterDb.hunters.get(0).setX(HunterDb.hunters.get(0).getX()+1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("d")) {
			HunterDb.hunters.get(0).setY(HunterDb.hunters.get(0).getY()+1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
		else if(key.equals("w")) {
			HunterDb.hunters.get(0).setX(HunterDb.hunters.get(0).getX()-1);
			ScreenObjectController.moveHunter(input, hunterDb, vampireDb);
		}
	}
}
}
