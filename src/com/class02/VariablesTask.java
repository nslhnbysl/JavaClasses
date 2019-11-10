package com.class02;

public class VariablesTask {
	public static void main (String[] args) {
		
		String name="Neslihan";
		String lastName="Baysal";
		char  grade='1';
		String city="Centreville";
		String state="Virginia";
		long phoneNumber=6464171562l;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		city="Washington DC";
		//we dont need to declare variable again
		System.out.println();
		
		state="DC";
		phoneNumber=229829202903l;
		grade='A';
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		//My name is __
		//I live in city of __
		//My phone number is __
		
		System.out.println("My name is "+name);
		System.out.println("I live in city of "+city);
		System.out.println("My phone number is "+phoneNumber);
		
		
		
				
	}

}
