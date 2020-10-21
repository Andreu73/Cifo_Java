package model;

public class Person implements IPersonAction{
	
	protected int numberId;
	protected String name;
	protected int age;
	protected String countryOfOrigin;
	protected Date birthday;
	
	public Person(String name, String countryOfOrigin, Date birthday) {
		super();
		this.numberId = hashCode();
		this.name = name;
		this.age = calculateAgeOfThePerson();
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
	}
	
	public int calculateAgeOfThePerson() {
		
		String year = this.birthday.date.substring(4, 8);
		int yearOFBirth = Integer.parseInt(year);
		return yearOFBirth;
	}

	public void getPersonalUniversityEmail() {
		
		
	}

}
