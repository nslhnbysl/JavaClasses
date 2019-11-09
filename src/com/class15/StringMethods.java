package com.class15;

public class StringMethods {

	public static void main(String[] args) {

		//replace
		
		String str="Java classes at Syntax are awesome";
		
		str=str.replace("awesome", "great");
		
		System.out.println(str);
		
		str=str.replace("Git", "SDLC");
		System.out.println(str); //-->Java classes at Syntax are great its gonna give last str value 
		
		str=str.replace("a", "2345!@#$$$");
		System.out.println(str);
		//replaceAll-->specify regular expression 
		
		//lets remove all special characters 
		
		str=str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(str);
		
		
		//split
		String myString="Java classes at Syntax are awesome";
		String []array=myString.split("c");//cut from c and remove to c 
		System.out.println(array.length); //2
		
		
		
		
		
		
		
		
	}

}
