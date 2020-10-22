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
	
	public static void listOfAirplanes() {
		String list = "";
		int count =1;
		for(Airplane airplanesList : airplanes) {
			
			list = list + count +". "+ airplanesList;
			count++;
		}
		System.out.println(list);
	} 
	
	public static Airplane selectAirplane(int airplaneNumber) {

		for(Airplane airplanesList : airplanes) {
			
			if(airplanesList.getIdNumber()==airplaneNumber)
					return airplanesList;
		}
		return null;
	} 


}
