package model;

import app.Main;
import service.VampireDb;

public class Screen {

	public static String[][] screen = new String[Main.LENGTH][Main.HEIGTH];

	public static void updateScreen(String[][] screen, VampireDb vampireDb){
		fillScreen(screen);

		for(Vampire vamps : VampireDb.vampires) {
			
			screen[vamps.getX()][vamps.getY()]=vamps.getSymbol();
		}
		
		printScreen(screen, vampireDb);
	}
	
	public static void printScreen(String[][] screen, VampireDb vampire) {
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGTH; j++) {
				
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {

	
		for (int i = 0; i < Main.LENGTH; i++) {
	
			for (int j = 0; j < Main.HEIGTH; j++) {
				
				screen[i][j]=".";
			}
		}
	}
}
