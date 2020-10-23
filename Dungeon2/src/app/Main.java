package app;

import java.util.Scanner;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Hunter;
import model.Screen;
import service.VampireDb;

public class Main implements KeyListener{
	


	public static void main(String[] args) {
		
	final int MOVES = 14;
	
	Scanner input = new Scanner(System.in);

	VampireDb vampireDb = new VampireDb("VampireDb");
	VampireDb.addVampireToDb();
	Hunter hunter = new Hunter("@");
	
	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
	keyPressed(e, hunter);

	}
	
//	while(true) {
//		
//		String key = input.next();
//		if(key.equals("a")) {
//			hunter.moveUp();
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//		else if(key.equals("s")) {
//			hunter.moveRight();
//			Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
//		}
//		else if(key.equals("d")) {
//			hunter.moveDown();		
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//		else if(key.equals("w")) {
//			hunter.moveLeft();
//			Screen.updateScreen(Screen.screen, hunter,VampireDb.vampires);
//		}
//	}
//
//	
//	}
	
//	public void keyPressed(KeyEvent e, Hunter hunter) {
//		hunting(e, hunter);
//    }
	
	public void hunting(KeyEvent e, Hunter hunter) {
		
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
	    	hunter.moveRight();
	    	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
	    } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
	    	hunter.moveLeft();
	    	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
	    } else if (e.getKeyCode() == KeyEvent.VK_UP ) {
	    	hunter.moveUp();
	    	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
	    } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
	    	hunter.moveDown();
	    	Screen.updateScreen(Screen.screen, hunter, VampireDb.vampires);
	    }

	}
	


}
