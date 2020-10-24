package model;

import java.util.ArrayList;
import java.util.Arrays;

import app.Main;

public class PositionXY {
	
	public int x;
	public int y;
	public String[][] position;
	public ArrayList<String[][]> arrayPositions;

	public PositionXY() {
		super();
//		this.x = x;
//		this.y = y;
		this.position = this.differentPositionXY();
		this.arrayPositions = new ArrayList<>();
	}
	
//	public PositionXY(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
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
	
	public String[][] differentPositionXY() {
		
		int x = randomNumberInLength();
		int y = randomNumberInHeight();
		this.position = new String[x][y];
		
		if(!this.arrayPositions.contains(this.position))
			this.arrayPositions.add(this.position);
		
		return this.position;
	}
		
//		for (int i = 0; i < arrayPositions.size(); i++) {
//			
//			Vampire newVampire = new Vampire("Vampire","V", arrayPositions.get(i),3);
//			VampireDb.addVampireToDb(newVampire);
//		}

	
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

	public void moveUp() {
		
		this.setX(x-1);
//		this.x--;
	}
	public void moveDown() {
		
		this.setX(x+1);
//		this.x++;
	}
	public void moveRight() {
		
		this.setX(y-1);
//		this.y--;
	}
	public void moveLeft() {
		
		this.setX(y+1);
//		this.y++;
	}

	@Override
	public String toString() {
		return "PositionXY [x=" + x + ", y=" + y + ", position=" + Arrays.toString(position) + ", arrayPositions="
				+ arrayPositions + "]";
	}
	
	

}
