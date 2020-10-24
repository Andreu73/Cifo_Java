package model;

public class Hunter extends ScreenObject{
	
	public static int pointsHunter;
	
	public Hunter(String name, String symbol) {
		super(name, symbol);
		
		pointsHunter = 0;
		placeHunterInitialX();
		placeHunterInitialY();
		}

//	public int x = 0;
//	public int y = 0;


	
	
	public int placeHunterInitialX() {

		int x = 0;
		return x;
	}

	public int placeHunterInitialY() {
		int y = 0;
		return y;
	}

}
