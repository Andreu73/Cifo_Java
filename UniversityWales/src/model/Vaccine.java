package model;

public class Vaccine {
	
	public Date vaccineDay;
	public String kindOfVaccine;
	public String vaccineResult;

	public Vaccine(Date vaccineDay, String kindOfVaccine, String vaccineResult) {
		super();
		this.vaccineDay = vaccineDay;
		this.kindOfVaccine = kindOfVaccine;
		this.vaccineResult = vaccineResult;
	}

	@Override
	public String toString() {
		return "Vaccine [vaccineDay=" + vaccineDay + ", kindOfVaccine=" + kindOfVaccine + ", vaccineResult="
				+ vaccineResult + "]\n";
	}

	
	
}
