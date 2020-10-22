package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.ScreenObject;

public class Main {

	public static void main(String[] args) {
		
	final int LENGTH = 10;
	final int HEIGHT = 20;
	final int VAMPIRES = 3;
	final int MOVES = 14;
	
	Scanner input = new Scanner(System.in);
	String[][] screen = new String[LENGTH][HEIGHT];
	ArrayList<Vampire> vampire = new ArrayList<>();
	
	ScreenObject vampire1 = new ScreenObject("V");
	ScreenObject vampire2 = new ScreenObject("V");
	ScreenObject hunter = new ScreenObject("@");
	int x = vampire1.placeObjectX();
	int y = vampire1.placeObjectY();
	int z = vampire2.placeObjectX();
	int zz = vampire2.placeObjectY();
	
	updateScreen(screen, hunter,vampire1, x,y);


	
	while(true) {
		
		String key = input.nextLine();
		if(key.equals("a")) {
			hunter.moveUp();
			updateScreen(screen, hunter,vampire1,x, y);
		}
		else if(key.equals("s")) {
			hunter.moveRight();
			updateScreen(screen, hunter,vampire1,x,y);
		}
		else if(key.equals("d")) {
			hunter.moveDown();		
			updateScreen(screen, hunter,vampire1,x,y);
		}
		else if(key.equals("w")) {
			hunter.moveLeft();
			updateScreen(screen, hunter, vampire1,x, y);
		}
	}

	
	}
	
	public static void updateScreen(String[][] screen, ScreenObject hunter,ScreenObject vampire1, int x, int y){
		fillScreen(screen);
		screen[hunter.getX()][hunter.getY()]=hunter.getSymbol();
		screen[x][y]=vampire1.getSymbol();
		
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
