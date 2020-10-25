package model;

import java.util.Random;

import app.Main;

public class Vampire extends ScreenObject{
	
	public int pointsObject;

	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}
	
	
	@Override
	public void initialNumberInLength() {
		//Math.random() * (max - min + 1) + min 
		int numberLength = (int)Math.random()*(Main.LENGTH);
		this.setX(numberLength);
		
	}
	
	@Override
	public void initialNumberInHeight() {
		//(int)Math.random() * (max - min + 1) + min 
		int numberHeight =(int)Math.random()*(Main.HEIGTH);
		this.setY(numberHeight);

		
	}

	


}
