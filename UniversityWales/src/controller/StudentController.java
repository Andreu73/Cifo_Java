package controller;

import java.util.Scanner;

import database.StudentDb;
import model.Date;
import utils.UtilsIOPerson;

public class StudentController {
	
	public static void addStudentToDb(Scanner input, StudentDb studentDb) {
		
		String name = UtilsIOPerson.askForPersonName(input);
		String countryOfOrigin = UtilsIOPerson.askForPersonCountryOfOrigin(input);
//		Date birthdayGiven = UtilsIOPerson.askForPersonBirthday(input);
		String birthday = UtilsIOPerson.askForPersonBirthday(input);
		
		System.out.println(birthday);
	}

}
