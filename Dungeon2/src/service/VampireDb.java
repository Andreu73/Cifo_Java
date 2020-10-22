package service;

import java.util.ArrayList;
import model.Vampire;

public class VampireDb {

	final static int VAMPIRES = 3;
	final static boolean VAMPIRES_MOVE = true;
	public String name;
	public static ArrayList<Vampire> vampires ;
	
	public VampireDb(String name) {
		super();
		this.name = name;
		vampires = new ArrayList<>();
	}
	
	public static void addVampireToDb() {

		for(int i = 0; i< VAMPIRES; i++) {
			
			Vampire newVampire = new Vampire("V");
			vampires.add(newVampire);
		}
	}
	
}
