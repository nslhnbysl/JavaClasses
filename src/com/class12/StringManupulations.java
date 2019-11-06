package com.class12;

public class StringManupulations {

	public static void main(String[] args) {

		// String is a Java class

		// 1st way to declare String Objects
		String name = "John"; // string Literal

		// 2nd way
		String name1 = new String("John"); // creating string with new keyboard
		
		
		
		
		/*  length()-->  this method returns the length of this string
		 * the length is equal to the number
		 * of 16-bit unicode characters in the string.
		 */
		
		System.out.println(name.length());//1st way its gonna give 4
		
		int name1Len=name.length();
		System.out.println(name1Len);   //2nd way 
		
		String str1="Hello world";
		System.out.println("Before:"+str1);
		
		//String newValOfstr1=str1.toLowerCase();
		str1=str1.toLowerCase();    //newValOfstr1
		System.out.println("After:"+str1);
		
		//.equals()
		//this method will count everyting such capitilization and content 
		String str2="HElLo WoRld";
		
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		//.equalsIgnoreCase();
		//this method does not care for capitalization and compare the content only 
		System.out.println(str1.equalsIgnoreCase(str2));
		
		/*toUpperCase();
		 * This method converts all of the characters in this string 
		 * 
		 */
		String str3="Mohammad";
		System.out.println("Before:"+str3);
		str3=str3.toUpperCase();
		System.out.println("After:"+str3);
		
	}

}
