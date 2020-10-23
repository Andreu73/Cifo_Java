package model;

import interfaces.IScreenObject;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public int x;
	public int y;
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.x = 0;
		this.y = 0;
	}

	public static void getKey() {
		
		Screen.randomNumbers();
		System.out.println(Screen.printRandomNumbers());
	}
	
	
	@Override
	public String toString() {
		return "Screen object [id=" + id + ", name=" + name + ", symbol=" + symbol + ", x=" + x + ", y=" + y + "]";
	}

	
	



}

