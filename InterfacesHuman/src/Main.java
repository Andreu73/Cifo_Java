import model.Animal;
import model.Cat;
import model.Dog;
import model.Person;
import model.Student;
import model.Teacher;

public class Main {

	Animal animal = new Animal("Flip", 3);
	
	Animal misha = new Cat("Misha", 2, 7);
	Animal catt = new Cat("Catty", 3, 4); 
	
	Dog doggy = new Dog("Doggy", 6, true);
	Dog bobby = new Dog("Bobby", 7, false);
	
	Person mary = new Person("Mary", 43);
	
	Student peter = new Student("Peter", 23, 4);
	Student lisa = new Student("Lisa", 20, 2);
	
	Teacher paul = new Teacher("Paul", 56, "Physics");
	Teacher anne = new Teacher("Anne", 36, "Mathematics");
	
	
}
