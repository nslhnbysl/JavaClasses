package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String>llist=new LinkedList<>();
		
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2,"How are you");
		System.out.println(llist);//[Hello, Bye, How are you, Hello, Bye] we added 2 element we didnt remove anyting
		
		//replace 1 element
		
		llist.set(1, "Goodbye");
		System.out.println(llist); //[Hello, Goodbye, How are you, Hello, Bye]
		
		//retrieve 1 element
		String element=llist.get(2);     //1st way
		System.out.println(element);
		System.out.println(llist.get(2));//2nd way
		
		//retrieve all elements
		
		//1st way
		System.out.println("FOR LOOP");
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		//2nd way
		System.out.println("ADVANCED FOR LOOP");
		for(String list:llist) {
			System.out.println(list);
		}
		
		//3nd way 
		System.out.println("ITERATOR");
	Iterator<String>it=llist.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}

}
