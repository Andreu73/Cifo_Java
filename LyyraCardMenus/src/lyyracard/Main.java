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
		
		Dish salad = new Dish(1, "Green Salad", "Starter", 1.0);
		Dish soup = new Dish(2, "Onion Soup", "Starter", 0.5);
		Dish beans = new Dish(3,"Beans & Chips", "Meal", 3.0);
		Dish sausage = new Dish(4,"Sausage & Mushrooms", "Meal",5.0);
		Dish fish = new Dish(5,"Fish & Chips", "Meal",3.5);
		Dish spaghetti = new Dish(6,"Spaghetti & Meatballs", "Meal",4.5);
		Dish chicken = new Dish(7,"Chicken & Salad", "Meal",2.5);
		Dish icecream = new Dish(8,"Ice Cream", "Dessert", 1.0);
		Dish cheesecake = new Dish(9,"Cheese Cake", "Dessert", 2.0);
		Dish applepie = new Dish(9,"Apple Pie", "Dessert", 2.0);
		
		restaurant1.addDishToRestaurant(salad);
		restaurant1.addDishToRestaurant(soup);
		restaurant1.addDishToRestaurant(beans);
		restaurant1.addDishToRestaurant(sausage);
		restaurant1.addDishToRestaurant(fish);
		restaurant1.addDishToRestaurant(spaghetti);
		restaurant1.addDishToRestaurant(chicken);
		restaurant1.addDishToRestaurant(icecream);
		restaurant1.addDishToRestaurant(cheesecake);
		
		OptionsMenu.selectTheCashRegister();

	}

}
