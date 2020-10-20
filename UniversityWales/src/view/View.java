package view;

import java.util.HashMap;
import java.util.Scanner;
import database.StudentDb;

public class View {
	
	public int askOption(Scanner input) {
		
		System.out.println("Select an option:");
		int option = input.nextInt();
		return option;
	}
	
	public static void showOptionsMenu(HashMap<Integer,String> options) {
		
		System.out.println("---------------------");
		for(Integer option : options.keySet()) {
			
			System.out.println(option + options.get(option));
		}
		System.out.println("---------------------");
	}
	
	public void start(Scanner input, StudentDb studentDb) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Add student");
		options.put(2, "Quit");
		

		
		while(true) {
			
		showOptionsMenu(options);
		
		int option = askOption(input);
		
		
		}
	}

}
