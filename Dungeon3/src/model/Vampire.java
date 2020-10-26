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
		if(sumVampire < sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()+1);
			}
		//d
		else if (sumVampire < sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()+1);
		}
		//s
		else if (sumVampire > sumHunter && compareX < compareY) {
			VampireDb.vampires.get(i).position.setY(VampireDb.vampires.get(i).position.getY()-1);
		}
		//a
		else if (sumVampire > sumHunter && compareX > compareY) {
			VampireDb.vampires.get(i).position.setX(VampireDb.vampires.get(i).position.getX()-1);
		}
		
		
		}
		
		
	}
	
//	public static void moveVampire_a() {
//		//a
//		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()-1);
//	}
//		
//	public static void moveVampire_s() {
//		//s
//		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()-1);
//
//	}
//	
//	public static void moveVampire_d() {
//		//d
//		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()+1);
//
//	}
				
//	public static void moveVampire_w() {
//		//w
//		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()+1);
//
//		}
	
	
	
//	public static void moveHunterToVampire(VampireDb vampireDb) {
//		
//		int hunterX = HunterDb.hunters.get(0).position.getX();
//		int vampireX = VampireDb.vampires.get(0).position.getX();
//		
//		int hunterY = HunterDb.hunters.get(0).position.getY();
//		int vampireY = VampireDb.vampires.get(0).position.getY();
//		
//		int compareX = vampireX - hunterX;
//		int compareY = vampireY - hunterY;
//		
//		int sumVampire = vampireX + vampireY;
//		int sumHunter = hunterX + hunterY;
//		
//		//w-->s
//		if(sumVampire < sumHunter && compareX > compareY) {
//			moveVampire_s();
//			}
//		//d-->a
//		else if (sumVampire < sumHunter && compareX < compareY) {
//			moveVampire_a();
//		}
//		//s-->w
//		else if (sumVampire > sumHunter && compareX < compareY) {
//			moveVampire_w();
//		}
//		//a-->d
//		else if (sumVampire > sumHunter && compareX > compareY) {
//			moveVampire_d();
//		}
//	}

}
