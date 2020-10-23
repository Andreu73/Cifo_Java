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
	
}
