package model;

public class Airplane {
	
	public int idNumber;
	public AirCompany airCompany;
	
	public Airplane(AirCompany airCompany) {
		super();
		this.idNumber = hashCode();
	}

}
