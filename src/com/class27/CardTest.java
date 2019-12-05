package com.class27;

public class CardTest {

	public static void main(String[] args) {

		// primitive
		int i = 10;
		// take an object of the child class and give reference to the parent class
		// type reference variable=object is created//card is type here like int we have
		// multiple non primitive type if we add Scanner scan;before scan part it is a
		// non primitive type
		Card card = new AX();// type casting
		//card.creditLimit(); // compiler gives just our type have(CARD),but during the run time it looks
							// child class and specific code getting execute

		Card card1 = new MC();
		//card1.creditLimit();
		Card card2 = new Visa();
		//card2.creditLimit();

		// type [] arrayName={};
		// type [] arrayName=new type[];

		int[] numArray = { 10, 12, 13 };
		String[] stringArray = { "aa", "bb" };

		Card[] cardArray = { card, card1, card2 };// the array holds a non primitive types
		Card[] cardArray1 = { new MC(), new AX(), new Visa(), new Discovery() };

		// cardArray1[0]-->MC
		// cardArray1[3]-->Discovery

		for (Card mycard : cardArray1) {
			mycard.creditLimit();
			mycard.chargeInterest();
		}
		for(int i1=0;i1<cardArray1.length;i1++) {
			cardArray1[i1].creditLimit();
		}

		
		System.out.println("Creating objects of each class");
		
		Card c1=new Card();
		//c1.chargeInterest();
		
		AX a1=new AX();
		MC m1=new MC();
		MC m2=new MC();
		MC m3=new MC();
		MC m4=new MC();
		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();
		Visa v1=new Visa();
		
		System.out.println("--creating an array that will hold only Mc");
		
		MC[]masterCards= {m1,m2,m3,m4};
		
	for(int h=0;h<masterCards.length;h++) {
		masterCards[h].chargeInterest();
		masterCards[h].creditLimit();
	}
	}
}
