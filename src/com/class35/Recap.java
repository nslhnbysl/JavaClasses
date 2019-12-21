package com.class35;

import java.util.HashSet;
import java.util.*;

public class Recap {

	public static void main(String[] args) {
		Set<Double>set=new HashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);

		//Retrieving elements;

		Iterator<Double>it=set.iterator();

		while(it.hasNext()){
			double d=it.next(); //(we can use double because of autoboxing)
		System.out.println(d);
		}
		
		for(Double d1:set) {
			System.out.println(d1);
		}
		
		//how can I access just 1 value from the set collection
		Set<String>lset=new LinkedHashSet<>(); //keep the order
		
		lset.add("Morning");
		lset.add("Noon");
		lset.add("evening");
		lset.add("Night");
		//convert to arraylist
		
		List<String>myList=new ArrayList<>();
		myList.addAll(lset);
		String element=myList.get(2);
		System.out.println(element);
	
		//another way to create an object of arraylist by passing values to the constructor
	List<String>myList1=new ArrayList<>(lset);
		

	}

}
