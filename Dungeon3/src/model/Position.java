package model;

import java.util.ArrayList;
import java.util.Random;

import app.Main;
import interfaces.IScreenObject;
import service.PositionDb;

public class Position {
	
	public int x;
	public int y;
//	public String[][] position = new String [Main.LENGTH][Main.HEIGHT];
	public int[] position = {x, y};
	ArrayList<int[]> positionsArray = new ArrayList<>();
	
	public Position() {
		super();
//		this.x = x;
//		this.y = y;
		this.position = checkPositionInArray();

	}
	Random random = new Random();

	public int[] checkPositionInArray() {
		
		int x = initialNumberInLength();
		int y = initialNumberInHeight();
		
		int[]position2 = {x, y};
		
		for(int[] posisInt : positionsArray) {
			
		
	    	for (int i = 0; i < position2.length; i++) {

	            if (position2[i] != posisInt[i]) {
	            	positionsArray.add(position2);
	            	System.out.println("Ok");
	            }
	    	}
		}
    	return position2;
		
	}
	
	public int initialNumberInLength() {
		int numberLength = random.nextInt(Main.LENGTH);
//		this.x=numberLength;
		return numberLength;

	}
	
	public int initialNumberInHeight() {
		int numberHeight = random.nextInt(Main.HEIGHT);
//		this.y=numberHeight;
		return numberHeight;
		
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
