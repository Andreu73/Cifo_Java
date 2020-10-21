package model;

import java.util.ArrayList;

public class AirCompany {
	
	public String aircompanyCode;
	public static ArrayList<Airplane> airplanes;
	
	public AirCompany(String aircompanyCode) {
		super();
		this.aircompanyCode = aircompanyCode;
		airplanes = new ArrayList<Airplane>();
	}

	public static void setAirplanes(ArrayList<Airplane> airplanes) {
		AirCompany.airplanes = airplanes;
	}
	
	

}
