package controller;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import model.Book;
import repository.BookRepository;

public class BookRepositoryController {
	
	public static void listAllBooks(BookRepository bookRepository) {
		
		List<Book> books = bookRepository.findAll();
		System.out.println("Books:");
		for (Book booksToPrint : books) {
			System.out.println(booksToPrint);
		}

		books.forEach(System.out::println);
		
	}
	
//	public static void deleteBookByName(BookRepository bookRepository) {
//		Scanner input = new Scanner(System.in);
//		String name = input.next();
//		Optional<Book> bookByName = bookRepository.findByName(name);
//		System.out.println("Searching for a book by name: ");
//		bookByName.ifPresent(System.out::println);
//
//		bookByName = bookRepository.deleteByName(name);
//		bookByName.ifPresent(System.out::println);
//	
//	}

}
