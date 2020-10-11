package lyyracard;

public class LyyraCard {

	private int lyyracardId;
	private MyDate dateOfExecution;
	private double balance;

    public LyyraCard(int lyyracardid) {
    	this.lyyracardId= lyyracardid;
    	this.dateOfExecution = new MyDate();
        this.balance = 0.00d;
    }

    public int getLyyracardId() {
		return lyyracardId;
	}
    
	public String getDateOfExecution() {
		return dateOfExecution.formatMyDate();
	}

	public double getBalance() {
        return this.balance;
    }
	
    public void setBalance(double balance) {
		this.balance = balance;
	}

    public void loadMoney(LyyraCard lyyracard, double amount) {
    	if(this.getLyyracardId()==lyyracard.getLyyracardId())
        this.balance += amount;
    	System.out.println(amount + "Eur loaded!");
    }

    public boolean pay(LyyraCard lyyracard, double amount){

	   // the method checks if the balance of the card is at least the amount given as parameter if not, 
	   //the method returns false meaning that the card could not be used for the payment if the balance is enough, 
	   // 	the given amount is taken from the balance and true is returned
    	
    	if(lyyracard.getBalance() > amount) {
    		lyyracard.balance = lyyracard.balance - amount;
    		return true;}
    	else
    		return false;

    }
    
	@Override
    public String toString() {
    	return "Lyyracard number: " + this.getLyyracardId()+ " - Date of Activation: "+ this.getDateOfExecution() + " - Balance: " + this.getBalance();
    	
    }
 
}

