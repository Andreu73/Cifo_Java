package model;

public class Subject {
	
	public String name;
	public int courseOfStudy;
	public int numberOfStudents;
	
	public Subject(String name, int courseOfStudy, int numberOfStudents) {
		super();
		this.name = name;
		this.courseOfStudy = courseOfStudy;
		this.numberOfStudents = numberOfStudents;
	}
	
	@Override
	public String toString() {
		return "Subject [name: " + name + ", course of study: " + courseOfStudy + ", number of students: " + numberOfStudents
				+ "]";
	}

}
