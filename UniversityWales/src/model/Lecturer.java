package model;

public class Lecturer extends Person{
	
	protected int officeNumber;
	protected int parkingLotNumber;
	protected Subject subject;
	
	public Lecturer(String name, int age, String countryOfOrigin, Date birthday, int officeNumber, int parkingLotNumber,
			Subject subject) {
		super(name, age, countryOfOrigin, birthday);
		this.officeNumber = officeNumber;
		this.parkingLotNumber = parkingLotNumber;
		this.subject = subject;
	} 

}
