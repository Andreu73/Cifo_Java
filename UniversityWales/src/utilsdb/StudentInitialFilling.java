package utilsdb;

import java.util.ArrayList;

import model.Date;
import model.Student;
import service.ApartmentDb;
import service.PetDb;

public class StudentInitialFilling {
	
	public static void studentDbPreFilling() {
	
	ArrayList<Student> students = new ArrayList<>();
	
	students.add(new Student("Peter", 18, "NZ", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	students.add(new Student("Paul", 18, "USA", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	students.add(new Student("Mary", 22, "NZ", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	students.add(new Student("Anne", 19, "USA", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	
	}

}
