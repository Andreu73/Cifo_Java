package model;

public class Card {
	
	protected int cardNumber;
	private Date dateOfActivation;
	protected String type;
	protected double balance;

	
	public Card(Date dateOfActivation, String type, double balance) {
		super();
		this.cardNumber = hashCode();
		this.dateOfActivation = dateOfActivation;
		this.type = type;
		this.balance = 0.00d;
	}

}
