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

	public static void setVaccines(ArrayList<Vaccine> vaccines) {
		VaccineDb.vaccines = vaccines;
	}
	
	public static void listTheVaccines() {
		String list = "";
		int count =1;
		for(Vaccine vaccineList : vaccines) {
			
			list = list + count +". "+ vaccineList;
			count++;
		}
		System.out.println(list);
	} 

}
