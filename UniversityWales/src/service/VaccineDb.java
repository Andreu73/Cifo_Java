package service;

import java.util.ArrayList;

import model.Vaccine;

public class VaccineDb {

	public String name;
	public static ArrayList<Vaccine> vaccines;
	
	public VaccineDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addVaccineToDb(Vaccine vaccine) {
		
		vaccines.add(vaccine);
	}
}
