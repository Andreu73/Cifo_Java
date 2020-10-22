package app;

import model.XY;

public class Main {

	public static void main(String[] args) {
		
	final int LENGTH = 10;
	final int HEIGHT = 20;
	final int VAMPIRES = 3;
	final int MOVES = 14;
	
//	XY xy = new XY();
//	int x = xy.placeVampiresX();
//	int y = xy.placeVampiresY();
	
	String[][] screen = new String[LENGTH][HEIGHT];
		
	for (int i = 0; i < LENGTH; i++) {

		for (int j = 0; j < HEIGHT; j++) {
			
			screen[i][j]=".";
		}
	}

	screen[4][5]="W";
	
	for (int i = 0; i < LENGTH; i++) {

		for (int j = 0; j < HEIGHT; j++) {
			
			System.out.print(screen[i][j]);
		}
		System.out.println();
	}
	
	}
}
