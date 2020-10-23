package service;

import java.util.ArrayList;

import model.Student;
import model.Vaccine;

public class StudentDb {
	
	public String name;
	public static ArrayList<Student> students;
	
	public StudentDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addStudentToDb(Student student) {
		
		students.add(student);
	}

	public static void setStudents(ArrayList<Student> students) {
		StudentDb.students = students;
	}
	
	public static void listTheStudents() {
		String list = "";
		int count =1;
		for(Student studentList : students) {
			
			list = list + count +". "+ studentList;
			count++;
		}
		System.out.println(list);
	} 

}
