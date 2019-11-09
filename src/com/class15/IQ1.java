package com.class15;

public class IQ1 {

	public static void main(String[] args) {

		//1=swap to numbers without a temporary variable and for string 
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("The value of a "+a); //20
		System.out.println("The value of b "+b); //10 
		
		String str1="Hello";
		String str2="Welcome";
		
		str1=str1+str2; //-->HelloBye
		                   //0, 12         -7 =5
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
		
		
		
	}

}
