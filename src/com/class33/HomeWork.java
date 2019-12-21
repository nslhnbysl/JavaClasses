package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {

	public static void main(String[] args) {
		//1.Create an arraylist of cars and retrieve all the values using 3 different ways.
		
		
		
	
	//1	
		ArrayList<String>car=new ArrayList<String>();
		car.add("Audi");
		car.add("Lexus");
		car.add("Volkswagen");
		
		Iterator itcar=car.iterator();
		while(itcar.hasNext()) {
			System.out.println(itcar.next());
		}
		
	//2-Create  an  arrayList  of  words.  Remove  every word that ends with “e”. Use iterator
		List<String>words=new ArrayList<String>();//we can refer parent class and it is List
		words.add("hello");
		words.add("welcome");
		words.add("bye");
		words.add("see you");
		
		Iterator<String> itwords=words.iterator();
		
		while(itwords.hasNext()) {
			
			if(itwords.next().endsWith("e")) {
				itwords.remove();
				
			}
		}
		System.out.println(words);
		
		
		//3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 	
		
		List<String>drinks=new ArrayList<>();
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");
		
		for(int i=0;i<drinks.size();i++) {
			if(drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
				drinks.set(i, "water");
				
			}
		}
		System.out.println(drinks);
			
		//4.Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
		//creating an object of arraylist and reffering to the List
		List<Integer>numbers=new ArrayList();
		//storing only even number using loop
		for(int i=1;i<=50;i++){
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		//removing number that are divisible by using iterator
		Iterator<Integer>it=numbers.iterator();
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
		
	}

}
