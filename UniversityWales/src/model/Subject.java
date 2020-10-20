package model;

import java.util.HashMap;

public class Subject {
	
	public String name;
	public int courseOfStudy;
	public int numberOfStudents;
	public HashMap<Student, Double> studentsMark;
	
	public Subject(String name, int courseOfStudy, int numberOfStudents) {
		super();
		this.name = name;
		this.courseOfStudy = courseOfStudy;
		this.numberOfStudents = numberOfStudents;
		this.studentsMark = new HashMap<Student, Double>();
	}


}
