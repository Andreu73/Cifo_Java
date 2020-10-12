package lyyracard;

import java.util.ArrayList;

public class University {

	private String name;
	private static ArrayList<Student> students;
	
	public University(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		
		students.add(student);
	}
	
	public static Boolean checkStudent(String name) {
		
		for(Student student : students) {
			
			if(student.getName().equalsIgnoreCase(name))
				return true;
		}
		return false;
	}
	
	public static Student studentIdentification(String name) {
		
		for(Student student : students) {
			
			if(student.getName().equalsIgnoreCase(name))
				return student;
		}
		return null;
	}
	

}
