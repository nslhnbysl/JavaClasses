package com.class33;

public abstract class Card {
//	2-Create a Card class that will have implemented and unimplemented methods and a constructor 
//	that  will  initializes  credit  card  type.    Create  3 subclasses  of  a  Card  card.  Create  3  objects  of 
//	different  card  and  store  them  into  LinkedList.Using  for  loop/advanced  for  loop/  iterator access all methods of the class.
	String cardType;
	
	Card(String cardType){
		this.cardType=cardType;
	}
	public void welcome() {
	 System.out.println("Welcome to our credit card program");	
	}
	public abstract void cardBalance();
	public abstract void creditLimit();
	
}
class BOA extends Card{
	int cardLimit;

	BOA(String cardType) {
		super(cardType);
		this.cardLimit=cardLimit;
	}

	@Override
	public void cardBalance() {
		System.out.println("Bank Of America card balance is extendable  ");
	}

	@Override
	public void creditLimit() {
System.out.println("Bank of america credit limit is adjustable");		
	}
	
}
class Chase extends Card{
	
	public Chase(String cardType){
		super(cardType);
		
	}

	@Override
	public void cardBalance() {
		System.out.println("Chase card balance is extendable  ");
		
	}

	@Override
	public void creditLimit() {
		System.out.println("Chase credit limit is adjustable");	
		
	}
}
class WF extends Card{
	WF(String cardType){
		super(cardType);
	}

	@Override
	public void cardBalance() {
		System.out.println("WF card balance is extendable  ");
		
	}

	@Override
	public void creditLimit() {
		System.out.println("WF credit limit is not adjustable");	
		
	}
}