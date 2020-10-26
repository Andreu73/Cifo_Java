package model;

import java.util.Random;

public class Garlic extends ScreenObject{

	public int pointsObject;
	Random random = new Random();

	public Garlic(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
}
