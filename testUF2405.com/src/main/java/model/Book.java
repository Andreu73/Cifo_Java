package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
	@Table(name = "BOOK")
	@NamedQueries({ @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
	@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b") })

	public class Book {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public int id;
		public String title;
		
		@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	    public List<Quote> quotes =new ArrayList<Quote>();

	public Book() {}

	public Book(String title) {
//			this.id = id;
			this.title = title;
		}



	public int getId() {
			return id;
		}

	public void setId(int id) {
			this.id = id;
		}


	public String getTitle() {
			return title;
		}

	public void setTitle(String name) {
			this.title = name;
		}
		


//	public void setQuote (Quotes quotes) {
//			this.quote = quotes;
//		}



	public void addQuote(Quote quote) {
		quotes.add(quote);
		quote.setBook(this);
	}

	public List<Quote> getQuotes() {
		return quotes;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", quotes=" + this.listOfQuotes() + "]";
	}

	public String listOfQuotes() {	
	String quotesList = "";
	for(Quote quote : quotes) {
			
		quotesList = quotesList + quote +"\n";
		}
		return  quotesList;
	}
	

}



