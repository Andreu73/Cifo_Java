package birding;

import java.util.ArrayList;

import Model.Person;

public class PersonDatabase {

	private String name;
	public static ArrayList<Person> people;
	
	public PersonDatabase(String name) {
		
		this.name = name;
		people = new ArrayList<Person>();
	}

	public void addBirdAndDiscovererToDB(Person person) {
		
		people.add(person);
	}
	
	public static void setPeople(ArrayList<Person> people) {
		PersonDatabase.people = people;
	}
}
