package model;

import interfaces.IObject;

public class Object implements IObject{
	
	public int id;
	public String name;
	public String symbol;
	public int x;
	public int y;
	
	public Object(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.x = placeObjectInitialX();
		this.y = placeObjectInitialY();
	}

	public int placeObjectInitialX() {

		int x = (int)(Math.random()*(10 - 1)) + 1;
		return x;
	}
	
	public int placeObjectInitialY() {
		int y = (int)(Math.random()*(10 - 1)) + 1;
		return y;
	}
	
}
