package model;

import java.util.Random;

import interfaces.IScreenObject;

public class Stake extends ScreenObject {

	public int pointsObject;
	Random random = new Random();

	public Stake(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
}
