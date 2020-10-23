package utilsdb;

import java.util.ArrayList;

import model.Author;
import model.Book;
import service.AuthorDb;

public class BookDbPreFilling {

	public static void preFillingBooksToDb() {
		
	ArrayList<Book> books = new ArrayList<>();
	
	books.add(new Book("Title1", AuthorDb.authors.get(0), 2020, "Penguin Books", 25.90));
	books.add(new Book("Title2", AuthorDb.authors.get(1), 2020, "Penguin Books", 20.20));
	books.add(new Book("Title3", AuthorDb.authors.get(2), 2020, "Penguin Books", 15.00));
	
	Author.setBooks(books);
	
	}

}