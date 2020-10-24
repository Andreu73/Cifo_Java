package service;

import java.util.ArrayList;

import model.PositionXY;

public class PositionXYDb {

	public String name;
	public static ArrayList<PositionXY> positionsXY ;
	
	public PositionXYDb(String name) {
		super();
		this.name = name;
		positionsXY = new ArrayList<>();
	}

//	public static Boolean checkPositionXYToDb(String[][] positionXY) {
//
//		for(PositionXY position : positionsXY) {
//			
//			if(position.getPosition().equals(positionXY)) {
//				
//				return true;
//			}
//		}
//		return false;
//	}

	public static void addPositionXYToDb(PositionXY positionXY) {
				
		positionsXY.add(positionXY);

		}	

	public static String listAllPositionsXY() {
		
		String listOfPositionsXY = "";
		int count=1;
		for(PositionXY positions : positionsXY) {
			
			listOfPositionsXY = listOfPositionsXY + count + ". "  +positions +"\n";
			count++;
		}
		return listOfPositionsXY;
	}

	
}
