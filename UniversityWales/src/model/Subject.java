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
	
	public void setStudentsMark(HashMap<Student, Double> studentsMark) {
		this.studentsMark = studentsMark;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", courseOfStudy=" + courseOfStudy + ", numberOfStudents=" + numberOfStudents
				+ ", lecturer=" + lecturer + ", studentsMark=" + studentsMark + "]\n";
	}
	
	
	
	
	
}
