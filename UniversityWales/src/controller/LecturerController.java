package controller;

import java.util.Scanner;

import service.LecturerDb;
import utils.UtilsIOLecturer;

public class LecturerController {

	public static void addLecturerToDb(Scanner input, LecturerDb lecturerDb) {
		
		int officeNumber = UtilsIOLecturer.askForOfficeNumber(input);
		int parkingLotNumber = UtilsIOLecturer.askForParkingLotNumber(input);
		
	}
	
}
