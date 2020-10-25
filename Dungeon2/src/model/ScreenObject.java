package model;

import java.util.Random;

import app.Main;
import interfaces.IScreenObject;
import service.HunterDb;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public int x;
	public int y;
//	public static String[][]position = new String[Main.LENGTH][Main.HEIGTH];
	Random random = new Random();
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		initialNumberInLength();
		initialNumberInHeight();
		
	}	
	
	public void initialNumberInLength() {
		int numberLength = random.nextInt(Main.LENGTH);
		this.x=numberLength;
	}
	
	public void initialNumberInHeight() {
		int numberHeight = random.nextInt(Main.HEIGHT);
		this.y=numberHeight;
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

