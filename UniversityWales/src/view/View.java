package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.ApartmentController;
import controller.StudentController;
import controller.VaccineController;
import service.ApartmentDb;
import service.LecturerDb;
import service.StudentDb;
import service.VaccineDb;

public class View {
	
	public void start(Scanner input, StudentDb studentDb, ApartmentDb apartmentDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add student");
		options.put(2, "Add lecturer");
		options.put(3, "Add apartment");
		options.put(4, "Add vaccine");
		options.put(5, "Quit");
		
		while(true) {
			
		showOptionsMenu(options);
		
		int option = askOption(input);
		
		if(option==1)
			addStudent(input, studentDb);
//		if(option==2)
//			addLecturer(input, studentDb);
//		else if(option==3)
		if(option==3)
			addApartment(input, apartmentDb);
			break;
		
		}
	}
	
	public int askOption(Scanner input) {
		
		int option = 0;		
		try {
			System.out.println("Select an option:");
			option = Integer.parseInt(input.next());
		}catch(Exception e) {
			System.out.println("Type a number!");
		}
		return option;
	}
	
	public static void showOptionsMenu(HashMap<Integer,String> options) {
		
		System.out.println("---------------------");
		for(Integer option : options.keySet()) {
			
			System.out.println(option + " " + options.get(option));
		}
		System.out.println("---------------------");
	}
	

	public static void addStudent(Scanner input, StudentDb studentDb) {
		
		StudentController.addStudentToDb(input, studentDb);
		
	}
	
//	public static void addLecturer(Scanner input, LecturerDb lecturerDb) {
//		
//		StudentController.addLecturerToDb(input, lecturerDb);
//		
//	}
	
	public static void addApartment(Scanner input, ApartmentDb apartmentDb) {
		
		ApartmentController.addApartmentToDb(input, apartmentDb);
		
	}

	public static void addVaccine(Scanner input, VaccineDb vaccineDb) {
		
		VaccineController.addVaccineToDb(input, vaccineDb);
		
	}
}
