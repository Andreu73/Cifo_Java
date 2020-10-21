package utilsdb;

import java.util.ArrayList;
import java.util.HashMap;

import model.Student;
import model.Subject;
import service.LecturerDb;
import service.StudentDb;

public class SubjectInitialFilling {
	
	public void subjectDbPreFilling() {
		
	HashMap<Student,Double> studentsMarkLinguistics = new HashMap<>();
	studentsMarkLinguistics.put(StudentDb.students.get(0), 5.9);
	studentsMarkLinguistics.put(StudentDb.students.get(1), 7.1);
	studentsMarkLinguistics.put(StudentDb.students.get(2), 10.0);
	studentsMarkLinguistics.put(StudentDb.students.get(3), 3.4);

	HashMap<Student,Double> studentsMarkPhysics = new HashMap<>();
	studentsMarkPhysics.put(StudentDb.students.get(0), 5.2);
	studentsMarkPhysics.put(StudentDb.students.get(1), 7.8);
	studentsMarkPhysics.put(StudentDb.students.get(2), 9.0);
	studentsMarkPhysics.put(StudentDb.students.get(3), 5.4);
	
	HashMap<Student,Double> studentsMarkComputering = new HashMap<>();
	studentsMarkComputering.put(StudentDb.students.get(0), 4.2);
	studentsMarkComputering.put(StudentDb.students.get(1), 8.8);
	studentsMarkComputering.put(StudentDb.students.get(2), 9.5);
	studentsMarkComputering.put(StudentDb.students.get(3), 6.8);
	
	HashMap<Student,Double> studentsMarkMaths = new HashMap<>();
	studentsMarkMaths.put(StudentDb.students.get(0), 3.0);
	studentsMarkMaths.put(StudentDb.students.get(1), 5.8);
	studentsMarkMaths.put(StudentDb.students.get(2), 6.0);
	studentsMarkMaths.put(StudentDb.students.get(3), 4.4);
	
	ArrayList<Subject> subjects = new ArrayList<>();
	subjects.add(new Subject("Linguistics", 2, 4, LecturerDb.lecturers.get(0), studentsMarkLinguistics));
	subjects.add(new Subject("Physics", 3, 4, LecturerDb.lecturers.get(1), studentsMarkLinguistics));
	subjects.add(new Subject("Computering", 2, 4, LecturerDb.lecturers.get(2), studentsMarkComputering));
	subjects.add(new Subject("Mathematics", 2, 4, LecturerDb.lecturers.get(3), studentsMarkMaths));
	
	}
}