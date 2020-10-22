package model;

import java.util.ArrayList;

public class Airport {
	
	public int airportId;
	public String airportCity;
	public String airportCode;
	public static ArrayList<AirCompany> aircompanies;

	public Airport(String airportCity, String airportCode) {
		super();
		this.airportId = hashCode();
		this.airportCity = airportCity;
		this.airportCode = airportCode;
		aircompanies = new ArrayList<AirCompany>();
	}

	public int getAirportId() {
		return airportId;
	}

	@Override
	public String toString() {
		return "Airport [City: " + airportCity + ", Code: " + airportCode + "]\n";
	}

	
}
