package Model;

import java.util.ArrayList;

public class Bird {
	
	private String name;
	private String latinName;
	public int observations;
	public ArrayList<Person> watchers;

//	public Bird(String name, String latinName, Person watcher, int observations) {
//		this.name = name;
//		this.latinName = latinName;
//		this.observations = observations;
//		watcher = watcher;	
//	}
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		watchers = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}
	
	public void addObservation(Bird birdFound, Person watcher) {
		
		if(this.name.equals(birdFound.getName()))
			watchers.add(watcher);
			this.observations++;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", watcher=" +
				watchers + ", observations=" + observations +"]";
	}

}
