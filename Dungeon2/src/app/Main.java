package app;

import java.util.Random;
import java.util.Scanner;

import model.Screen;
import model.Vampire;
import service.VampireDb;

public class Main {
	
	final public static int VAMPIRES = 2;
	final public static int HUNTERS = 1;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 3;
	final public static int HEIGTH = 3;
	final public static int HUNTER_X = 0;
	final public static int HUNTER_Y = 0;
	
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	VampireDb vampireDb = new VampireDb("VampireDb");
//	VampireDb.createVampire();
	Vampire vamp1 = new Vampire("Vamp1", "V", 3);
	Vampire vamp2 = new Vampire("Vamp2", "V", 3);
	Vampire vamp3 = new Vampire("Vamp3", "V", 3);
	
	VampireDb.addVampireToDb(vamp1);
	VampireDb.addVampireToDb(vamp2);
	VampireDb.addVampireToDb(vamp3);
	

	
//	HunterDb hunterDb = new HunterDb("HunterDb");
//	Hunter hunter1 = new Hunter("Andreu","@");
//	HunterDb.addHunterToDb(hunter1);
	
	System.out.println(VampireDb.listAllVampires());
//	System.out.println(HunterDb.listAllHunters());
	
	
	Screen.updateScreen(Screen.screen, vampireDb);

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
