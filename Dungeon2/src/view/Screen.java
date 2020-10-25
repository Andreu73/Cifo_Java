package view;

import java.util.Scanner;

import app.Main;
import model.Hunter;
import model.Vampire;
import service.HunterDb;
import service.VampireDb;

public class Screen {

	public static String[][] screen = new String[Main.LENGTH][Main.HEIGHT];

	public static void updateScreen(String[][] screen, Scanner input, HunterDb hunterDb, VampireDb vampireDb){
		

		fillScreen(screen);

		for(Vampire vamps : VampireDb.vampires) {
			
			screen[vamps.getX()][vamps.getY()]=vamps.getSymbol();
		}
		
		for(Hunter hunters : HunterDb.hunters) {
			
			screen[hunters.getX()][hunters.getY()]=hunters.getSymbol();
		}

		
		printScreen(screen);
		
		Hunter.moveHunter(input, hunterDb, vampireDb);
	}
	
	public static void printScreen(String[][] screen) {
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGHT; j++) {
				
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {

	
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGHT; j++) {
				
				screen[i][j]=".";
			}
		}
	}
}
