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
	
//	public static void listAllVampires() {
//
//		for(Vampire vamps : vampires) {
//			
//			vamps
//		}
//	}
	
	public static void createInitialVampires() {
		for (int i = 0; i < Main.VAMPIRES; i++) {
		
		vampires.add(new Vampire("Vampire","V",5));
		}
	}

	public static void createNewVampire() {

		vampires.add(new Vampire("Vampire","W",3));
	}
	
	public static void removeVampire(Vampire vampire) {

		vampires.remove(vampire);

	}
	
	public static int pointsVampire(Vampire vampire) {
		
		for(Vampire vamp : vampires) {
			
			if(vamp.equals(vampire)) {
				return vamp.getPointsObject();
			}
		}
		return 0;
	}
}
