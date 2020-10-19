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

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", countryOfOrigin=" + countryOfOrigin + ", university=" + university + "]";
	}
}