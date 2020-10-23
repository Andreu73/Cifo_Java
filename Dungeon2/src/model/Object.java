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
		this.x = Screen.randomNumberInLength();
		this.y = Screen.randomNumberInHeight();
	}

	
}
