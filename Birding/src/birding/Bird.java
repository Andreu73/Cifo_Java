package birding;

import java.util.ArrayList;

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

	public String getLatinName() {
		return latinName;
	}
	
	public void addObservations() {
		
		this.observations++;
	}
	
	public void addDiscovererToTheObservation(Person discoverer) {
		
		this.discoverer = discoverer;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", observations=" + observations + "]";
	}

}
