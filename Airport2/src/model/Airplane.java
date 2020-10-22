package model;

public class Airplane implements IAirplane{
	
	public int idNumber;
	public AirCompany airCompany;
	
	public Airplane(AirCompany airCompany) {
		super();
		this.idNumber = hashCode();
	}

	public int getIdNumber() {
		return idNumber;
	}

	@Override
	public String toString() {
		return "Airplane - code number: " + idNumber + " company: " + airCompany + "\n";
	}

	
}
