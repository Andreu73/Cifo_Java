package model;

public class Hunter extends ScreenObject{
	
	public static int pointsHunter;
	
	public Hunter(String name, String symbol) {
		super(name, symbol);
		
		pointsHunter = 0;
		
		}

//	public int x = 0;
//	public int y = 0;


	
	@Override
	public PositionXY initialPosition() {

		int x = 0;
		int y = 0;
		PositionXY newPosition = new PositionXY(x, y);
		return newPosition;
	}


}
