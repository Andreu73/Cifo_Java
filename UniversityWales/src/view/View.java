package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.ApartmentController;
import controller.LecturerController;
import controller.PetController;
import controller.StudentController;
import controller.VaccineController;
import service.ApartmentDb;
import service.LecturerDb;
import service.PetDb;
import service.StudentDb;
import service.SubjectDb;
import service.VaccineDb;

public class View {
	
	public void start(Scanner input, StudentDb studentDb, ApartmentDb apartmentDb, 
			PetDb petDb, VaccineDb vaccineDb, LecturerDb lecturerDb, SubjectDb subjectDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add student");
		options.put(2, "Add lecturer");
		options.put(3, "Add apartment");
		options.put(4, "Add pet");
		options.put(5, "Add vaccine");
		options.put(6, "Show data");
		options.put(7, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				addStudent(input, studentDb);
			}else if(option==2) {
				addLecturer(input, lecturerDb);
			}else if(option==3) {
				addApartment(input, apartmentDb);
			}else if(option==4) {
				addPet(input, petDb);
			}else if(option==5) {
				addVaccine(input, vaccineDb);
			}else if(option==6) {
				showData(input, studentDb, apartmentDb, petDb, vaccineDb, 
						lecturerDb, subjectDb);
			}else if(option==7) {
				System.out.println("Menu !");
				break;	
			}
		}
	}
	
	public void showData(Scanner input, StudentDb studentDb, ApartmentDb apartmentDb, 
			PetDb petDb, VaccineDb vaccineDb, LecturerDb lecturerDb, SubjectDb subjectDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Show students");
		options.put(2, "Show lecturers");
		options.put(3, "Show apartments");
		options.put(4, "Show pets");
		options.put(5, "Show vaccines");
				options.put(7, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				showStudents(input, studentDb);
			}else if(option==2) {
//				showLecturers(input, lecturerDb);
//			}else if(option==3) {
//				showApartments(input, apartmentDb);
//			}else if(option==4) {
//				showPets(input, petDb);
			}else if(option==5) {
				showVaccines(input, vaccineDb);
			}else if(option==7) {
				break;	
			}
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
	
	public static void addLecturer(Scanner input, LecturerDb lecturerDb) {
		
		LecturerController.addLecturerToDb(input, lecturerDb);
		
	}
	
	public static void addApartment(Scanner input, ApartmentDb apartmentDb) {
		
		ApartmentController.addApartmentToDb(input, apartmentDb);
		
	}
	
	public static void addPet(Scanner input, PetDb petDb) {
		
		PetController.addPetToDb(input, petDb);
		
	}

	public static void addVaccine(Scanner input, VaccineDb vaccineDb) {
		
		VaccineController.addVaccineToDb(input, vaccineDb);
		
	}
	
	public static void showVaccines(Scanner input, VaccineDb vaccineDb) {
		
		VaccineController.listTheVaccines();
		
	}
	
	public static void showStudents(Scanner input, StudentDb studentDb) {
		
		StudentController.listTheStudents();
		
	}
	
}
