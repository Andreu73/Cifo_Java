package model;

public class ScreenObject {
	
	public String symbol;
	public int x;
	public int y;

	public ScreenObject(String symbol, int x, int y) {
		this.symbol = symbol;
		this.x = 0;
		this.y = 0;
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
	

	public void moveRight() {
		
		this.x++;
	}
	public void moveLeft() {
		
		this.x--;
	}
	public void moveUp() {
		
		this.y--;
	}
	public void moveDown() {
		
		this.y++;
	}
}
