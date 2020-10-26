package app;

import java.util.Scanner;

import controller.ScreenObjectController;
import model.Hunter;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;
import view.Screen;

public class Main {
	
	final public static int VAMPIRES = 1;
	final public static int HUNTERS = 1;
	final public static int STAKES = 3;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 7;
	final public static int HEIGHT = 14;
	final public static int HUNTER_X = 0;
	final public static int HUNTER_Y = 0;
	final public static String FILL_SCREEN_SYMBOL = ".";
	final public static int TIME_PER_GAME = 100;
	public static boolean isFinished = false;
   	public static boolean isHunterTurn = false;
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	Screen.printInitialScreen(input);
	
	VampireDb vampireDb = new VampireDb("VampireDb");
	VampireDb.createInitialVampires();
	StakeDb stakeDb = new StakeDb("StakeDb");
	StakeDb.createInitialStakes();
	
	
	HunterDb hunterDb = new HunterDb("HunterDb");
	Hunter hunter = new Hunter("Andreu","@");
	HunterDb.addHunterToDb(hunter);

	Screen.updateScreen(Screen.screen, input, hunterDb, vampireDb);

	}

}
