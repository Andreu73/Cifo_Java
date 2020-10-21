package service;

import java.util.ArrayList;

import model.Apartment;

public class ApartmentDb {
	
	public String name;
	public static ArrayList<Apartment> apartments;
	
	public ApartmentDb(String name) {
		super();
		this.name = name;
	}

	public static void setApartments(ArrayList<Apartment> apartments) {
		ApartmentDb.apartments = apartments;
	}
	
	

}
