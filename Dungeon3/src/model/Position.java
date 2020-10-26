package model;

import java.util.Random;

import app.Main;
import interfaces.IScreenObject;

public class Position implements IScreenObject{
	
	public int x;
	public int y;
//	public String[][] position = new String [Main.LENGTH][Main.HEIGHT];
	public String[][] position;
	
	public Position() {
		super();
		initialNumberInLength();
		initialNumberInHeight();
		this.position = new String[x][y];
	}
	Random random = new Random();
	

	public void initialNumberInLength() {
		int numberLength = random.nextInt(Main.LENGTH);
		this.x=numberLength;
	}
	
	public void initialNumberInHeight() {
		int numberHeight = random.nextInt(Main.HEIGHT);
		this.y=numberHeight;
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String[][] getPosition() {
		return position;
	}

	

}
