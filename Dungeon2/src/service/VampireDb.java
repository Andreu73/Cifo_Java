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
	
//	public static void addVampireToDb() {
//
//		for(int i = 0; i < Main.VAMPIRES; i++) {
//			
//			Vampire newVampire = new Vampire("Vampire","V", 3);
//			vampires.add(newVampire);
//		}
//	}
	
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
