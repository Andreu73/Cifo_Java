package app;

import java.util.Scanner;

import service.ApartmentDb;
import service.LecturerDb;
import service.PetDb;
import service.StudentDb;
import service.SubjectDb;
import service.VaccineDb;
import utilsdb.ApartmentInitialFilling;
import utilsdb.LecturerInitialFilling;
import utilsdb.PetInitialFilling;
import utilsdb.StudentInitialFilling;
import utilsdb.SubjectInitialFilling;
import utilsdb.VaccineInitialFilling;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		StudentDb studentDb = new StudentDb("Students' DataBase");
		LecturerDb lecturerDb = new LecturerDb("Lecturers' Database");
		ApartmentDb apartmentDb = new ApartmentDb("Apartments Database");
		PetDb petDb = new PetDb("Pets' DataBase");
		VaccineDb vaccineDb = new VaccineDb("Vaccine Database");
		SubjectDb subjectDb = new SubjectDb("Subject Database");
		
		VaccineInitialFilling.vaccineDbPreFilling();
		PetInitialFilling.petDbPreFilling();
		ApartmentInitialFilling.apartmentDbPreFilling();
		StudentInitialFilling.studentDbPreFilling();
		LecturerInitialFilling.lecturerDbPreFilling();
		SubjectInitialFilling.subjectDbPreFilling();

		Scanner input = new Scanner(System.in);
		View view = new View();
		view.start(input, studentDb, apartmentDb, petDb, vaccineDb, lecturerDb, subjectDb);
		
	}

}
