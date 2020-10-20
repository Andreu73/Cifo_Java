package database;

import java.util.ArrayList;

import model.Subject;

public class SubjectDb {

	public String name;
	public static ArrayList<Subject> subjects;
	
	public SubjectDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addSubjectToDb(Subject subject) {
		
		subjects.add(subject);
	}

}
