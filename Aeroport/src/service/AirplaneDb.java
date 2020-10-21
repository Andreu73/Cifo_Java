package service;

import java.util.ArrayList;

import model.Airplane;

public class AirplaneDb {
	
	public String name;
	public static ArrayList<Airplane> airplanes;
	
	public AirplaneDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addAirplaneToDb(Airplane airplane) {
		
		airplanes.add(airplane);
	}

	public static void setAirplanes(ArrayList<Airplane> airplanes) {
		AirplaneDb.airplanes = airplanes;
	}
	


}
