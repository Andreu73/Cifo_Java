package model;

import java.util.Random;
import java.util.Scanner;

import app.Main;
import controller.ScreenObjectController;
import interfaces.IScreenObject;
import service.HunterDb;
import service.VampireDb;

public class Vampire extends ScreenObject {
	
	public int pointsObject;
	Random random = new Random();

	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
	
	public static void moveVampireToHunter(VampireDb vampireDb) {
		
		for (int i = 0; i < Main.VAMPIRES; i++) {
			

		
		int hunterX = HunterDb.hunters.get(0).position.getX();
		int vampireX = VampireDb.vampires.get(i) .position.getX();
		
		int hunterY = HunterDb.hunters.get(0).position.getY();
		int vampireY = VampireDb.vampires.get(i).position.getY();
		
		int compareX = vampireX - hunterX;
		int compareY = vampireY - hunterY;
		
		int sumVampire = vampireX + vampireY;
		int sumHunter = hunterX + hunterY;
		
		//w
		if((sumVampire < sumHunter) && (compareX > compareY) && (VampireDb.vampires.get(i).position.getY()==0))
			VampireDb.vampires.get(i).position.setY(0);
		
		else if(sumVampire < sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
		}
		//d
		else if ((sumVampire < sumHunter) && (compareX < compareY) && (VampireDb.vampires.get(i).position.getX()==Main.LENGTH)) {
			VampireDb.vampires.get(i).position.setX(Main.LENGTH);
		}
		else if (sumVampire < sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
		//s
		else if ((sumVampire > sumHunter) && (compareX < compareY) && (VampireDb.vampires.get(i).position.getY()==Main.HEIGHT)) {
			VampireDb.vampires.get(i).position.setY(Main.HEIGHT);
		}
		else if (sumVampire > sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
		//a
		else if ((sumVampire > sumHunter) && (compareX > compareY) && (VampireDb.vampires.get(i).position.getX()==0)) {
			VampireDb.vampires.get(i).position.setX(0);
		}
		else if (sumVampire > sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}
		
		
		}
		
		
	}
	
		
	public static void moveVampireAwayFromHunter(VampireDb vampireDb) {
		
		for (int i = 0; i < Main.VAMPIRES; i++) {
	
	
	
		int hunterX = HunterDb.hunters.get(0).position.getX();
		int vampireX = VampireDb.vampires.get(0).position.getX();
		
		int hunterY = HunterDb.hunters.get(0).position.getY();
		int vampireY = VampireDb.vampires.get(0).position.getY();
		
		int compareX = vampireX - hunterX;
		int compareY = vampireY - hunterY;
		
		int sumVampire = vampireX + vampireY;
		int sumHunter = hunterX + hunterY;
		
		//w-->S
		if ((sumVampire > sumHunter) && (compareX > compareY) && (VampireDb.vampires.get(i).position.getY()==Main.HEIGHT)) {
			VampireDb.vampires.get(i).position.setY(Main.HEIGHT);
		}
		else if (sumVampire > sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
			
		//d-->A
		else if (((sumVampire < sumHunter) && (compareX < compareY)) && (VampireDb.vampires.get(i).position.getX()==0)) {
			VampireDb.vampires.get(i).position.setX(0);
		}
		else if (sumVampire < sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}
		
		//s-->W	
		
		else if ((sumVampire > sumHunter) && (compareX < compareY) && (VampireDb.vampires.get(i).position.getX()==0)) {
			VampireDb.vampires.get(i).position.setX(0);
		}
		else if (sumVampire > sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}

		//a-->D
		else if ((sumVampire > sumHunter) && (compareX > compareY) && (VampireDb.vampires.get(i).position.getX()==Main.LENGTH)) {
			VampireDb.vampires.get(i).position.setX(Main.LENGTH);
		}
		else if (sumVampire > sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
				
		
	}
		
		
		
	}

}
