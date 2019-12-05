package com.class14;

import java.util.Scanner;

public class InterviewQuestions2 {

	public static void main(String[] args) {

		//3 find out how many alpha characters present in a string
       System.out.println("question 3"); 
		String str1="Today is the #$%% 15 #$%& Java class";
        
        System.out.println(str1.replaceAll("[^A-Za-z]", "").length());
 
		
	//4-how to find out the part of string from a string.what is substring.find number of words in string
        
       String str2="Today is Java class";
       String[]array=str2.split(" ");
  for (String string : array) {
	System.out.println(string);
	
}      
		System.out.println(array.length);
		
		// 5-write a java program to reverse string? reverse a string word by word

		String given = "Welcome to the Java class";

		/* to reverse String split(); Step1: split--> array of String Step2: use for
		 * loop and use decrement to print values
		 */

		String reversed = "";

		String[] str = given.split("\\s");

		for (int j = str.length - 1; j >= 0; j--) {

			reversed = reversed + str[j] + " ";

		}

		System.out.println(reversed);

		// Write a java program to reverse String?

		// toCharArray(); charAt();

		String given1 = "Today is Java Class";
        String replaced1 = "";
        char[] charArray = given1.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
			replaced1 = replaced1 + charArray[i];
			}
        System.out.println(replaced1);
        
		System.out.println("---Using charAt---");
		String Word3 = "I Love Java";
		String reversed2 = "";
		for (int i = Word3.length() - 1; i >= 0; i--) {
			reversed2 = reversed2 + Word3.charAt(i);
			}
System.out.println(reversed2);

    //6-Write a Java Program to find whether a String is palindrome or not?
		
		
		String input1 = "anna";
        String forward = "";
        int word = input1.length();
        for (int i = 0; i <=word - 1; i++) {
            forward = forward + input1.charAt(i);
        }
        System.out.println(forward);
        
        
        if(input1.equals(forward)) {
            System.out.println("This is a palindrome string");
        }else {
            System.out.println("This is not a palindrome string");
        }	
		
		
    //7-Write a java program to check whether a given number is prime or not?
		
		
		boolean isPrime=true;
	    Scanner scan=new Scanner (System.in);
	    System.out.println("Enter a number");
	    int givenNumber=scan.nextInt();
	    
	    for(int i=2; i<givenNumber; i++) {
	        if(givenNumber%i==0) {
	            isPrime=false;
	        }
	        }
	    if(givenNumber<2) {
	        System.out.println("Number can not be check");
	    }else if (isPrime) {
	        System.out.println(givenNumber+ " is a Prime number");
	    }else {
	        System.out.println(givenNumber+ " is not a Prime Number");
	       }    
		

			
    //8-Write a Java Program to print first 10 numbers of Fibonacci series.
	    
	    int j = 0;
        int k = 1;
        for (int i = 1; i <= 10; i++) {
            int c = j + k;
            j = k;
            k = c;
            System.out.println(c);
        }

	
		
		
	}

}
