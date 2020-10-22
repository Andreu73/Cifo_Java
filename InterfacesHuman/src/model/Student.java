package model;

public class Student extends Person{

	public int courseYear;
	
	public Student(String name, int age, int courseYear) {
		super(name, age);
		this.courseYear = courseYear;
	}

	public void talk(){
		
		System.out.println("The student talks about maths");
	}
	
	public void createPrograms(){
		
		System.out.println("The student creates a program on airplanes");
	}
	
	public void study(){
		
		System.out.println("the student studies physics");
	}
	
	public void playViolin(){
	
		System.out.println("The student plays violin with his cousine");
	}
	
	public void listen(){
		
		System.out.println("The student listens to the teacher");
	}
	
	public void eat(){
		System.out.println("The student has breakfast");
	}
	
	public void play(){
		
		System.out.println("The student plays football");
	}
	
	public void sleep(){
		
		System.out.println("The student sleeps in the afternoon");
	}
	
}
