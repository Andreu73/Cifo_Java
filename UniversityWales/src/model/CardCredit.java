package model;

public class CardCredit extends Card{
	
	private Date dayOfPayment;
	private double creditLimit;
	
	public CardCredit(Boolean isActivated, Date dateOfActivation, double balance, Date dayOfPayment, double creditLimit) {
		super(isActivated, dateOfActivation,balance);
		this.dayOfPayment = dayOfPayment;
		this.creditLimit = creditLimit;
	}

}
