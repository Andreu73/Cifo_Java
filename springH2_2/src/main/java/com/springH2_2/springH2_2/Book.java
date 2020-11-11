package com.springH2_2.springH2_2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="book")
@Table(name="book")
public class Book {

	
	@Id
//	@GeneratedValue
	public String title;
	public String ISBN;
	public int pages;
	
	public Book() {
		
	}
	
	public Book(String title) {

		super();
		this.title = title;
		}
	
	public Book(String title, String iSBN, int pages) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.pages = pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	
	
	
}
