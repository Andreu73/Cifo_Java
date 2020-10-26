package model;

import java.util.Random;
import java.util.Scanner;

import app.Main;
import controller.ScreenObjectController;
import service.HunterDb;
import service.VampireDb;

public class Vampire extends ScreenObject{
	
	public int pointsObject;
	Random random = new Random();

	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
	
	public static void moveVampireToHunter(VampireDb vampireDb) {
		
		int hunterX = HunterDb.hunters.get(0).position.getX();
		int vampireX = VampireDb.vampires.get(0).position.getX();
		
		int hunterY = HunterDb.hunters.get(0).position.getY();
		int vampireY = VampireDb.vampires.get(0).position.getY();
		
		int compareX = vampireX - hunterX;
		int compareY = vampireY - hunterY;
		
		int sumVampire = vampireX + vampireY;
		int sumHunter = hunterX + hunterY;
		
		//w
		if(sumVampire < sumHunter && compareX > compareY) {
			moveVampire_w();
			}
		//d
		else if (sumVampire < sumHunter && compareX < compareY) {
			moveVampire_d();
		}
		//s
		else if (sumVampire > sumHunter && compareX < compareY) {
			moveVampire_s();
		}
		//a
		else if (sumVampire > sumHunter && compareX > compareY) {
			moveVampire_a();
		}
	}
	
	public static void moveVampire_a() {
		//a
		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()-1);
	}
		
	public static void moveVampire_s() {
		//s
		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()-1);

	}
	
	public static void moveVampire_d() {
		//d
		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()+1);

	}
				
	public static void moveVampire_w() {
		//w
		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()+1);

		}

}
