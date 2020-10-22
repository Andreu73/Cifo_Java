package model;

import interfaces.IAction;
import interfaces.IHumanAction;

public class Person implements IHumanAction, IAction{
	
	public String name;
	public String age;
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void talk(){
		
		System.out.println("I like talking to my son!");
	}
	
	public void createPrograms(){
		
	}
	
	public void study(){
		
	}
	
	public void playViolin(){
		
	}
	
	public void listen(){
		
	}
	
	public void eat(){
		
	}
	
	public void play(){
		
	}
	
	public void sleep(){
		
	}

}
