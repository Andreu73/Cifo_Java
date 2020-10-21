package utilsdb;

import java.util.ArrayList;

import model.Date;
import model.Lecturer;
import model.Student;
import service.ApartmentDb;
import service.PetDb;
import service.SubjectDb;

public class LecturerInitialFilling {
	
	public static void lecturerDbPreFilling() {
		
	ArrayList<Lecturer> lecturers = new ArrayList<>();
	
	lecturers.add(new Lecturer("Matias", "Argentina", new Date("03121973"), 1, 64, SubjectDb.subjects.get(0)));
	lecturers.add(new Lecturer("Rajiv", "India", new Date("03021979"), 14, 22, SubjectDb.subjects.get(1)));
	lecturers.add(new Lecturer("Lisa", "USA", new Date("11121980"), 15, 89, SubjectDb.subjects.get(2)));
	lecturers.add(new Lecturer("Rosa", "Cuba", new Date("02071985"), 23, 3, SubjectDb.subjects.get(3)));
	
	}

}