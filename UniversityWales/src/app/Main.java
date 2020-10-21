package app;

import java.util.Scanner;

import service.ApartmentDb;
import service.StudentDb;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		StudentDb studentDb = new StudentDb("Students'DataBase");
		ApartmentDb apartmentDb = new ApartmentDb("Apartments' Database");
		
		Scanner input = new Scanner(System.in);
		View view = new View();
		view.start(input, studentDb, apartmentDb);
		
	}

}