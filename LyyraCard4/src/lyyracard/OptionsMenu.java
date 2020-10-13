package lyyracard;

import java.util.Scanner;

public class OptionsMenu {
	
	static double MENU_ECONOMICAL = 2.50;
	static double MENU_GOURMET = 4.00;
		
	public static void optionsScreen(Student student, LyyraCard lyyracard, CashRegister cashregister) {
		
		Scanner reader = new Scanner(System.in);
		
		int option = 0;
		
		while(option!=5) {
		System.out.println();	
		System.out.println("---------------------------");
		System.out.println("1. Print student info      ");
		System.out.println("2. Load money to the card  ");
		System.out.println("3. Economical menu CASH    ");
		System.out.println("4. Economical menu CARD    ");
		System.out.println("5. Gourmet menu CASH       ");
		System.out.println("6. Gourmet menu CARD       ");		
		System.out.println("7. Report                  ");
		System.out.println("8. Quit                    ");
		System.out.println("---------------------------");
		
		option = reader.nextInt();
		
			switch(option) {
			
			case 1: student.getSelectedLyyracard(lyyracard);
				break;
			case 2: loadMoney(lyyracard);
				break;
			case 3: payEconomicalCash(cashregister);
				break;
			case 4: payEconomicalCard(cashregister, lyyracard);
				break;
			case 5: payGourmetCash(cashregister);
				break;
			case 6: payGourmetCard(cashregister, lyyracard);
				break;
			case 7: report(student, lyyracard, cashregister);
				break;
			case 8: System.out.println("Goodbye, see you soon!");
				break;
			}
		}
		
	}
	
	public void userIdentification() {
		
		Scanner reader = new Scanner(System.in);
		
		Restaurant.cashRegisterList();
		System.out.println("Select the Cash Register: ");
		int cashregisterNumber = reader.nextInt();
		
		CashRegister cashregister = Restaurant.cashregisterIdentification(cashregisterNumber);
		
		Boolean isNotStudent = false;
		String name = null;
		
		while(isNotStudent==false) {
		System.out.println("What's your name?");
		name = reader.next();
				
		if(University.checkStudent(name)) {
			isNotStudent = true;}
		}
		
		Student student = University.studentIdentification(name);
		System.out.println(student.getName()+ " - Student Id: " + student.hashCode());
		System.out.println("Select a card number from the list:");
		System.out.println(student.getLyyracards());
		
		int cardNumber = reader.nextInt();
		LyyraCard lyyracard = Student.cardIdentification(student, cardNumber);
		
		optionsScreen(student, lyyracard, cashregister);
		
		reader.close();
		
	}
	
	public static double cashGiven() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("How much money?");
		double amount = reader.nextDouble();
		return amount;
	}
	
	public static void payEconomicalCash(CashRegister cashregister) {
		
		cashregister.payEconomicalCash(cashregister, cashGiven());
	}

	public static void payEconomicalCard(CashRegister cashregister, LyyraCard lyyracard) {
		
		cashregister.payEconomicalCard(cashregister, lyyracard);
	}
	
	public static void payGourmetCash(CashRegister cashregister) {
		
		cashregister.payGourmetCash(cashregister, cashGiven());
	}

	public static void payGourmetCard(CashRegister cashregister, LyyraCard lyyracard) {
		
		cashregister.payGourmetCard(cashregister, lyyracard);
	}
	
	public static void loadMoney(LyyraCard lyyracard) {
				
		lyyracard.loadMoney(lyyracard, cashGiven());
		
	}
	public static void report(Student student, LyyraCard lyyracard, CashRegister cashregister) {
		
		System.out.println(student);
		System.out.println(cashregister);
		
	}

}
