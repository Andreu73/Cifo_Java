package model;


import java.util.ArrayList;

import app.Main;
import interfaces.IScreenObject;
import service.PositionXYDb;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public PositionXY positionxy;
//	public static ArrayList<int[][]> arrayPositions = new ArrayList<>();
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.positionxy = initialPosition();
		
	}


	public PositionXY initialPosition() {
//		ArrayList<String[][]> arrayPositions = new ArrayList<>();
		
		int x = 0;
		int y = 0;

//		int[][]position = null;
		PositionXY newPosition = null;
		
		while(true) {
			x = randomNumberInLength();
			y = randomNumberInHeight();
			
//			position = new int[x][y];
			System.out.println(x);
			System.out.println(y);
			if(x!=0 && y!=0)
//			if(PositionXYDb.checkPositionXYToDb(x, y)) {
//				arrayPositions.add(position);
//				newPosition = new PositionXY(x, y);
//				PositionXYDb.addPositionXYToDb(newPosition);
//				break;}
			break;
		}

		return newPosition;

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

