package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}

ThisWithConstructor(String str){
	this(); //used to call current class constructor--calls the constructor with no argument
	System.out.println("I am constructor with 1 string parameters");
}
ThisWithConstructor(String str,String str1){
	this("Hello");
	System.out.println("I am a constructor with 2 parameters");
	
}
public static void main(String[] args) {
	
	ThisWithConstructor obj=new ThisWithConstructor("Hello");
	//can we execute 2 constructors when creating an object
	//yes-it can be achieved using this()
	//this type of constructor calls is known as CONSTRUCTOR CHAINING
	System.out.println("__________");
	
	ThisWithConstructor obj1=new ThisWithConstructor();
	System.out.println("____________");
	
	ThisWithConstructor obj2=new ThisWithConstructor("hello","nes");
	
	
	
	
	
	
	
	
}
}