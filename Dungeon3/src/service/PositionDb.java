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
	
	public static Position isNotRepeatedPosition(Position position) {

		for(Position posit : positions) {
			
			if(posit.getX()==position.getX() && posit.getY()==position.getY());
			return posit;
		}
		return null;
	}
	

}
