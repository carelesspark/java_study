package com.java.etc;



public class Card {
	

	String kind;
	int number;
	public Card() {
		
	}
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;	
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
}
