package model;

import java.util.ArrayList;

public class Screen {

	final static int LENGTH = 10;
	final static int HEIGHT = 20;
	public static String[][] screen = new String[LENGTH][HEIGHT];
	
	public static int randomNumberInLength() {
		
		int numberLength = (int)(Math.random()*(LENGTH - 1)) + 1;
		return numberLength;
		
	}
	
	public static int randomNumberInHeight() {
		
		int numberHeight = (int)(Math.random()*(HEIGHT - 1)) + 1;
		return numberHeight;
		
	}	

	public static void updateScreen(String[][] screen, Hunter hunter, ArrayList<Vampire> vampireDb){
		fillScreen(screen);
		screen[hunter.getX()][hunter.getY()]=hunter.getSymbol();
		for(Vampire vampireList : vampireDb) {
			
			screen[vampireList.getX()][vampireList.getY()]=vampireList.getSymbol();
		}
		printScreen(screen);
	}
	
	public static void printScreen(String[][] screen) {
		for (int i = 0; i < LENGTH; i++) {
	
			for (int j = 0; j < HEIGHT; j++) {
				
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {

	
		for (int i = 0; i < LENGTH; i++) {
	
			for (int j = 0; j < HEIGHT; j++) {
				
				screen[i][j]=".";
			}
		}
	}
}
