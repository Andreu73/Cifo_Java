package controller;

import java.util.Scanner;

import service.StudentDb;
import utils.UtilsIOPerson;

public class PersonController {

	public static void addPersonToDb(Scanner input, StudentDb studentDb) {

	String name = UtilsIOPerson.askForPersonName(input);
	String countryOfOrigin = UtilsIOPerson.askForPersonCountryOfOrigin(input);
	String birthday = UtilsIOPerson.askForPersonBirthday(input);
	
    }
	
}
