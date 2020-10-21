package service;

import java.util.ArrayList;

import model.Lecturer;

public class LecturerDb {
	
	public String name;
	public static ArrayList<Lecturer> lecturers;
	
	public LecturerDb(String name) {
		super();
		this.name = name;
		lecturers = new ArrayList<Lecturer>();
	}
	
	public static void addLecturerToDb(Lecturer lecturer) {
		
		lecturers.add(lecturer);
	}

}
