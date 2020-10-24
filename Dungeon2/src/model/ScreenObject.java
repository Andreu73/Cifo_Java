package model;


import java.util.ArrayList;

import app.Main;
import interfaces.IScreenObject;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public PositionXY positionxy;
	public static ArrayList<String[][]> arrayPositions = new ArrayList<>();
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.positionxy = new PositionXY(initialPosition(), x, y);
		
	}

	public String[][] initialPosition() {
//		ArrayList<String[][]> arrayPositions = new ArrayList<>();
		
		int x = 0;
		int y = 0;
		String[][]position = null;
		
		while(!arrayPositions.contains(position)) {
			x = randomNumberInLength();
			y = randomNumberInHeight();

			position = new String[x][y];
			
			if(!arrayPositions.contains(position))
				arrayPositions.add(position);
				break;
//				PositionXYDb.checkPositionXYToDb(position);
		
		}
		return position;

	}
		
	public static int randomNumberInLength() {
		//Math.random() * (max - min + 1) + min 
		int numberLength = (int)(Math.random()*(Main.LENGTH));
		return numberLength;
		
	}
	
	public static int randomNumberInHeight() {
		//Math.random() * (max - min + 1) + min 
		int numberHeight = (int)(Math.random()*(Main.HEIGTH));
		return numberHeight;
		
	}
	
	
	public String getSymbol() {
		return symbol;
	}




	@Override
	public String toString() {
		return "ScreenObject [id=" + id + ", name=" + name + ", symbol=" + symbol + ", positionxy=" + positionxy + "]";
	}

	
	
}

