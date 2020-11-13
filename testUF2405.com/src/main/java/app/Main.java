package app;


import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Book;
import model.Quote;
import repository.BookRepository;
import repository.QuoteRepository;
import view.Menu;


public class Main {
	
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("booking");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	

	// Create our repositories ...
	BookRepository bookRepository = new BookRepository(entityManager);
	QuoteRepository quoteRepository = new QuoteRepository(entityManager);
	
	Book book1 = new Book("Leo Tolstoy , Anna Karenina");
	Book book2 = new Book("Virginia Woolf (Orlanndo)");
	
	book1.addQuote(new Quote("tag1", "All happy families are alike; each unhappy family is unhappy in its own way.", 65));
	book1.addQuote(new Quote("tag2", "If you look for perfection, you'll never be content.", 40));
	book1.addQuote(new Quote("tag3", "I think... if it is true that there are as many minds as there are heads, then there are as many kinds of love as there are hearts.", 95));
	book1.addQuote(new Quote("tag4", "He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.", 65));
	book1.addQuote(new Quote("tag5", "Respect was invented to cover the empty place where love should be.", 45));
	book2.addQuote(new Quote("tag6", "As long as she thinks of a man, nobody objects to a woman thinking.", 45));
	book2.addQuote(new Quote("tag7", "Nothing thicker than a knife's blade separates happiness from melancholy", 50));
	book2.addQuote(new Quote("tag8", "Love, the poet said, is woman's whole existence.", 35));
	
	Optional<Book> savedBook1 = bookRepository.save(book1);
	Optional<Book> savedBook2 = bookRepository.save(book2);
	
	Menu menu = new Menu();
	menu.loopIO(bookRepository, quoteRepository);
	

	
	
	
	entityManager.close();
	entityManagerFactory.close();
	
	}
}
