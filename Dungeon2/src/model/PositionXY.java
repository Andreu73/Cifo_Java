package model;

public class PositionXY {
	
	public int x;
	public int y;
//	public int[][] position ;
//	public static ArrayList<String[][]> arrayPositions = new ArrayList<>(); ;

	public PositionXY(int x, int y) {
		super();
//		this.position = position;
		this.x = x;
		this.y = y;
	}

	
	
	
//	public int[][] getPosition() {
//		return position;
//	}




	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	


	public void moveUp() {
		
		this.setX(x-1);
		this.x--;
	}
	public void moveDown() {
		
		this.setX(x+1);
		this.x++;
	}
	public void moveRight() {
		
		this.setX(y-1);
		this.y--;
	}
	public void moveLeft() {
		
		this.setX(y+1);
		this.y++;
	}




	
	

}
