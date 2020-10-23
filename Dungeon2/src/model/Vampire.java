package model;

public class Vampire extends ScreenObject{
	
	public int pointsObject;
	public static int x;
	public static int y;
	
	public Vampire(String name, String symbol, int pointsObject) {
		super(name, symbol);
		this.pointsObject = pointsObject;
	}

	@Override
	public String toString() {
		return super.toString() + "Vampire [pointsObject=" + pointsObject + "]";
	}
	
}
