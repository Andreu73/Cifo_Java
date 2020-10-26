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

	public static void moveVampire_a(VampireDb vampireDb) {
		//a
		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()-1);
		ScreenObjectController.moveVampire(vampireDb);
	}
		
	public static void moveVampire_s(VampireDb vampireDb) {
		//s
		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()+1);
		ScreenObjectController.moveVampire(vampireDb);
	}
	
	public static void moveVampire_d(VampireDb vampireDb) {
		//d
		VampireDb.vampires.get(0).position.setY(VampireDb.vampires.get(0).position.getY()+1);
		ScreenObjectController.moveVampire(vampireDb);
	}
				
	public static void moveVampire_w(VampireDb vampireDb) {
		//w
		VampireDb.vampires.get(0).position.setX(VampireDb.vampires.get(0).position.getX()-1);
		ScreenObjectController.moveVampire(vampireDb);
		}

}
