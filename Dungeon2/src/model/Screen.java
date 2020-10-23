package model;

import java.util.HashMap;

import app.Main;

public class Screen {

	public static String[][] screen = new String[Main.LENGTH][Main.HEIGTH];
	public static HashMap<Integer, Integer> random = new HashMap<>();

	
	public static String printRandomNumbers() {
		String list = "";
		for(Integer ints : random.keySet()) {
			
			list = list + ints + "  "+random.get(ints)+"\n";
		}
		return list;
	}
	
	public static String printRandomNumberX() {

		for(Integer ints : random.keySet()) {
			
			ints ;
		}
		return ints;
	}
	
	public static void randomNumbers() {
		
		int counter = 0;
		
		while(counter<Main.VAMPIRES) {
			int x = randomNumberInLength();
			int y = randomNumberInHeight();
			if(!random.containsKey(x) || !random.containsValue(y))
				random.put(x, y);
				counter++;
		}
	}
	
	
	public static int randomNumberInLength() {
		//Math.random() * (max - min + 1) + min 
		int numberLength = (int)(Math.random()*(Main.LENGTH + 1));
		return numberLength;
		
	}
	
	public static int randomNumberInHeight() {
		//Math.random() * (max - min + 1) + min 
		int numberHeight = (int)(Math.random()*(Main.HEIGTH + 1));
		return numberHeight;
		
	}
	
	

//	public static void updateScreen(String[][] screen, Hunter hunter, ArrayList<Vampire> vampireDb){
//		fillScreen(screen);
//		screen[hunter.getX()][hunter.getY()]=hunter.getSymbol();
//		for(Vampire vampireList : vampireDb) {
//			
//			screen[vampireList.getX()][vampireList.getY()]=vampireList.getSymbol();
//		}
//		printScreen(screen);
//	}
	
	public static void printScreen(String[][] screen) {
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
