package model;

import java.util.ArrayList;

public class Student extends Person{

	public int courseYear;
	public Apartment apartment;
	public Pet pet;
	public ArrayList<Subject> subjects;
//	public static ArrayList<Card> cards;
	
	public Student(String name, String countryOfOrigin, Date birthday, 
			int courseYear, ArrayList<Subject> subjects, Apartment apartment, Pet pet) {
		super(name, countryOfOrigin, birthday);
		this.courseYear = courseYear;
		this.apartment = apartment;
		this.pet = pet;
		this.subjects = subjects;
//		cards = new ArrayList<Card>();
	}

	public void addSubjectsToStudent(Subject subject) {
		this.subjects.add(subject);
	}

	
}
