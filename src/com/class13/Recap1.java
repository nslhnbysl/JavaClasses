package com.class13;

public class Recap1 {

	public static void main(String[] args) {

	String str1="Hello";
	
	String str2="Hello";
	//if declare same value(object) the program take first initialization
	//think to address box a lot of people lives in fairfax java program consider to same values same bucket 
	//one object can use 1 million time because 
	//java will accept str1 
	//whenever we create a string class if we try to change it we cant,we don't change the actual object 
	//if we change the value its gonna be new object 
	
	
	String city="Fairfax";
	String city1="Fairfax";
	System.out.println(city); //print city
	System.out.println(city1);//print city
	
	System.out.println(city.isEmpty());
	System.out.println(city.length());
	 int[] a= {34,56,32,11};
	 System.out.println(a.length); //no parantheses difference for string length
	 System.out.println(city.toUpperCase());//this is a new object different things for city 
	 
	 
	 
	 
	 
	
	
	
		
		
		
		
		
		
		
		
	}

}
