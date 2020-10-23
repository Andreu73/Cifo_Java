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
			
			Vampire newVampire = new Vampire("Vampire1","V", 3);
			vampires.add(newVampire);
		}
	}
	
	public static String listAllVampires() {
		
		String listOfVampires = "";
		int count=0;
		for(Vampire vamps : vampires) {
			
			listOfVampires = count + ". " +listOfVampires + vamps +"\n";
			count++;
		}
		return listOfVampires;
	}
	
}
