package model;

import java.util.ArrayList;

public class Pet {
	
	public String petName;
	public String kindOfAnimal;
	public int age;
	public static ArrayList<Vaccine> vaccines;
	
	public Pet(String petName, String kindOfAnimal, int age) {
		super();
		this.petName = petName;
		this.kindOfAnimal = kindOfAnimal;
		this.age = age;
		vaccines = new ArrayList<Vaccine>();
	}

}
