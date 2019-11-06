package com.class14;

public class InterviewQuestions2 {

	public static void main(String[] args) {

		//3 find out how many alpha characters present in a string
        
		String str1="Today is the #$%% 15 #$%& Java class";
        
        System.out.println(str1.replaceAll("[^A-z0-9]", "").length());
 
		
	//4-how to find out the part of string from a string.what is substring.find number of words in string
        
       String str2="Today is Java class";
       String[]array=str2.split(" ");
  for (String string : array) {
	System.out.println(string);
	
}      
		System.out.println(array.length);
		
	//5-write a java program to reverse string? reverse a string word bye word 
		
		String s1="What a wonderful world";
		String[]s2=s1.split(" ");
		for (String string : s2) {
			System.out.println(string);
		}

		
		
		
		
		
		
		

		
		
		
		
		
		
//		        Write a Java Program to find whether a String is palindrome or not?
//				Write a java program to check whether a given number is prime or not?
//				Write a Java Program to print first 10 numbers of Fibonacci series.
//		
		
		
	}

}
