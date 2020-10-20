package main;

import java.util.Scanner;

import database.StudentDb;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		StudentDb studentDb = new StudentDb("Students'DataBase");
		
		Scanner input = new Scanner(System.in);
		View view = new View();
		view.start(input, studentDb);
		

	}

}
