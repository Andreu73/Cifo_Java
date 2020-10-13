package lyyracard;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionsMenu {
	
	public static void selectTheCashRegister() {
		
		Scanner reader = new Scanner(System.in);
		
		Restaurant.cashRegisterList();
		System.out.println("Select the Cash Register: ");
		int cashregisterNumber = reader.nextInt();
		
		CashRegister cashregister = Restaurant.cashregisterIdentification(cashregisterNumber);
		optionsScreenGeneral(cashregister);
	}
	
		
	public static void optionsScreenGeneral(CashRegister cashregister) {
		
		Scanner reader = new Scanner(System.in);
		
		int option = 0;
		
		while(option!=4) {
		System.out.println();	
		System.out.println("---------------------------");
		System.out.println("1. Menu Cash               ");
		System.out.println("2. Menu Card               ");
		System.out.println("3. Report                  ");
		System.out.println("4. Quit                    ");
		System.out.println("---------------------------");
		
		option = reader.nextInt();
		
			switch(option) {
			
			case 1: payMenuCash(cashregister, dishesScreen(cashregister));
				break;
			case 2: userIdentification(cashregister);
				break;
			case 3: report(cashregister);
				break;
			case 4: System.out.println("Goodbye, see you soon!");
				break;
			}
		}
	}
		

	public static void optionsScreenCard(Student student, LyyraCard lyyracard, CashRegister cashregister) {
		
		Scanner reader = new Scanner(System.in);
			
		int option = 0;
		
		while(option!=4) {
		System.out.println();	
		System.out.println("---------------------------");
		System.out.println("1. Print student info      ");
		System.out.println("2. Load money to the card  ");
		System.out.println("3. Menu Card               ");
		System.out.println("4. Quit                    ");
		System.out.println("---------------------------");
		
		option = reader.nextInt();
		
			switch(option) {
			
			case 1: student.getSelectedLyyracard(lyyracard);
				break;
			case 2: loadMoney(lyyracard);
				break;
			case 3: payMenuCard(cashregister, lyyracard, dishesScreen(cashregister));
				break;
			case 4: optionsScreenGeneral(cashregister);
				break;
			}
		}
		
	}
	
//	public static double dishesScreen(CashRegister cashregister) {
	public static ArrayList<Dish> dishesScreen(CashRegister cashregister) {
		
		Scanner reader = new Scanner(System.in);
		String finished = "";
		double totalPrice = 0;
		ArrayList<Dish> dishesSelected = new ArrayList<Dish>();
		
		while(!finished.equalsIgnoreCase("n")) {
			Restaurant.menuList();
			System.out.println("Select menu: ");
			int dish = reader.nextInt();
			
			Dish selecteddish = Restaurant.selectMenuFormTheList(dish);
			dishesSelected.add(selecteddish);
			
			System.out.println("Anything else? (y/n)");
			finished = reader.next();
			
			}
		
		System.out.println("\nDishes selected: ");
		for(Dish dish : dishesSelected) {
			totalPrice = totalPrice + dish.getPrice();
			System.out.println(dish);
		}
		System.out.println("Total Price: " + totalPrice + " Eur");
//		cashregister.addDish(selecteddish);			
			
//		System.out.println("Total price: " + totalPrice + " Eur");
//		return totalPrice;
		
		return dishesSelected;
			
	}
	
//	public static void payMenuCash(CashRegister cashregister, double totalPrice) {
	public static void payMenuCash(CashRegister cashregister, ArrayList<Dish> dishesselected) {
		
		double totalPrice = 0.00;

		for(Dish dishesprice : dishesselected) {
			
			totalPrice = totalPrice + dishesprice.getPrice();
		}
		
		double cashGiven = cashGiven();
		if(cashGiven>totalPrice) {
			cashregister.addDish(dishesselected);	
			cashregister.payMenuCash(cashregister, totalPrice, cashGiven);}
		else
			System.out.println("Not enough cash!");
	}

	public static void payMenuCard(CashRegister cashregister, LyyraCard lyyracard, ArrayList<Dish> dishesselected) {
		
		double totalPrice = 0.00d;

		for(Dish dishesprice : dishesselected) {
			
			totalPrice = totalPrice + dishesprice.getPrice();
		}
		
		if(lyyracard.getBalance()>totalPrice) {
			cashregister.addDish(dishesselected);
			cashregister.payMenuCard(cashregister, lyyracard, totalPrice);}
		else
			System.out.println("Not enough balance!");
		
	}
	
	public static void userIdentification(CashRegister cashregister) {
		
		Scanner reader = new Scanner(System.in);
		
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
		
		optionsScreenCard(student, lyyracard, cashregister);
		
		reader.close();
		
	}
	
	public static double cashGiven() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("How much money?");
		double amount = reader.nextDouble();
		return amount;
	}
	
	public static void loadMoney(LyyraCard lyyracard) {
				
		lyyracard.loadMoney(lyyracard, cashGiven());
		
	}
	public static void report(CashRegister cashregister) {
		
//		System.out.println(cashregister + "\n" + cashregister.listOfDishesSold());
		System.out.println(cashregister);
		
	}

}
