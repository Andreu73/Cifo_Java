package model;

import java.util.ArrayList;

public class Author {

	private String name; 
	private String email;
	private char gender;
	private static ArrayList<Book> books;
	

	 public Author(String name, String email, char gender) {
	 	this.name = name;
	 	this.email = email;
	 	this.gender = gender;
		books = new ArrayList<Book>();
	 }
	 public String getName() {
	 	return this.name;
	 }
	 public String getEmail() {
	 	return this.email;
	 }
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 public char getGender() {
	 	return gender;
	 }
	 
	 
	public static void setBooks(ArrayList<Book> books) {
		Author.books = books;
	}
	public static void addBookToDb(Book book) {
		
		books.add(book);
		
	}
	 
	public static void listTheBooks() {
		String list = "";
		int count =1;
		for(Book bookList : books) {
			
			list = list + count +". "+ bookList;
			count++;
		}
		System.out.println(list);
	} 
	
	 public String toString() {
		// to-do, print books as well
	 	String author = this.name + "(" + this.gender + ") at " + this.email;
	 	return author;
	 }
}

