package model;

public class Person implements IPersonAction{
	
	protected int numberId;
	protected String name;
	protected int age;
	protected String countryOfOrigin;
	protected Date birthday;
	
	public Person(String name, int age, String countryOfOrigin, Date birthday) {
		super();
		this.numberId = hashCode();
		this.name = name;
		this.age = age;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
	}

	public void getPersonalUniversityEmail() {
		
		
	}

}
