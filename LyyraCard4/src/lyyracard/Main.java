package lyyracard;

public class Main {

	public static void main(String[] args) {
		
		University universityOfHelsinki = new University("University of Helsinki");
		
		Student peter = new Student("Peter");
		Student paul = new Student("Paul");
		Student mary = new Student("Mary");
		
		universityOfHelsinki.addStudent(peter);
		universityOfHelsinki.addStudent(paul);
		universityOfHelsinki.addStudent(mary);
		
		LyyraCard lyyracard1 = new LyyraCard(1);
		LyyraCard lyyracard2 = new LyyraCard(2);
		LyyraCard lyyracard3 = new LyyraCard(3);
		LyyraCard lyyracard4 = new LyyraCard(4);
		LyyraCard lyyracard5 = new LyyraCard(5);
		
		peter.addLyyracardToStudent(lyyracard1);
		peter.addLyyracardToStudent(lyyracard2);
		peter.addLyyracardToStudent(lyyracard3);
		paul.addLyyracardToStudent(lyyracard4);
		mary.addLyyracardToStudent(lyyracard5);
		
		CashRegister cashregister1 = new CashRegister(1);
		CashRegister cashregister2 = new CashRegister(2);
		CashRegister cashregister3 = new CashRegister(3);
		
		Restaurant restaurant1 = new Restaurant(1, "University Restaurant Number 1");
		
		restaurant1.addCashRegsiterToUniversity(cashregister1);
		restaurant1.addCashRegsiterToUniversity(cashregister2);
		restaurant1.addCashRegsiterToUniversity(cashregister3);
		
		OptionsMenu start = new OptionsMenu();
		start.userIdentification();

	}

}
