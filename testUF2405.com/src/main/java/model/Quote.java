package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="QUOTE")
@NamedQueries({ @NamedQuery(name = "Quote.findByid", query = "SELECT b FROM Quote b WHERE b.id = :id"),
	@NamedQuery(name = "Quote.findAll", query = "SELECT b FROM Quote b") })
public class Quote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String tag;
	private String sentence;
	private int numberWords;
	
//	@ManyToOne(cascade = {CascadeType.ALL},fetch= FetchType.EAGER)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BOOK_ID")
	
	private Book book;
		
	public Quote() {
		super();
	}
	public Quote(String tag, String sentence, int numberWords) {
		super();
//		this.id = id;
		this.tag=tag;
		this.sentence = sentence;
		this.numberWords = numberWords;
//		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public int getNumberWords() {
		return numberWords;
	}
	public void setNumberWords(int numberWords) {
		this.numberWords = numberWords;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Quote [tag=" + tag + ", sentence=" + sentence + ", numberWords=" + numberWords
				+ ", book=" + book.getTitle() + "]";
	}

	
	
	
	
	
	
}