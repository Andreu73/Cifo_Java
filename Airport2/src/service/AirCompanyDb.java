package service;

import java.util.ArrayList;

import model.AirCompany;

public class AirCompanyDb {
	
	public String name;
	public static ArrayList<AirCompany> aircompanies;
	
	public AirCompanyDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addAirCompanyToDb(AirCompany airCompany) {
		
		aircompanies.add(airCompany);
	}

	public static void setAircompanies(ArrayList<AirCompany> aircompanies) {
		AirCompanyDb.aircompanies = aircompanies;
	}
	

}
