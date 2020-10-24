package model;

import java.util.Arrays;

import app.Main;

public class PositionXY {
	
	public int x;
	public int y;
	public String[][] position ;
//	public static ArrayList<String[][]> arrayPositions ;

	public PositionXY() {
		super();
		this.position = initialPosition();
//		arrayPositions = new ArrayList<>();

	}
	
	public String[][] getPosition() {
		return position;
	}
	
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
	
	public String[][] initialPosition() {
//		ArrayList<String[][]> arrayPositions = new ArrayList<>();
		
		int x = 0;
		int y = 0;
		
//		while(true) {
			x = randomNumberInLength();
			y = randomNumberInHeight();

			position = new String[x][y];
			
//			if(!arrayPositions.contains(position)) {

//			PositionXYDb.checkPositionXYToDb(position);
				this.x = x;
				this.y = y;
//			}
				
//		}
		return position;
	}
		
	public static int randomNumberInLength() {
		//Math.random() * (max - min + 1) + min 
		int numberLength = (int)(Math.random()*(Main.LENGTH + 1));
		return numberLength;
		
	}
	
	public static int randomNumberInHeight() {
		//Math.random() * (max - min + 1) + min 
		int numberHeight = (int)(Math.random()*(Main.HEIGTH + 1));
		return numberHeight;
		
	}

	@Override
	public String toString() {
		return "PositionXY [x=" + x + ", y=" + y + ", position=" + Arrays.toString(position) + "]";
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
