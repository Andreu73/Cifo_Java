package utilsdb;

import java.util.ArrayList;

import model.Date;
import model.Student;
import service.ApartmentDb;
import service.PetDb;

public class StudentInitialFilling {
	
	public static void studentDbPreFilling() {
	
	ArrayList<Student> students = new ArrayList<>();
	
	students.add(new Student("Peter", "NZ", new Date("03042002"), 1, ApartmentDb.apartments.get(0), PetDb.pets.get(0)));
	students.add(new Student("Paul", "Australia", new Date("03042002"), 1, ApartmentDb.apartments.get(1), PetDb.pets.get(1)));
	students.add(new Student("Mary", "Ireland", new Date("03041998"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	students.add(new Student("Anne", "USA", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(3)));
	
	}

}
