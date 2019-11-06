package com.class12;

public class StringManupilations1 {

	public static void main(String[] args) {

		/*
		 * .contains();
		 */
		String sentence="It was raining";
		String sen="raining";
		
		System.out.println(sentence.contains("was")); //true
		System.out.println(sentence.contains("WAS")); //false 
		System.out.println(sentence.contains("w"));   //true because it has w the compiler check all char and give you boolean value
		System.out.println(sentence.contains(sen));   //true
		System.out.println(sen.contains(sentence));   //false 
		
		
		
		
		
		
		
		
	}

}
