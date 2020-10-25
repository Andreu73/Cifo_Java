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
	
	final public static int VAMPIRES = 5;
	final public static int HUNTERS = 1;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 7;
	final public static int HEIGHT = 14;
	final public static int HUNTER_X = 0;
	final public static int HUNTER_Y = 0;
	final public static String FILL_SCREEN_SYMBOL = ".";
	public static boolean isFinished = false;
	final public static int TIME_PER_GAME = 20;
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	Screen.printInitialScreen(input);
		
	new Thread() {	
		public void run(){
			Screen.countdownClock();
			Main.isFinished = true;
			System.out.println(Hunter.pointsHunter + " points!");
			}
	}.start();
	
	VampireDb vampireDb = new VampireDb("VampireDb");
	VampireDb.createInitialVampires();
	
	HunterDb hunterDb = new HunterDb("HunterDb");
	Hunter hunter = new Hunter("Andreu","@");
	HunterDb.addHunterToDb(hunter);

	ScreenObjectController.updateScreen(input, hunterDb);

	}

}
