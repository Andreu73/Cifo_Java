package model;

public class Vampire extends ScreenObject{
	
	public int pointsObject;

	public Vampire(String name, String symbol, String[][] stringArray, int pointsObject) {
		super(name, symbol, stringArray);
		this.pointsObject = pointsObject;
	}
	


}
