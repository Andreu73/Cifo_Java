package service;

import java.util.ArrayList;

import model.Card;

public class CardDb {
	
	public String name;
	public static ArrayList<Card> cards;
	
	public CardDb(String name) {
		super();
		this.name = name;
	}
	
	public static void addCardToDb(Card card) {
		
		cards.add(card);
	}

}
