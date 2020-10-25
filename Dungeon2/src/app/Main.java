package app;

import java.util.Random;
import java.util.Scanner;

import controller.ScreenObjectController;
import model.Hunter;
import model.Vampire;
import service.HunterDb;
import service.VampireDb;
import view.Screen;

public class Main {
	
	final public static int VAMPIRES = 2;
	final public static int HUNTERS = 1;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 10;
	final public static int HEIGHT = 20;
	final public static int HUNTER_X = 0;
	final public static int HUNTER_Y = 0;
	public static volatile boolean isFinished = false;
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Thread thread = new Thread();
		thread.start();
		
	new Thread() {	
		public void run(){
			Screen.countdownClock();
			Main.isFinished = true;
			}
	}.start();
		isFinished=true;

	Scanner input = new Scanner(System.in);
	
	VampireDb vampireDb = new VampireDb("VampireDb");
//	VampireDb.createVampire();
	Vampire vamp1 = new Vampire("Vamp1", "V", 3);
	Vampire vamp2 = new Vampire("Vamp2", "V", 3);
	Vampire vamp3 = new Vampire("Vamp3", "V", 3);
	vamp3.initialNumberInLength();
	
	VampireDb.addVampireToDb(vamp1);
	VampireDb.addVampireToDb(vamp2);
	VampireDb.addVampireToDb(vamp3);
	

	
	HunterDb hunterDb = new HunterDb("HunterDb");
	Hunter hunter = new Hunter("Andreu","@");
	HunterDb.addHunterToDb(hunter);
//	hunter.initialNumberInHeight();
//	hunter.initialNumberInLength();

	
//	System.out.println(VampireDb.listAllVampires());
//	System.out.println(HunterDb.listAllHunters());

		ScreenObjectController.updateScreen(input, hunterDb, vampireDb);

	}

}
