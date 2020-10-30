package view;

import java.io.IOException;
import java.util.Scanner;

import app.Main;
import controller.ScreenController;
import controller.ScreenObjectController;
import model.Hunter;
import model.Stake;
import model.Vampire;
import service.HunterDb;
import service.StakeDb;
import service.VampireDb;

public class Screen {

	public static String[][] screen = new String[Main.HEIGHT][Main.LENGTH];

	public static void printInitialScreen(Scanner input) {
			
		System.out.print("\n   VAMPIRE CHASE\npress enter to start\n\n"
				+ "a -> move left\n"
				+ "d -> move right\n"
				+ "w -> move up\n"
				+ "s -> move down\n\n"
				+ "V -> 5 points\n"
				+ "W -> 3 poimts\n");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	
	public static void printScreen(String[][] screen) {
		for (int i = 0; i < Main.HEIGHT; i++) {
			for (int j = 0; j < Main.LENGTH; j++) {
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {
		for (int i = 0; i < Main.HEIGHT; i++) {
			for (int j = 0; j < Main.LENGTH; j++) {
				screen[i][j]=Main.FILL_SCREEN_SYMBOL;
			}
		}
		System.out.println("Total points: " + Hunter.pointsHunter);
		if(Main.isFinished == true)
			System.out.println("GAME OVER");
	}
}
