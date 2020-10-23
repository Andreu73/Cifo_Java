package model;

public class Hunter extends Object{
	
	final int MOVES = 14;
	
	public int x = placeObjectInitialX();
	public int y = placeObjectInitialY();
	public static int pointsHunter;
	
	public Hunter(String name, String symbol) {
		super(name, symbol);
		pointsHunter = 0;
	}

	public int placeObjectInitialX() {

		int x = 0;
		return x;
	}

	public int placeObjectInitialY() {
		int y = 0;
		return y;
	}

}
