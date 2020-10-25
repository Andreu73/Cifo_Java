package model;

import java.util.Random;

import service.VampireDb;


public class Vampire extends ScreenObject{
	
	public int pointsObject;
	Random random = new Random();

	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}


}
