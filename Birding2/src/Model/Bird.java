package Model;

public class Bird {
	
	private String name;
	private String latinName;
	public int observations;
	public Person discoverer;
	
	public Bird(String name, String latinName, Person discoverer) {
		this.name = name;
		this.latinName = latinName;
		this.observations = 0;
		this.discoverer = discoverer;
	}

	public String getName() {
		return name;
	}
	
	public void addObservation(Bird birdFound) {
		
		if(this.name.equals(birdFound.getName()))
		this.observations++;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", discoverer=" +
				this.discoverer + ", observations=" + observations +"]";
	}

}
