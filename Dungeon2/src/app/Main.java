package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.Hunter;
import model.Vampire;

public class Main {

	public static void main(String[] args) {
		
	final int LENGTH = 10;
	final int HEIGHT = 20;
	final int VAMPIRES = 3;
	final int MOVES = 14;
	
	Scanner input = new Scanner(System.in);
	String[][] screen = new String[LENGTH][HEIGHT];
	
	ArrayList<Vampire> vampire = new ArrayList<>();
	vampire.add(new Vampire("V"));
	vampire.add(new Vampire("V"));
	vampire.add(new Vampire("V"));
	
	Hunter hunter = new Hunter("@");
	
	updateScreen(screen, hunter);


	
	while(true) {
		
		String key = input.nextLine();
		if(key.equals("a")) {
			hunter.moveUp();
			updateScreen(screen, hunter);
		}
		else if(key.equals("s")) {
			hunter.moveRight();
			updateScreen(screen, hunter);
		}
		else if(key.equals("d")) {
			hunter.moveDown();		
			updateScreen(screen, hunter);
		}
		else if(key.equals("w")) {
			hunter.moveLeft();
			updateScreen(screen, hunter);
		}
	}

	
	}
	
	public static void updateScreen(String[][] screen, Hunter hunter){
		fillScreen(screen);
		screen[hunter.getX()][hunter.getY()]=hunter.getSymbol();
		
		printScreen(screen);
	}
	
	public static void printScreen(String[][] screen) {
		for (int i = 0; i < 10; i++) {
	
			for (int j = 0; j < 20; j++) {
				
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void fillScreen(String[][] screen) {

	
		for (int i = 0; i < 10; i++) {
	
			for (int j = 0; j < 20; j++) {
				
				screen[i][j]=".";
			}
		}
	}
}
