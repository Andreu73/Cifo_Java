package service;

import java.util.ArrayList;

import app.Main;
import model.Stake;

public class StakeDb {
	
	public String name;
	public static ArrayList<Stake> stakes ;
	
	public StakeDb(String name) {
		super();
		this.name = name;
		stakes = new ArrayList<>();
	}
	
	public static void addStakeToDb(Stake stake) {

		stakes.add(stake);
	}
	
//	public static String listAllVampires() {
//		
//		String listOfVampires = "";
//		int count=1;
//		for(Vampire vamps : vampires) {
//			
//			listOfVampires = listOfVampires + count + ". "  +vamps +"\n";
//			count++;
//		}
//		return listOfVampires;
//	}
	
	public static void createInitialStakes() {
		for (int i = 0; i < Main.STAKES; i++) {
		
		stakes.add(new Stake("Stake","|",0));
		}
	}

	public static void createNewStake() {

		stakes.add(new Stake("Stake","|",0));
	}
	
	public static void removeStake(Stake stake) {

		stakes.remove(stake);

	}
}