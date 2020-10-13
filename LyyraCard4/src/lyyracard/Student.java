package lyyracard;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String name;
	private int hashCode;
	private ArrayList<LyyraCard> lyyracards;
	
	public Student(String name) {
		this.studentId = hashCode();
		this.name = name;
		this.lyyracards = new ArrayList<LyyraCard>();
	}

	public void addLyyracardToStudent(LyyraCard lyyracard) {
		
		lyyracards.add(lyyracard);
	}

	public String getName() {

		return name;
	}
	
	public static LyyraCard cardIdentification(Student student, int cardNumber) {
		
		for(LyyraCard lyyracard : student.lyyracards) {
			
			if(lyyracard.getLyyracardId()==cardNumber)
				return lyyracard;
		}
		return null;
	}
	
	public String getLyyracards() {
		String lyyras= "";
		for(LyyraCard cards : lyyracards)
			lyyras = lyyras + ("Lyyracard number: " + cards.getLyyracardId()+ " - Date: "+ cards.getDateOfExecution()+
					" - Balance: " + cards.getBalance()+"\n");
			return lyyras;
	}

	@Override
	public String toString() {
		return "StudentId: " + studentId + "\nName: " + name + "\n" + this.getLyyracards();
	}
	
	public void getSelectedLyyracard(LyyraCard lyyracard) {
		System.out.println(this.toString());
		System.out.println("LyyraCard selected: ");
		for(LyyraCard cards : lyyracards)
			if(cards.getLyyracardId()==lyyracard.getLyyracardId())
			System.out.println("Lyyracard number: " + cards.getLyyracardId());
	}
	
	
}
