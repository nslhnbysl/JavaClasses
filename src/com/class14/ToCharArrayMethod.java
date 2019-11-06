package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {

	String str="Syntax Technologies";
	
	char[] array=str.toCharArray();
	for(char i:array) {
		System.out.print(i);
	}
		System.out.println();
		
		
	//SPLIT
	//this method splits this string around matches of the given regular expression.
		
		String str1="Video provides a powerful way to help you prove your point";
		
		String[] array1=str.split(" ");//("\\s")
		
		
		for(int i=0;i<array1.length;i++) {
			System.out.println(array[i]);
		}
	
	//how can we find how many sentences are in the following string,
		
	String s1=" Today is Sunny.Its sunny day.and we are having java class";
	
	String[] array2=s1.split("\\.");
	System.out.println(array2.length); //its gonna 3 we have 2 point but after 2 . we have 3 pieces
	
	
	for (String string : array2) {
		System.out.println(string.trim());
	}
	
	
		
		
		
		
		
		
		
		
	}

}
