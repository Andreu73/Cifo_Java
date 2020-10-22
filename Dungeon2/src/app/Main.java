package app;

import java.util.Scanner;

import model.Hunter;
import model.Screen;
import service.VampireDb;

public class Main {

	public static void main(String[] args) {
		
	final int MOVES = 14;
	
	Scanner input = new Scanner(System.in);

	VampireDb vampireDb = new VampireDb("VampireDb");
	VampireDb.addVampireToDb();
	Hunter hunter = new Hunter("@");
	
	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);


	
	while(true) {
		
		String key = input.next();
		if(key.equals("a")) {
			hunter.moveUp();
			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
		}
		else if(key.equals("s")) {
			hunter.moveRight();
			Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
		}
		else if(key.equals("d")) {
			hunter.moveDown();		
			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
		}
		else if(key.equals("w")) {
			hunter.moveLeft();
			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
		}
	}

	
	}
	

	

}
