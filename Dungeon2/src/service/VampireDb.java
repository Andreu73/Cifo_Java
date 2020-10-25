package service;

import java.util.ArrayList;

import app.Main;
import model.Vampire;

public class VampireDb {


	public String name;
	public static ArrayList<Vampire> vampires ;
	
	public VampireDb(String name) {
		super();
		this.name = name;
		vampires = new ArrayList<>();
	}
	
	public static void addVampireToDb(Vampire vampire) {

		vampires.add(vampire);
	}
	
	public static String listAllVampires() {
		
		String listOfVampires = "";
		int count=1;
		for(Vampire vamps : vampires) {
			
			listOfVampires = listOfVampires + count + ". "  +vamps +"\n";
			count++;
		}
		return listOfVampires;
	}
	
	public static void createInitialVampires() {
		for (int i = 0; i < Main.VAMPIRES; i++) {
		
		vampires.add(new Vampire("Vampire","V",5));
		}
	}

	public static void createNewVampire() {

		vampires.add(new Vampire("sf","W",3));
	}
	
	public static void removeVampire(Vampire vampire) {

		vampires.remove(vampire);

	}
}
