package controller;

import java.util.Scanner;

import model.Date;
import model.Vaccine;
import service.VaccineDb;
import utils.UtilsIOVaccine;

public class VaccineController {

	public static void addVaccineToDb(Scanner input, VaccineDb vaccineDb) {
		
		String vaccineDay = UtilsIOVaccine.askForVaccineDay(input);
		String kindOfVaccine = UtilsIOVaccine.askForKindOfVaccine(input);
		String vaccineResult = UtilsIOVaccine.askForVaccineResult(input);
		
		Vaccine newVaccine = new Vaccine(new Date(vaccineDay), kindOfVaccine, vaccineResult);
		VaccineDb.addVaccineToDb(newVaccine);
		
	}
}
