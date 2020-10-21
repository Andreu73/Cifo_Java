package model;

import java.util.ArrayList;

public class Lecturer extends Person{
	
	public int officeNumber;
	public int parkingLotNumber;
	public ArrayList<Subject> subjects;
	
	public Lecturer(String name, String countryOfOrigin, Date birthday, int officeNumber, int parkingLotNumber,
			Subject subject) {
		super(name, countryOfOrigin, birthday);
		this.officeNumber = officeNumber;
		this.parkingLotNumber = parkingLotNumber;
		this.subjects = new ArrayList<Subject>();
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	} 

}
