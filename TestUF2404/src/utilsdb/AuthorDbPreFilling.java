package utilsdb;

import java.util.ArrayList;

import model.Author;
import service.AuthorDb;


public class AuthorDbPreFilling {
	
	public static void preFillingAuthorsToDb() {
	
	ArrayList<Author> authors = new ArrayList<>();
	
	authors.add(new Author("Peter", "peter@gmail.com", 'M'));
	authors.add(new Author("Mary", "mary@gmail.com", 'F'));
	authors.add(new Author("Paul", "paul@gmail.com", 'M'));
	authors.add(new Author("Anne", "anne@gmail.com", 'F'));
	
	AuthorDb.setAuthors(authors);
	
	}

}
