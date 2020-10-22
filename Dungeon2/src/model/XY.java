package model;

import java.util.Random;

public class XY {
	
	public int x;
	public int y;

	public XY() {
		super();
		this.x = placeVampiresX();
		this.y = placeVampiresY();
	}
	
	public int placeVampiresX() {
		
		Random randomNumber = new Random(1);
		int x = randomNumber.nextInt();
		return x;
	}
	
	public int placeVampiresY() {
		
		Random randomNumber = new Random(10);
		int y = randomNumber.nextInt();
		return y;
	}

}
