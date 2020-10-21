package model;

import java.util.ArrayList;

public class Student extends Person{

	public int courseYear;
	public Apartment apartment;
	public Pet pet;
	public static ArrayList<Subject> subjects;
//	public static ArrayList<Card> cards;
	
	public Student(String name, int age, String countryOfOrigin, Date birthday, 
			int courseYear, Apartment apartment, Pet pet) {
		super(name, age, countryOfOrigin, birthday);
		this.courseYear = courseYear;
		this.pet = pet;
		subjects = new ArrayList<Subject>();
//		cards = new ArrayList<Card>();
	}

	
}
