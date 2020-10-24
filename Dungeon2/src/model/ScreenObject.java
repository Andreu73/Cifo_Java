package model;

import interfaces.IScreenObject;

public class ScreenObject implements IScreenObject{
	
	public int id;
	public String name;
	public String symbol;
	public PositionXY positionxy;
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.positionxy = new PositionXY();
	}

	
	
	
	@Override
	public String toString() {
		return "ScreenObject [id=" + id + ", name=" + name + ", symbol=" + symbol + ", positionxy=" + positionxy + "]";
	}

	
	
}

