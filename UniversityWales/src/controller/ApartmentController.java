package controller;

import java.util.Scanner;

import service.ApartmentDb;
import utils.UtilsIOApartment;

public class ApartmentController {
	
	public static void addApartmentToDb(Scanner input, ApartmentDb apartmentDb) {

	String blockName = UtilsIOApartment.askForBlockName(input);
	int apartmentNumber = UtilsIOApartment.askForApartmentNumber(input);
	int roomNumber = UtilsIOApartment.askForRoomNumber(input);
	int roomPlaces = UtilsIOApartment.askForRoomPlaces(input);
	
	}
	
}
