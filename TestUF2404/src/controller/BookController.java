package controller;

import java.util.Scanner;

import model.Author;
import model.Book;
import service.AuthorDb;
import utilsIO.BookUtilsIO;

public class BookController {

	public static void addBookToDb(Scanner input) {
		
		String nameOfTheBook = askForTheName(input);
		Author author = askForTheAuthor(input);
		int yearOfTheBook = askForTheYear(input);
		String publisherOfTheBook = askForThePublisher(input);
		double costOfTheBook = askForTheCost(input);
		
		Book newBook = new Book(nameOfTheBook, author, yearOfTheBook, publisherOfTheBook, costOfTheBook);
		
		Author.addBookToDb(newBook);
		System.out.println("Book added!");
	}
		
	public static String askForTheName(Scanner input) {	
		
		String nameOfTheBook = BookUtilsIO.askForBookName(input);
		return nameOfTheBook;
	}
	
	public static Author askForTheAuthor(Scanner input) {	
		AuthorDb.listOfAuthors();
		
		int optionSelected1 = 0;	
		while(true) {
			try {
				System.out.println("Select an Author:");
				optionSelected1 = Integer.parseInt(input.next());
				break;
			}catch(Exception e) {
				System.out.println("Type a number, please!");
			}

		}
				
		String authorSelected = AuthorDb.authors.get(optionSelected1-1).getName();
		Author author = AuthorDb.selectAuthor(authorSelected);
		System.out.println(author);
		return author;
	}
	
	public static int askForTheYear(Scanner input) {	
		
		int yearOfTheBook = BookUtilsIO.askForBookYear(input);
		return yearOfTheBook;
		
	}
	
	public static String askForThePublisher(Scanner input) {	
		String publisherOfTheBook = BookUtilsIO.askForBookPublisher(input);
		return publisherOfTheBook;
		
	}
	
	public static double askForTheCost(Scanner input) {	
		double costOfTheBook = BookUtilsIO.askForBookCost(input);
		return costOfTheBook;
	}
	
	public static void listTheBooks() {
		
		Author.listTheBooks();
	}
	
	public static void listTheAuthors() {
		
		AuthorDb.listOfAuthors();
	}
}
