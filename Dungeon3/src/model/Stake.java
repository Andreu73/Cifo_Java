package model;

import java.util.Random;

public class Stake extends ScreenObject{

	public int pointsObject;
	Random random = new Random();

	public Stake(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
}
