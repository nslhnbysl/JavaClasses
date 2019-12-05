package com.class27;

public class FinalKeyword {
	
	public static final String str="Hello";
	
	
	

	public static void main(String[] args) {
	
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";
		//finalString="Java is hard"; -->gives an error because this variable is final this keyword gives us it is a final value so we cannot change the value 
		
		}
	public final void hello() {
		System.out.println("I am a final method in parent class");
	}
	
	public final void hello(String str) {
		System.out.println("I am a final method in parent class with one string parameter");
	}
	public final void hello(String str,int a) {
		System.out.println("I am a final method in parent class with one string parameter and one int parameter");
	}
	
}

class FinalKeywordChild extends FinalKeyword{
//	public final void hello() {
//		   -->cannot override the final keyword method
//	}
	
	
}
