package view;

import java.util.HashMap;
import java.util.Scanner;

import controller.BookController;
import service.AuthorDb;

public class View {
	
	public void start(Scanner input) {
		
		HashMap<Integer,String> options = new HashMap<>();
		options.put(1, "Create book");
		options.put(2, "List of books");
		options.put(3, "List of authors");
		options.put(4, "Quit");
		
		while(true) {
			
			showOptionsMenu(options);
			
			int option = askOption(input);
			
			if(option==1) {
				createBook(input);
			}else if(option==2) {
				listOfBooks();
			}else if(option==3) {
				listOfAuthors();
			}else if(option==4) {
				System.out.println("Menu off!");
				break;
			}
		}
	}
	
	public static int askOption(Scanner input) {
		
		int option = 0;		
		try {
			System.out.println("Select an option:");
			option = Integer.parseInt(input.next());
		}catch(Exception e) {
			System.out.println("Type a number!");
		}
		return option;
	}
	
	public static void showOptionsMenu(HashMap<Integer,String> options) {
		
		System.out.println("---------------------");
		for(Integer option : options.keySet()) {
			
			System.out.println(option + " " + options.get(option));
		}
		System.out.println("---------------------");
	}
	
	public static void createBook(Scanner input) {
		
		BookController.addBookToDb(input);

	}

	public static void listOfBooks() {
		
		BookController.listTheBooks();

	}
	
	public static void listOfAuthors() {
		
		BookController.listTheAuthors();

	}
}
