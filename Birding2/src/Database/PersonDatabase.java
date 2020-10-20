package Database;

import java.util.ArrayList;

import Model.Person;

public class PersonDatabase {

	private String name;
	public static ArrayList<Person> people;
	
	public PersonDatabase(String name) {
		
		this.name = name;
		people = new ArrayList<Person>();
	}

	public void addWatcherToDB(Person person) {
		
		people.add(person);
	}
	
	public static void setPeople(ArrayList<Person> people) {
		PersonDatabase.people = people;
	}
	
	public Person showPerson(String personname) {
		
		for(Person personToShow : people) {
			
			if(personToShow.getName().equals(personname))
				return personToShow;
		}
		System.out.println("Not found in DataBase!");
		return null;
		
	}
	
	public static String listOfPeople() {
		
		String peopleList = "";
		for(Person p : people) {
			
			peopleList = peopleList + "Watcher: " + p + "\n";
		}
		return  peopleList;
	}
}
