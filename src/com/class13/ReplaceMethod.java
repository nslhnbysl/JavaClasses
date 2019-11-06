package com.class13;

public class ReplaceMethod {

	public static void main(String[] args) {

		//REPLACE 
		
		String str="Hello Dear,How are you?";
		System.out.println(str.replace('e', 'z'));       //Hzllo Dzar,How arz you? will replace all e to z
		System.out.println(str.replace("Hello", "Bye")); //Bye Dear,How are you?
		
		System.out.println(str.replace(" ", ""));        //HelloDear,Howareyou?
		
		
		//REPLACE FIRST
		
		String str1="Hello Dear Ben,how are you Ben,how you been";
		System.out.println(str1.replaceFirst("Ben","Ali" )); //Hello Dear Ali,how are you Ben,how you been
		                                                     //just will replace first Dear to Ali , and will not replace others
		//REPLACE ALL
		                                   //regular expression is sequance of characters
		//System.out.println(str1.replaceAll(regex, replacement));
		
		
		
		
		
		
		
		
		
		
		
	}

}
