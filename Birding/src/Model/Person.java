package Model;

public class Person {
	
	private String name;
	private String countryOfOrigin;
	private String university;

	public Person(String name, String countryoforigin, String university) {
		this.name = name;
		this.countryOfOrigin = countryoforigin;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", countryOfOrigin=" + countryOfOrigin + ", university=" + university + "]";
	}
}
