package model;

public class Movement {
	
	public static int x;
	public static int y;

	public Movement() {
		super();
	}

	public static void moveUp() {
		
		x--;
	}
	public static void moveDown() {
		
		x++;
	}
	public static void moveRight() {
		
		y--;
	}
	public static void moveLeft() {
		
		y++;
	}

}
