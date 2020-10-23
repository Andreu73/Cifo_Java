package model;

import java.util.ArrayList;

public class Lecturer extends Person{
	
	public int officeNumber;
	public int parkingLotNumber;
	public ArrayList<Subject> subjects;
	
	public Lecturer(String name, String countryOfOrigin, Date birthday, int officeNumber, int parkingLotNumber, ArrayList<Subject> subjects) {
		super(name, countryOfOrigin, birthday);
		this.officeNumber = officeNumber;
		this.parkingLotNumber = parkingLotNumber;
		this.subjects = subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return super.toString() + "Lecturer [officeNumber=" + officeNumber + ", parkingLotNumber=" + parkingLotNumber + ", subjects="
				+ subjects + "]\n";
	} 

	
	
}
