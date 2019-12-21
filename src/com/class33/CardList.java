package com.class33;

import java.util.Iterator;
import java.util.LinkedList;

public class CardList {

	public static void main(String[] args) {

		LinkedList<Card>cardlist=new LinkedList<Card>();
		
		cardlist.add(new BOA("visa"));
		cardlist.add(new Chase("Master Card"));
		cardlist.add(new WF ("American Express"));
		
		System.out.println(cardlist);
		System.out.println(cardlist.size());
		
		Iterator<Card> it=cardlist.iterator();
		while(it.hasNext()) {  
			//how I add 2 method inside my iteration
			it.next().cardBalance();
			//it.next().creditLimit();
			
		}
		
	}

}
