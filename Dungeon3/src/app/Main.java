package app;

import java.util.Scanner;

import controller.ScreenController;
import controller.ScreenObjectController;
import model.Hunter;
import model.Position;
import service.HunterDb;
import service.PositionDb;
import service.StakeDb;
import service.VampireDb;
import view.Screen;

public class Main {
	
	final public static int VAMPIRES = 4;
	final public static int HUNTERS = 1;
	final public static int STAKES = 10;
	final public static boolean VAMPIRES_MOVE = true;
	final public static int MOVES = 14;
	final public static int LENGTH = 25;
	final public static int HEIGHT = 15;
//	final public static int HUNTER_X = 0;
//	final public static int HUNTER_Y = 0;
	final public static String FILL_SCREEN_SYMBOL = ".";
//	final public static int TIME_PER_GAME = 100;
	public static boolean isFinished = false;
   	public static boolean isHunterTurn = false;
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
//	Screen.printInitialScreen(input);
	
	VampireDb vampireDb = new VampireDb("VampireDb");
	VampireDb.createInitialVampires();
	StakeDb stakeDb = new StakeDb("StakeDb");
	StakeDb.createInitialStakes();
	
	
	HunterDb hunterDb = new HunterDb("HunterDb");
	Hunter hunter = new Hunter("Andreu","@");
	HunterDb.addHunterToDb(hunter);

	ScreenController.updateScreen(Screen.screen, input, hunterDb, vampireDb, stakeDb);

	}

}
