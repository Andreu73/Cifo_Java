package model;

import java.util.HashMap;

public class Subject {
	
	public String name;
	public int courseOfStudy;
	public int numberOfStudents;
	public Lecturer lecturer;
	public HashMap<Student, Double> studentsMark;
	
	public Subject(String name, int courseOfStudy, int numberOfStudents, Lecturer lecturer, HashMap<Student,Double> studentsMark) {
		super();
		this.name = name;
		this.courseOfStudy = courseOfStudy;
		this.numberOfStudents = numberOfStudents;
		this.lecturer = lecturer;
		this.studentsMark = studentsMark;
	}


}
