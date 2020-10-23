package model;

public class Hunter extends Object{
	
	final int MOVES = 14;
	
	public static int pointsPlayer;
	
	public Hunter(String name, String symbol) {
		super(name, symbol);
	
		pointsPlayer = 0;
	}

	@Override
	public int placeObjectInitialX() {

		int x = 0;
		return x;
	}

	@Override
	public int placeObjectInitialY() {
		int y = 0;
		return y;
	}

}
