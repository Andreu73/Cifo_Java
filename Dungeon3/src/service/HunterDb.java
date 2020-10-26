package service;

import java.util.ArrayList;

import model.Hunter;
import model.Vampire;

public class HunterDb {

	public String name;
	public static ArrayList<Hunter> hunters ;
	
	public HunterDb(String name) {
		super();
		this.name = name;
		hunters = new ArrayList<>();
	}
	
	public static void addHunterToDb(Hunter hunter) {

		hunters.add(hunter);
	}
	
//	public static String listAllHunters() {
//		
//		String listOfHunters = "";
//		int count=1;
//		for(Hunter hunters : hunters) {
//			
//			listOfHunters = listOfHunters + count + ". "  +hunters +"\n";
//			count++;
//		}
//		return listOfHunters;
//	}
	
//	public static void createHunter() {
//		for (int i = 0; i < 1; i++) {
//		
//		Hunter newHunter = new Hunter("Hunter","@");
//		HunterDb.addHunterToDb(newHunter);
//		}
//	}

	
}

