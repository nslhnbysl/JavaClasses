package com.class34;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		//lets create a collection of veggies where I dont want to have duplicate
		
		HashSet<String>hset=new HashSet<>();
		//storing values into hashset
		
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");

System.out.println(hset.size()); //its gonna 5 because its not allows to duplicate and automatically didnt add one more zuccini
System.out.println(hset);     //[pepper, cucumber, onion, zuccini, carrot] also there is showing  didnt added and  printed second zuccini


//they dont have any methods to retrieve elements from the collection
//.get(); --they belong to list interface 
//.set(); --we cannot access any list interface methods 
//there is no indexes because we cant use any get methods 

//How can we retrieve all elements?
//we can use advanced loop and iterator we cannot use for loop because we cant use get();

//1st way
Iterator<String> it=hset.iterator();

while(it.hasNext()) {
	String element=it.next();
	System.out.println(element); //we printed one by one through iterator
}

//2nd way
for(String el:hset) {
	System.out.println(el);
}













		
		
		
	}

}
