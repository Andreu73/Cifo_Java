package model;

public class Airplane implements IAirplane{
	
	public int idNumber;
	public AirCompany airCompany;
	
	public Airplane(AirCompany airCompany) {
		super();
		this.idNumber = hashCode();
		this.airCompany = airCompany;
	}

	public int getIdNumber() {
		return idNumber;
	}

	@Override
	public String toString() {
		return "Airplane - code number: " + idNumber + " - " + airCompany;
	}

	
}
