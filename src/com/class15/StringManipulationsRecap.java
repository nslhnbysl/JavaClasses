package com.class15;

public class StringManipulationsRecap {

	public static void main(String[] args) {

		//string class comes in java lang package,string is sequence of characters 
		
		//2 ways to create a string
		//first way using string literal 
		String str="Hello";
		//second way using new keyword-creating a string object
		String str1=new String("Hello");
		System.out.println(str);
		System.out.println(str1);
		
		//find the number of characters inside the string 
		int length=str.length();
		//2-case conversion methods/functions
		
		System.out.println(str.toLowerCase());//hello
		System.out.println(str);              //Hello(because we didn't change the veriable we just printed it
		System.out.println(str.toLowerCase().toUpperCase());//HELLO because program runs left to the right 
		
		//verify if there if the string is empty
		
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);//true 
		
		String myString1=null;
		//System.out.println(myString1.isEmpty());//exception error 
		
		//how to verify existence of characters in the string 
		
		String a="Good Evening students";
		boolean exist=a.contains("Students");
		System.out.println(exist);                //false 
		System.out.println(a.contains("student"));//true 
		
		System.out.println(a.startsWith("Good")); //true
		
	    System.out.println(a.endsWith("student"));//false
		
		
		
		
		
		
		
		
		
	}

}
