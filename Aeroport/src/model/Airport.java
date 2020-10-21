package model;

import java.util.ArrayList;

public class Airport {
	
	public String airportCity;
	public String airportCode;
	public static ArrayList<AirCompany> aircompanies;

	public Airport(String airportCity, String airportCode) {
		super();
		this.airportCity = airportCity;
		this.airportCode = airportCode;
		aircompanies = new ArrayList<AirCompany>();
	}

	
}
