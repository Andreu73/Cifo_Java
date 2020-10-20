package Model;

public class Person {
	
	private String name;
	private String countryOfOrigin;
	private String university;
//	private Bird bird;
	private int birdObservations;
	
	public Person(String name, String countryoforigin, String university) {
		this.name = name;
		this.countryOfOrigin = countryoforigin;
		this.university = university;
	}

	public String getName() {
		return name;
	}
	
	public void birdObserved() {
		
		this.birdObservations++;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " - countryOfOrigin: " + countryOfOrigin + " - university: " + university +
				" - observations: " + birdObservations;
	}
}
