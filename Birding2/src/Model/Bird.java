package Model;

import java.util.ArrayList;

public class Bird {
	
	private String name;
	private String latinName;
	public int observations;
	public ArrayList<Person> watchers;
	
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
			watcher.birdObserved();
			this.observations++;
	}

	@Override
	public String toString() {
		return "Bird - name: " + name + " - latin name: " + latinName + " - observations: " + observations + "\n" +
				this.listOfWatchers();
	}
	
	public String listOfWatchers() {
		
		String watchersList = "";
		for(Person watcher : watchers) {
			
			watchersList = watchersList + "Watcher: " + watcher + "\n";
		}
		return  watchersList;
	}

}
