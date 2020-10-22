package model;

public class Teacher extends Person{

	public String degree;

	public Teacher(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	
	public void talk(){
		
	System.out.println("The teacher talks about politics");
	}
	
	public void createPrograms(){
		
		System.out.println("The teacher creates a program with Java");
	}
	
	public void study(){
		
		System.out.println("The teacher studies how to teach");
	}
	
	public void playViolin(){
	
		System.out.println("The teacher plays violin in the weekend");
	}
	
	public void listen(){
		
		System.out.println("The teacher listens to his students");
	}
	
	public void eat(){
		System.out.println("The teacher eats while watching TV");
	}
	
	public void play(){
		
		System.out.println("The teacher plays with his daughter");
	}
	
	public void sleep(){
		
		System.out.println("The teacher sleeps because he is tired");
	}
	
}
