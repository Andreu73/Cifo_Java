package controller;

import java.util.Scanner;

import service.StudentDb;
import utils.UtilsIOPerson;

public class StudentController {
	
	public static void addStudentToDb(Scanner input, StudentDb studentDb) {
		
		String name = UtilsIOPerson.askForPersonName(input);
		String countryOfOrigin = UtilsIOPerson.askForPersonCountryOfOrigin(input);
		String birthday = UtilsIOPerson.askForPersonBirthday(input);
		
	}
	
	public static void listTheStudents() {
		
		StudentDb.listTheStudents();
	}

}
