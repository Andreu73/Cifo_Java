package service;

import java.util.ArrayList;

import model.Author;

public class AuthorDb {
	
	public String name;
	public static ArrayList<Author> authors;
	
	public AuthorDb(String name) {
		super();
		this.name = name;
		authors = new ArrayList<>();
	}
	
	public static void setAuthors(ArrayList<Author> authors) {
		AuthorDb.authors = authors;
	}

	public static void listOfAuthors() {
		String list = "";
		int count =1;
		for(Author authorList : authors) {
			
			list = list + count +". "+ authorList + "\n";
			count++;
		}
		System.out.println(list);
	} 

	public static Author selectAuthor(String name) {

		for(Author authorList : authors) {
			
			if(authorList.getName()==name)
					return authorList;
		}
		return null;
	} 

}
