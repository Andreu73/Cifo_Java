package lyyracard;

public class CashRegister {

	private int cashregsiterId;
	private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;   // the amount of economical lunches sold
    private int gourmetSold;       // the amount of gourmet lunches sold

    public CashRegister(int cashregsiterid) {
    	this.cashregsiterId= cashregsiterid;
        // at start the register has 1000 euros
    	this.cashInRegister= 1000.00;

    }
    
    public int getCashregsiterId() {
		return cashregsiterId;
	}

	public double payEconomicalCash(CashRegister cashregister, double cashGiven) {
		// the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
		MyDate dateofoperation = new MyDate();
		if(cashGiven >= OptionsMenu.MENU_ECONOMICAL) {
			cashregister.economicalSold++;
			cashregister.cashInRegister+=OptionsMenu.MENU_ECONOMICAL;
	    	double cashBack = cashGiven-OptionsMenu.MENU_ECONOMICAL;
	    	System.out.println(dateofoperation.formatMyDate() + "\nMenu Economical sold!");
	    	return cashBack;}
	    else {
	    	System.out.println("No cash enough!");
	    	return cashGiven;
	    }
	    		 	
    }
	
	public boolean payEconomicalCard(CashRegister cashregister, LyyraCard lyyracard) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
		MyDate dateofoperation = new MyDate();
		if(lyyracard.getBalance() >= OptionsMenu.MENU_ECONOMICAL) {
			lyyracard.setBalance(lyyracard.getBalance()-OptionsMenu.MENU_ECONOMICAL);
			cashregister.economicalSold++;
	    	cashregister.cashInRegister+=OptionsMenu.MENU_ECONOMICAL;
	    	System.out.println(dateofoperation.formatMyDate() + "\nMenu Economical sold!");
	    	return true;}
		else {
	    	System.out.println("Not enough balance!");
			return false;}
    }
	
	public double payGourmetCash(CashRegister cashregister, double cashGiven) {
		// the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
		MyDate dateofoperation = new MyDate();
		if(cashGiven >= OptionsMenu.MENU_GOURMET) {
			cashregister.gourmetSold++;
	    	double cashBack = cashGiven -OptionsMenu.MENU_GOURMET;
	    	cashregister.cashInRegister+=OptionsMenu.MENU_GOURMET;
	    	System.out.println(dateofoperation.formatMyDate() + "\nMenu Gourmet sold!");
	    	return cashBack;}
	    else {
	    	System.out.println("No cash enough!");
	    	return cashGiven;
	    }
	    		 	
    }

	public boolean payGourmetCard(CashRegister cashregister, LyyraCard lyyracard) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
		MyDate dateofoperation = new MyDate();
		if(lyyracard.getBalance() >= OptionsMenu.MENU_GOURMET) {
			lyyracard.setBalance(lyyracard.getBalance()-OptionsMenu.MENU_GOURMET);
			cashregister.gourmetSold++;
			cashregister.cashInRegister+=OptionsMenu.MENU_GOURMET;
			System.out.println(dateofoperation.formatMyDate() + "\nMenu Gourmet sold!");
	    	return true;}
		else {
	    	System.out.println("Not enough balance!");
			return false;}
    }

	public String listOfCashRegisters() {
    	return "Cash Register Number: " + this.getCashregsiterId();
    }

	public String toString() {
        return "Money in register "+cashInRegister+"Eur\nEconomical lunches sold: "+economicalSold+"\nGourmet lunches sold: "+gourmetSold;
    }
}

