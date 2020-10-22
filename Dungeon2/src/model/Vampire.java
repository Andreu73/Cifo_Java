package model;

public class Vampire {
	
	public String symbol;
	public int x;
	public int y;

	public Vampire(String symbol) {
		this.symbol = symbol;
		this.x = placeObjectX();
		this.y = placeObjectY();
	}
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public String getSymbol() {
		return symbol;
	}
	
	public int placeObjectX() {

		int x = (int)(Math.random()*(10 - 1)) + 1;
		return x;
	}
	
	public int placeObjectY() {
		int y = (int)(Math.random()*(10 - 1)) + 1;
		return y;
	}

}
