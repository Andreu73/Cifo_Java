package service;

import java.util.ArrayList;

import model.Hunter;

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

}
