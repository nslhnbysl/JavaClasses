package com.class14;

public class Task {

	public static void main(String[] args) {

		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.	​
		
		String str1=" This is my son, Ali Burhan";
		String str2=str1.replace(" ", "");
		System.out.println(str2);
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String abb="nesl!@#$%^382792802i";
		System.out.println(abb.replaceAll("[^A-Za-z]", ""));
		
		//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?
		String a="Is it saturday? is it raining? do we have a java class today?";
		
		String []array=a.split("\\?");
		
		for (String string : array) {
			System.out.println(string.trim());
			}
	   System.out.println(array.length);
	   
	}

}
