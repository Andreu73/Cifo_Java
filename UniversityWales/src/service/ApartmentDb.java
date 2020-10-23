package service;

import java.util.ArrayList;

import model.Apartment;
import model.Vaccine;

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
	
	
	public static void listTheApartments() {
		String list = "";
		int count =1;
		for(Apartment apartmentList : apartments) {
			
			list = list + count +". "+ apartmentList;
			count++;
		}
		System.out.println(list);
	} 
}
