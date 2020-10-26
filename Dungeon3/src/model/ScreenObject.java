package model;

import java.util.Random;

import service.HunterDb;
import service.VampireDb;

public class ScreenObject {
	
	public int id;
	public String name;
	public String symbol;
	public Position position;
	Random random = new Random();
	
	public ScreenObject(String name, String symbol) {
		super();
		this.id = hashCode();
		this.name = name;
		this.symbol = symbol;
		this.position = new Position();
		
	}	
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	

}

