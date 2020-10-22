package model;

import java.util.ArrayList;

public class AirCompany {
	
	public int airCompanyCodeNumber;
	public String airCompanyName;
	public static ArrayList<Airplane> airplanes;

	public AirCompany(String airCompanyName) {
		super();
		this.airCompanyCodeNumber = hashCode();
		this.airCompanyName = airCompanyName;
		airplanes = new ArrayList<Airplane>();
	}

	public String getAirCompanyName() {
		return airCompanyName;
	}
	
	public static void setAirplanes(ArrayList<Airplane> airplanes) {
		AirCompany.airplanes = airplanes;
	}

	@Override
	public String toString() {
		return "AirCompany [CodeNumber: " + airCompanyCodeNumber + ", Name: " + airCompanyName + "]\n";
	}
	
	

}
