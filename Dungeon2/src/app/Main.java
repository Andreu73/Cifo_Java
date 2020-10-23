package app;

import java.util.Scanner;

import model.Hunter;
import model.ScreenObject;
import service.HunterDb;
import service.VampireDb;

public class Main {
	
	final public static int VAMPIRES = 3;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 3;
	final public static int HEIGTH = 3;
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	VampireDb vampireDb = new VampireDb("VampireDb");
//	VampireDb.addVampireToDb();
	
	HunterDb hunterDb = new HunterDb("HunterDb");
	Hunter hunter1 = new Hunter("Andreu","@");
	HunterDb.addHunterToDb(hunter1);
	
	System.out.println(VampireDb.listAllVampires());
	System.out.println(HunterDb.listAllHunters());
	
	ScreenObject.getKey();
	
	
//	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);

//	while(true) {
//		
//		String key = input.next();
//		if(key.equals("a")) {
//			hunter.moveUp();
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//		else if(key.equals("s")) {
//			hunter.moveRight();
//			Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
//		}
//		else if(key.equals("d")) {
//			hunter.moveDown();		
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//		else if(key.equals("w")) {
//			hunter.moveLeft();
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//	}

	
	}
	

	
	
	
	

}
