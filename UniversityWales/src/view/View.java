package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.PersonController;
import controller.StudentController;
import service.StudentDb;

public class View {
	
	public void start(Scanner input, StudentDb studentDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add student");
		options.put(2, "Add lecturer");
		options.put(3, "Quit");
		
		while(true) {
			
		showOptionsMenu(options);
		
		int option = askOption(input);
		
		if(option==1)
			addStudent(input, studentDb);
//		if(option==2)
//			addLecturer(input, studentDb);
//		else if(option==3)
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

}
