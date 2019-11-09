package com.class16;

public class IQ5 {

	public static void main(String[] args) {

	//5-write a java program to reverse string?
	//Reverse a string word by word?
		
		String given="Welcome to the Java class";
		
		/*to reverse string
		 * step1:split-->array of string
		 * step 2:use for loop and use decrement to print values 
		 */
		
		String reversed="";
		String[]str=given.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			reversed=reversed+str[i]+" ";
		}
		
		System.out.println(reversed);
		
		//write a java program to reverse String?
		//tochararray();charAt();
		
		System.out.println("1st way_____");
		
		String given1="Today is Java class";
		String replaced1="";
		char[]charArray=given1.toCharArray();
		for(int i=charArray.length-1;i<=0;i--) {
			replaced1=replaced1+charArray[i];
		}
		System.out.println(replaced1);
		
		///2nd way 
		System.out.println("2nd way______");
		
		String word3="I love JAVA";
		String reversed2="";
		for(int i=word3.length()-1;i>=0;i--) {
			reversed2=reversed2+word3.charAt(i);
		}
		
		System.out.println(reversed2);
		
		
		
		
	}

}
