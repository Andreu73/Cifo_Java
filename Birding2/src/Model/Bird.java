package Model;

public class Bird {
	
	private String name;
	private String latinName;
	public int observations;
	public Person watcher;
	
	public Bird(String name, String latinName, Person watcher) {
		this.name = name;
		this.latinName = latinName;
		this.observations = 0;
		this.watcher = watcher;
	}

	public String getName() {
		return name;
	}
	
	public void addObservation(Bird birdFound, Person watcher) {
		
		if(this.name.equals(birdFound.getName()))
			this.watcher = watcher;
			this.observations++;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", discoverer=" +
				this.watcher + ", observations=" + observations +"]";
	}

}
