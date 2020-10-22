package model;

import java.util.ArrayList;

public class AirCompany {
	
	public int airCompanyCodeNumber;
	public String airCompanyCode;
	public static ArrayList<Airplane> airplanes;
	
	public AirCompany(String airCompanyCode) {
		super();
		this.airCompanyCodeNumber = hashCode();
		this.airCompanyCode = airCompanyCode;
		airplanes = new ArrayList<Airplane>();
	}

	public static void setAirplanes(ArrayList<Airplane> airplanes) {
		AirCompany.airplanes = airplanes;
	}
	
	

}
