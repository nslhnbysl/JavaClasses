package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {

		//create a collection that will store Sweets type of object and I dont want duplicate 
		//I dont care about order as long as I dont have duplicate objects 
		
		Set<Sweets> sweetSet=new HashSet<>();
		//1st way to add 2 steps 
		Sweets sweet=new Sweets("Cake");
		sweetSet.add(sweet);
		//2nd way to add 1 step
		sweetSet.add(new Sweets("Cookies"));
		sweetSet.add(new Sweets("Icecream"));
		sweetSet.add(new Sweets("Baklava"));
		sweetSet.add(new Sweets("Macaroons"));
		sweetSet.add(new Sweets("Chocolate"));
		sweetSet.add(new Sweets("Cookies"));
		
		System.out.println(sweetSet.size());
		
		System.out.println("ITERATOR");
		Iterator<Sweets>it=sweetSet.iterator();
		while(it.hasNext()) {
			Sweets name=it.next();
			System.out.println(name.name);
		}
	}

}
