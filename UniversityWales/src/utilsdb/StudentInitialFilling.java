package utilsdb;

import java.util.ArrayList;

import model.Date;
import model.Student;
import service.ApartmentDb;
import service.PetDb;
import service.StudentDb;
import service.SubjectDb;

public class StudentInitialFilling {
	
	public static void studentDbPreFilling() {
	
	ArrayList<Student> students = new ArrayList<>();
	
	students.add(new Student("Peter", "NZ", new Date("03042002"), 1, ApartmentDb.apartments.get(0), PetDb.pets.get(0)));
	students.add(new Student("Paul", "Australia", new Date("03042002"), 1, ApartmentDb.apartments.get(1), PetDb.pets.get(1)));
	students.add(new Student("Mary", "Ireland", new Date("03041998"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(2)));
	students.add(new Student("Anne", "USA", new Date("03042001"), 1, ApartmentDb.apartments.get(2), PetDb.pets.get(3)));
	
	StudentDb.setStudents(students);
	
	StudentDb.students.get(0).addSubjectsToStudent(SubjectDb.subjects.get(0));
	StudentDb.students.get(0).addSubjectsToStudent(SubjectDb.subjects.get(1));
	StudentDb.students.get(0).addSubjectsToStudent(SubjectDb.subjects.get(2));
	StudentDb.students.get(0).addSubjectsToStudent(SubjectDb.subjects.get(3));
	
	StudentDb.students.get(1).addSubjectsToStudent(SubjectDb.subjects.get(0));
	StudentDb.students.get(1).addSubjectsToStudent(SubjectDb.subjects.get(1));
	StudentDb.students.get(1).addSubjectsToStudent(SubjectDb.subjects.get(2));
	StudentDb.students.get(1).addSubjectsToStudent(SubjectDb.subjects.get(3));
	
	StudentDb.students.get(2).addSubjectsToStudent(SubjectDb.subjects.get(0));
	StudentDb.students.get(2).addSubjectsToStudent(SubjectDb.subjects.get(1));
	StudentDb.students.get(2).addSubjectsToStudent(SubjectDb.subjects.get(2));
	StudentDb.students.get(2).addSubjectsToStudent(SubjectDb.subjects.get(3));
	
	StudentDb.students.get(3).addSubjectsToStudent(SubjectDb.subjects.get(0));
	StudentDb.students.get(3).addSubjectsToStudent(SubjectDb.subjects.get(1));
	StudentDb.students.get(3).addSubjectsToStudent(SubjectDb.subjects.get(2));
	StudentDb.students.get(3).addSubjectsToStudent(SubjectDb.subjects.get(3));
	
	
	}

}
