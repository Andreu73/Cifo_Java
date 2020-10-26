package service;

import java.util.ArrayList;

import app.Main;
import model.Position;
import model.Vampire;

public class PositionDb {

	public String name;
	public static ArrayList<Position> positions ;
	
	public PositionDb(String name) {
		super();
		this.name = name;
		positions = new ArrayList<>();
	}
	
	public static void addPositionToDb(Position position) {

		positions.add(position);
	}
	
//	public static String listAllPositions() {
//
//		for(Position position : positions) {
//			
//			position;
//		}
//		return position;
//	}
	

}
