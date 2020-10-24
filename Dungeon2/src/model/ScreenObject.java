package model;

import java.util.ArrayList;
import java.util.Random;

import app.Main;
import interfaces.IScreenObject;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public int x;
	public int y;
//	public static String[][]position = new String[Main.LENGTH][Main.HEIGTH];
	Random r = new Random();
	ArrayList<Integer> pairs = new ArrayList<>();
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
//		position = check();
		check();
		
	}
	
	public void check() {
		int x = 0;
		int y = 0;

		while(true) {
//		position [randomNumberInLength()][randomNumberInHeight()]= "V";
			x=randomNumberInLength(r);
			y=randomNumberInHeight(r);
			System.out.println(x);
			System.out.println(y);
			pairs.add(x);
			pairs.add(y);
			
			
			
			this.x = x;
			this.y = y;
			if(this.x!=0 || this.y!=0) {
			break;
			}
		}
	}
	
	
	public static int randomNumberInLength(Random r) {
		//Math.random() * (max - min + 1) + min 
		int numberLength = r.nextInt(Main.LENGTH);
		return numberLength;
		
	}
	
	public static int randomNumberInHeight(Random r) {
		//Math.random() * (max - min + 1) + min 
		int numberHeight = r.nextInt(Main.LENGTH);
		return numberHeight;
		
	}
	
	public String getSymbol() {
		return symbol;
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


	
	
}

