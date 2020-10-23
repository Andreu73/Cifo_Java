package service;

import java.util.ArrayList;

import model.Lecturer;
import model.Vaccine;

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

	public static void setLecturers(ArrayList<Lecturer> lecturers) {
		LecturerDb.lecturers = lecturers;
	}


	public static void listTheLecturers() {
		String list = "";
		int count =1;
		for(Lecturer lecturerList : lecturers) {
			
			list = list + count +". "+ lecturerList;
			count++;
		}
		System.out.println(list);
	} 
	
}
