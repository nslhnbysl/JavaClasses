package com.class34;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetFamilyMembers {

	public static void main(String[] args) {

		//CREATE A collection that wont allow duplicates and preserve the insertion order
		
		
		Set<String> fruitSet=new HashSet<>();
		fruitSet.add("Kiwi");
		fruitSet.add("Apple");
		fruitSet.add("Pineapple");
		fruitSet.add("Banana");
		fruitSet.add("Plums");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size()); //5 
		System.out.println("HASHSET");
		System.out.println(fruitSet);        //[Kiwi, Apple, Pineapple, Banana, Plums]
		
		Set<String> fruitSet1=new TreeSet<>(); //treeset allows alphabetic orders
		fruitSet1.add("Kiwi");
		fruitSet1.add("Apple");
		fruitSet1.add("Pineapple");
		fruitSet1.add("Banana");
		fruitSet1.add("Plums");
		fruitSet1.add("Banana");
		
		System.out.println(fruitSet1.size()); //5 
		System.out.println("TREESET");
		System.out.println(fruitSet1);        //[Apple, Banana, Kiwi, Pineapple, Plums]
		
		
		System.out.println("ADD ALL");
		Set<String> fruitSet2=new LinkedHashSet<>();
		fruitSet2.add("Kiwi");
		fruitSet2.add("Apple");
		fruitSet2.add("Pineapple");
		fruitSet2.add("Banana");
		fruitSet2.add("Plums");
		fruitSet2.add("Banana");
		
		
		System.out.println("LINKEDSET");
		System.out.println(fruitSet2);
		
		
		 LinkedList<Integer>llist=new LinkedList<>();
		
		  llist.add(111);
		  llist.add(222);
		  llist.add(333);
		  llist.add(444);
		  llist.add(555);
		  llist.add(666);
		  int result = 0;
		  for(int i=0;i<llist.size();i++){
		     result=result+llist.get(i);
		  }
		System.out.println(result);
	}

}
