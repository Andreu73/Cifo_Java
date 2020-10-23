package model;

import java.util.ArrayList;
import java.util.Arrays;

import app.Main;
import interfaces.IScreenObject;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public int x;
	public int y;
	public String[][] position;
	
	public ScreenObject(String name, String symbol, String[][] stringArray) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
//		this.x = 0;
//		this.y = 0;
		this.position = stringArray;
	}
	
	public void randomNumbers() {
		
		String[][] arrayPositions = new String[][];
		
		int counter = 0;
		
		while(counter < (Main.VAMPIRES + Main.HUNTERS)) {
			int x = randomNumberInLength();
			int y = randomNumberInHeight();
			
			if(!arrayPositions.contains(position[x][y])) {
				arrayPositions.add(position[x][y]);
				counter++;
			}
		}
		for (int i = 0; i < arrayPositions.size(); i++) {
			
			ScreenObject newVampire = new Vampire("Vampire","V", arrayPositions.get(i),3);
		}
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
		return "ScreenObject [id=" + id + ", name=" + name + ", symbol=" + symbol + ", position="
				+ Arrays.toString(position) + "]";
	}
	
	



}

