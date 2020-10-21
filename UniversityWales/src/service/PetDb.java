package service;

import java.util.ArrayList;

import model.Pet;

public class PetDb {
	
	private String name;
	private static ArrayList<Pet> pets;
	
	public PetDb(String name) {
		super();
		this.name = name;
	}

}
