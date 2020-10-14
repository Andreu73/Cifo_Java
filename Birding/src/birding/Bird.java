package birding;

public class Bird {
	
	private String name;
	private String latinName;
	public int observations;
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.observations = 0;
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

	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", observations=" + observations + "]";
	}

}
