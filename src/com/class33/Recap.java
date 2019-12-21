package com.class33;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {

	public static void main(String[] args) {
		

		//lets create an arraylist to store numbers 
		
		ArrayList<Integer>numbers=new ArrayList<>();
		
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
	
		
		int size=numbers.size();
		System.out.println(size);//we fixed the size there to 4
		
		//add more
		numbers.add(10000);
		//remove
		numbers.remove(size-1);//size was 4 and the value of that gonna be 3
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve value from an arrayList
		
		int element=numbers.get(0);
		System.out.println(element);
		
		//1.for loop 
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		//2.advanced for loop
		for(Integer num:numbers) {
			System.out.println(num);
		}
		//I want to value from back 
		
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.println(numbers.get(i));
		}
		System.out.println("ITERATOR");
		//3.iterator 
		//this is the other way to print out list one by one 
		
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {//as long is this condition will true our loop contunie to executing when it is convert to false 
			                       //it shows us our list finished
		System.out.println(iterator.next());	//and after the passed condition the loop gonna print next elements inside of the list 
		}
		
	}

}
